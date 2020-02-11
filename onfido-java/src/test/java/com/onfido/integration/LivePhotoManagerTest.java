package com.onfido.integration;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.exceptions.ApiException;
import com.onfido.models.LivePhoto;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LivePhotoManagerTest extends ApiIntegrationTest {

  @Test
  public void uploadLivePhoto() throws Exception {
    String response = new JsonObject().add("file_name", "file.png").toJson();

    MockWebServer server = mockRequestResponse(response);

    Onfido onfido =
        Onfido.builder().apiToken("token").unknownApiUrl(server.url("/").toString()).build();

    InputStream inputStream = new ByteArrayInputStream("testing testing 1 2".getBytes());
    LivePhoto.Request livePhotoRequest =
        LivePhoto.request().applicantId("test id").advancedValidation(true);
    LivePhoto livePhoto = onfido.livePhoto.upload(inputStream, "file.png", livePhotoRequest);

    // Correct path
    RecordedRequest request = server.takeRequest();
    assertEquals("/live_photos/", request.getPath());

    // Correct request body
    String requestBody = request.getBody().readUtf8();
    Assert.assertTrue(requestBody.contains("applicant_id"));
    Assert.assertTrue(requestBody.contains("test id"));
    Assert.assertTrue(requestBody.contains("advanced_validation"));
    Assert.assertTrue(requestBody.contains("true"));

    // Correct response body
    assertEquals("file.png", livePhoto.getFileName());
  }

  @Test
  public void downloadLivePhoto() throws Exception {
    MockWebServer server = mockFileRequestResponse();

    Onfido onfido =
        Onfido.builder().apiToken("token").unknownApiUrl(server.url("/").toString()).build();

    InputStream inputStream = onfido.livePhoto.download("live photo id").content;

    // Correct path
    RecordedRequest request = server.takeRequest();
    assertEquals("/live_photos/live%20photo%20id/download", request.getPath());

    // Correct response body
    assertNotNull(inputStream);
  }

  @Test
  public void downloadError() throws Exception {
    MockWebServer server = mockErrorResponse("error");

    Onfido onfido =
        Onfido.builder().apiToken("token").unknownApiUrl(server.url("/").toString()).build();

    try {
      onfido.livePhoto.download("live photo id");
      Assert.fail();
    } catch (ApiException ex) {
      Assert.assertEquals(403, ex.getStatusCode());
    }
  }

  @Test
  public void findLivePhoto() throws Exception {
    String response = new JsonObject().add("file_name", "file.png").toJson();

    MockWebServer server = mockRequestResponse(response);

    Onfido onfido =
        Onfido.builder().apiToken("token").unknownApiUrl(server.url("/").toString()).build();

    LivePhoto livePhoto = onfido.livePhoto.find("id");

    // Correct path
    RecordedRequest request = server.takeRequest();
    assertEquals("/live_photos/id", request.getPath());

    // Correct response body
    assertEquals("file.png", livePhoto.getFileName());
  }

  @Test
  public void listLivePhotos() throws Exception {
    String response =
        new JsonObject()
            .add(
                "live_photos",
                Arrays.asList(
                    new JsonObject().add("file_name", "file1.png").map,
                    new JsonObject().add("file_name", "file2.png").map))
            .toJson();

    MockWebServer server = mockRequestResponse(response);

    Onfido onfido =
        Onfido.builder().apiToken("token").unknownApiUrl(server.url("/").toString()).build();

    List<LivePhoto> livePhotos = onfido.livePhoto.list("id");

    // Correct path
    RecordedRequest request = server.takeRequest();
    assertEquals("/live_photos/?applicant_id=id", request.getPath());

    // Correct response body
    assertEquals("file1.png", livePhotos.get(0).getFileName());
    assertEquals("file2.png", livePhotos.get(1).getFileName());
  }

  @Test
  public void nullParamRequest() throws Exception {
    String response = new JsonObject().add("file_name", "file.png").toJson();

    MockWebServer server = mockRequestResponse(response);

    Onfido onfido =
        Onfido.builder().apiToken("token").unknownApiUrl(server.url("/").toString()).build();

    InputStream inputStream = new ByteArrayInputStream("testing testing 1 2".getBytes());
    LivePhoto.Request livePhotoRequest = LivePhoto.request();
    LivePhoto livePhoto = onfido.livePhoto.upload(inputStream, "file.png", livePhotoRequest);

    // Correct path
    RecordedRequest request = server.takeRequest();
    assertEquals("/live_photos/", request.getPath());

    // Correct response body
    assertEquals("file.png", livePhoto.getFileName());
  }
}
