package com.onfido.integration;

import static org.junit.Assert.assertEquals;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.api.FileDownload;
import com.onfido.exceptions.ApiException;
import com.onfido.models.LiveVideo;
import java.util.Arrays;
import java.util.List;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Assert;
import org.testng.annotations.Test;

public class LiveVideoManagerTest extends ApiIntegrationTest {

  @Test
  public void downloadLiveVideo() throws Exception {
    MockWebServer server = mockFileRequestResponse("test", "video/mp4");

    Onfido onfido =
        Onfido.builder().apiToken("token").unknownApiUrl(server.url("/").toString()).build();

    FileDownload download = onfido.liveVideo.download("live_video_id");

    // Correct path
    RecordedRequest request = server.takeRequest();
    assertEquals("/live_videos/live_video_id/download", request.getPath());

    // Correct response body
    assertEquals("test", new String(download.content));
    assertEquals("video/mp4", download.contentType);
  }

  @Test
  public void downloadLiveVideoFrame() throws Exception {
    MockWebServer server = mockFileRequestResponse("test", "image/png");

    Onfido onfido =
        Onfido.builder().apiToken("token").unknownApiUrl(server.url("/").toString()).build();

    FileDownload download = onfido.liveVideo.downloadFrame("live_video_id");

    // Correct path
    RecordedRequest request = server.takeRequest();
    assertEquals("/live_videos/live_video_id/frame", request.getPath());

    // Correct response body
    assertEquals("test", new String(download.content));
    assertEquals("image/png", download.contentType);
  }

  @Test
  public void downloadError() throws Exception {
    MockWebServer server = mockErrorResponse("error");

    Onfido onfido =
        Onfido.builder().apiToken("token").unknownApiUrl(server.url("/").toString()).build();

    try {
      onfido.liveVideo.download("live video id");
      Assert.fail();
    } catch (ApiException ex) {
      Assert.assertEquals(403, ex.getStatusCode());
    }
  }

  @Test
  public void findLiveVideo() throws Exception {
    String response = new JsonObject().add("file_name", "file.png").toJson();

    MockWebServer server = mockRequestResponse(response);

    Onfido onfido =
        Onfido.builder().apiToken("token").unknownApiUrl(server.url("/").toString()).build();

    LiveVideo liveVideo = onfido.liveVideo.find("id");

    // Correct path
    RecordedRequest request = server.takeRequest();
    assertEquals("/live_videos/id", request.getPath());

    // Correct response body
    assertEquals("file.png", liveVideo.getFileName());
  }

  @Test
  public void listLiveVideos() throws Exception {
    String response =
        new JsonObject()
            .add(
                "live_videos",
                Arrays.asList(
                    new JsonObject().add("file_name", "file1.png").map,
                    new JsonObject().add("file_name", "file2.png").map))
            .toJson();

    MockWebServer server = mockRequestResponse(response);

    Onfido onfido =
        Onfido.builder().apiToken("token").unknownApiUrl(server.url("/").toString()).build();

    List<LiveVideo> liveVideos = onfido.liveVideo.list("id");

    // Correct path
    RecordedRequest request = server.takeRequest();
    assertEquals("/live_videos/?applicant_id=id", request.getPath());

    // Correct response body
    assertEquals("file1.png", liveVideos.get(0).getFileName());
    assertEquals("file2.png", liveVideos.get(1).getFileName());
  }
}
