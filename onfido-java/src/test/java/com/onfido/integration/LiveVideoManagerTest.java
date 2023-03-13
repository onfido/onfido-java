package com.onfido.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.api.FileDownload;
import com.onfido.exceptions.ApiException;
import com.onfido.models.LiveVideo;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Assert;
import org.testng.annotations.Test;

public class LiveVideoManagerTest extends TestBase {

  static private String sampleLiveVideoId1 = System.getenv("ONFIDO_SAMPLE_VIDEO_ID_1");
  static private String sampleLiveVideoId2 = System.getenv("ONFIDO_SAMPLE_VIDEO_ID_2");

  @Test
  public void downloadLiveVideoTest() throws Exception {
    prepareMock("test", "video/quicktime", 200);

    FileDownload download = onfido.liveVideo.download(sampleLiveVideoId1);

    takeRequest("/live_videos/" + sampleLiveVideoId1 + "/download");

    assertTrue(download.content.length > 0);
    assertEquals("video/quicktime", download.contentType);
  }

  @Test
  public void downloadLiveVideoFrameTest() throws Exception {
    prepareMock("<[����JFIF��C...", "image/jpeg", 200);

    try {
      FileDownload download = onfido.liveVideo.downloadFrame(sampleLiveVideoId1);
      takeRequest("/live_videos/" + sampleLiveVideoId1 + "/frame");

      assertTrue(new String(download.content).contains("JFIF"));
      assertEquals("image/jpeg", download.contentType);
    } catch (ApiException ex) {
      Assert.assertFalse(isMockingEnabled());
      Assert.assertEquals(422, ex.getStatusCode());
      Assert.assertEquals("Failed to extract a frame from the provided video (status code 422)", ex.getMessage());
    }
  }

  @Test
  public void downloadErrorTest() throws Exception {
    prepareMock("error", "video/quicktime", 404);

    try {
      onfido.liveVideo.download("wrong-id");
      Assert.fail();
    } catch (ApiException ex) {
      takeRequest("/live_videos/wrong-id/download");
      Assert.assertEquals(404, ex.getStatusCode());
    }
  }

  @Test
  public void findLiveVideoTest() throws Exception {
    prepareMock(new JsonObject().add("file_name", "video.mov"));

    LiveVideo liveVideo = onfido.liveVideo.find(sampleLiveVideoId1);

    takeRequest("/live_videos/" + sampleLiveVideoId1);

    assertEquals("video.mov", liveVideo.getFileName());
  }

  @Test
  public void listLiveVideosTest() throws Exception {
    prepareMock(new JsonObject().add("live_videos",
                                     Arrays.asList(
                                       new JsonObject().add("file_name", "video.mov").map,
                                       new JsonObject().add("file_name", "video.mov").map)));

    List<LiveVideo> liveVideos = onfido.liveVideo.list(sampleApplicantId);

    takeRequest("/live_videos/?applicant_id=" + sampleApplicantId);

    assertEquals("video.mov", liveVideos.get(0).getFileName());
    assertEquals("video.mov", liveVideos.get(1).getFileName());
  }
}
