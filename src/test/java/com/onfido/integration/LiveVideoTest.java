package com.onfido.integration;

import com.onfido.ApiException;
import com.onfido.FileTransfer;
import com.onfido.model.LiveVideo;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LiveVideoTest extends TestBase {

  private static UUID sampleLiveVideoId1 =
      UUID.fromString(System.getenv("ONFIDO_SAMPLE_VIDEO_ID_1"));

  @Test
  public void downloadLiveVideoTest() throws Exception {
    FileTransfer download = onfido.downloadLiveVideo(sampleLiveVideoId1).execute();

    Assertions.assertEquals("video/quicktime", download.getContentType());
    Assertions.assertEquals("video.mov", download.getFilename());
    Assertions.assertTrue(download.getByteArray().length > 0);
  }

  @Test
  public void downloadLiveVideoFrameTest() throws Exception {
    try {
      FileTransfer download = onfido.downloadLiveVideoFrame(sampleLiveVideoId1).execute();

      Assertions.assertEquals("image/jpeg", download.getContentType());
      Assertions.assertTrue(download.getFilename() != null);
      Assertions.assertEquals("JFIF", new String(download.getByteArray(), 6, 4));
    } catch (ApiException ex) {
      Assertions.assertEquals(422, ex.getCode());
      Assertions.assertEquals(
          "Failed to extract a frame from the provided video (status code 422)", ex.getMessage());
    }
  }

  @Test
  public void downloadErrorTest() throws Exception {
    try {
      onfido.downloadLiveVideo(nonExistingId).execute();
      Assertions.fail();
    } catch (ApiException ex) {
      Assertions.assertEquals(404, ex.getCode());
    }
  }

  @Test
  public void findLiveVideoTest() throws Exception {
    LiveVideo liveVideo = onfido.findLiveVideo(sampleLiveVideoId1).execute();

    Assertions.assertEquals("video.mov", liveVideo.getFileName());

    Assertions.assertNotNull(liveVideo.toJson());
  }

  @Test
  public void listLiveVideosTest() throws Exception {
    List<LiveVideo> liveVideos = onfido.listLiveVideos(sampleApplicantId).execute().getLiveVideos();

    Assertions.assertEquals("video.mov", liveVideos.get(0).getFileName());
    Assertions.assertEquals("video.mov", liveVideos.get(1).getFileName());

    Assertions.assertNotNull(liveVideos.get(0).toJson());
    Assertions.assertNotNull(liveVideos.get(1).toJson());
  }
}
