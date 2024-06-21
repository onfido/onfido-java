package com.onfido.integration;

import com.onfido.ApiException;
import com.onfido.FileTransfer;
import com.onfido.model.Applicant;
import com.onfido.model.LivePhoto;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LivePhotoTest extends TestBase {

  private Applicant applicant;
  private LivePhoto livePhoto;

  @BeforeEach
  public void setupTest() throws Exception {
    applicant = createApplicant();
    livePhoto = uploadLivePhoto(applicant, "sample_photo.png");
  }

  @Test
  public void uploadLivePhotoTest() throws Exception {
    Assertions.assertEquals("sample_photo.png", livePhoto.getFileName());
  }

  @Test
  public void downloadLivePhotoTest() throws Exception {
    FileTransfer download = onfido.downloadLivePhoto(livePhoto.getId());

    Assertions.assertEquals("image/png", download.getContentType());
    Assertions.assertEquals("sample_photo.png", download.getFilename());
    Assertions.assertTrue(download.getByteArray().length > 0);
  }

  @Test
  public void downloadErrorTest() throws Exception {
    try {
      onfido.downloadLivePhoto(nonExistingId);
      Assertions.fail();
    } catch (ApiException ex) {
      Assertions.assertEquals(404, ex.getCode());
    }
  }

  @Test
  public void findLivePhotoTest() throws Exception {
    LivePhoto lookupLivePhoto = onfido.findLivePhoto(livePhoto.getId());

    Assertions.assertEquals("sample_photo.png", lookupLivePhoto.getFileName());
  }

  @Test
  public void listLivePhotosTest() throws Exception {
    uploadLivePhoto(applicant, "another_sample_photo.png");

    List<LivePhoto> livePhotos =
        onfido.listLivePhotos(applicant.getId()).getLivePhotos().stream()
            .sorted(Comparator.comparing(LivePhoto::getFileName))
            .collect(Collectors.toList());

    Assertions.assertEquals("another_sample_photo.png", livePhotos.get(0).getFileName());
    Assertions.assertEquals("sample_photo.png", livePhotos.get(1).getFileName());
  }
}
