package com.onfido.integration;

import com.onfido.ApiException;
import com.onfido.model.Applicant;
import com.onfido.model.IdPhoto;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IdPhotoTest extends TestBase {

  private Applicant applicant;
  private IdPhoto idPhoto;

  @BeforeEach
  public void setupTest() throws Exception {
    applicant = createApplicant();
    idPhoto = uploadIdPhoto(applicant, "sample_photo.png");
  }

  @Test
  public void uploadIdPhotoTest() throws Exception {
    Assertions.assertEquals(idPhoto.getId() + ".png", idPhoto.getFileName());
  }

  @Test
  public void downloadIdPhotoTest() throws Exception {
    File download = onfido.downloadIdPhoto(idPhoto.getId());

    Assertions.assertTrue(download.length() > 0);
  }

  @Test
  public void downloadErrorTest() throws Exception {
    try {
      onfido.downloadIdPhoto(nonExistingId);
      Assertions.fail();
    } catch (ApiException ex) {
      Assertions.assertEquals(404, ex.getCode());
    }
  }

  @Test
  public void findIdPhotoTest() throws Exception {
    IdPhoto lookupIdPhoto = onfido.findIdPhoto(idPhoto.getId());

    Assertions.assertEquals(idPhoto.getId() + ".png", lookupIdPhoto.getFileName());
  }

  @Test
  public void listIdPhotosTest() throws Exception {
    uploadIdPhoto(applicant, "another_sample_photo.png");

    List<IdPhoto> idPhotos =
        onfido.listIdPhotos(applicant.getId()).getIdPhotos().stream()
            .sorted(Comparator.comparing(IdPhoto::getFileName))
            .collect(Collectors.toList());

    Assertions.assertEquals(idPhotos.get(0).getId() + ".png", idPhotos.get(0).getFileName());
    Assertions.assertEquals(idPhotos.get(1).getId() + ".png", idPhotos.get(1).getFileName());
  }
}
