package com.onfido.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.api.FileDownload;
import com.onfido.exceptions.ApiException;
import com.onfido.models.Applicant;
import com.onfido.models.LivePhoto;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.io.File;
import java.io.FileInputStream;
import java.util.Comparator;
import java.util.stream.Collectors;

import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LivePhotoManagerTest extends TestBase {

  private Applicant applicant;
  private LivePhoto livePhoto;

  @BeforeMethod
  public void setupTest() throws Exception {
    applicant = createApplicant();
    livePhoto = uploadLivePhoto(applicant, "file.png");
  }

  private LivePhoto uploadLivePhoto(LivePhoto.Request livePhotoRequest, String filename) throws Exception {
    prepareMock(new JsonObject().add("file_name", filename)
                                .add("id", UUID.randomUUID().toString()));

    File file = new File("media/sample_photo.png");
    InputStream inputStream = new FileInputStream(file);

    LivePhoto livePhoto = onfido.livePhoto.upload(inputStream, filename, livePhotoRequest);
    takeRequest("/live_photos/");

    return livePhoto;
  }

  private LivePhoto uploadLivePhoto(Applicant applicant, String filename) throws Exception {
    LivePhoto livePhoto = uploadLivePhoto(LivePhoto.request()
                                            .applicantId(applicant.getId())
                                            .advancedValidation(true),
                                          filename);

    assertRequestBodyContains("applicant_id");
    assertRequestBodyContains(applicant.getId());
    assertRequestBodyContains("advanced_validation");
    assertRequestBodyContains("true");

    return livePhoto;
  }

  @Test
  public void uploadLivePhotoTest() throws Exception {
    assertEquals("file.png", livePhoto.getFileName());
  }

  @Test
  public void downloadLivePhotoTest() throws Exception {
    prepareMock("test", "image/png", 200);

    FileDownload download = onfido.livePhoto.download(livePhoto.getId());

    takeRequest("/live_photos/" + livePhoto.getId() + "/download");

    assertTrue(download.content.length > 0);
    assertEquals("image/png", download.contentType);
  }

  @Test
  public void downloadErrorTest() throws Exception {
    prepareMock("error", "image/png", 404);

    try {
      onfido.livePhoto.download("wrong-id");
      Assert.fail();
    } catch (ApiException ex) {
      takeRequest("/live_photos/wrong-id/download");
      Assert.assertEquals(404, ex.getStatusCode());
    }
  }

  @Test
  public void findLivePhotoTest() throws Exception {
    prepareMock(new JsonObject().add("file_name", "file.png")
                                .add("id", livePhoto.getId()));

    LivePhoto lookupLivePhoto = onfido.livePhoto.find(livePhoto.getId());

    takeRequest("/live_photos/" + livePhoto.getId());

    assertEquals("file.png", lookupLivePhoto.getFileName());
  }

  @Test
  public void listLivePhotosTest() throws Exception {
    LivePhoto anotherLivePhoto = uploadLivePhoto(applicant, "anotherFile.png");

    prepareMock(new JsonObject()
      .add("live_photos",
                Arrays.asList(
                    new JsonObject().add("file_name", "anotherFile.png").map,
                    new JsonObject().add("file_name", "file.png").map)));

    List<LivePhoto> livePhotos = onfido.livePhoto.list(applicant.getId()).stream()
                                                 .sorted(Comparator.comparing(LivePhoto::getFileName))
                                                 .collect(Collectors.toList());

    takeRequest("/live_photos/?applicant_id=" + applicant.getId());

    assertEquals("anotherFile.png", livePhotos.get(0).getFileName());
    assertEquals("file.png", livePhotos.get(1).getFileName());
  }

  @Test
  public void nullParamRequestTest() throws Exception {
    prepareMock("error", null, 404);

    InputStream inputStream = new ByteArrayInputStream("testing testing 1 2".getBytes());

    try {
      onfido.livePhoto.upload(inputStream, "file.png", LivePhoto.request());
      Assert.fail();
    } catch (ApiException ex) {
      takeRequest("/live_photos/");
      Assert.assertEquals(404, ex.getStatusCode());
    }
  }
}
