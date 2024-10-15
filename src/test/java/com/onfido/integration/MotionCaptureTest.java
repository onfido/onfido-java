package com.onfido.integration;

import com.onfido.ApiException;
import com.onfido.FileTransfer;
import com.onfido.model.MotionCapture;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotionCaptureTest extends TestBase {

  private static final UUID EXAMPLE_ID_1 =
      UUID.fromString(System.getenv("ONFIDO_SAMPLE_MOTION_ID_1"));

  @Test
  public void downloadMotionCaptureTest() throws Exception {
    FileTransfer download = onfido.downloadMotionCapture(EXAMPLE_ID_1);

    Assertions.assertEquals("video/mp4", download.getContentType());
    Assertions.assertTrue(download.getFilename() != null);
    Assertions.assertTrue(download.getByteArray().length > 0);
  }

  @Test
  public void downloadMotionCaptureFrameTest() throws Exception {
    try {
      FileTransfer download = onfido.downloadMotionCaptureFrame(EXAMPLE_ID_1);
      byte[] byteArray = download.getByteArray();

      Assertions.assertEquals("image/jpeg", download.getContentType());
      Assertions.assertTrue(download.getFilename() != null);
      Assertions.assertTrue(byteArray.length > 0);
      Assertions.assertEquals("JFIF", new String(byteArray, 6, 4));
    } catch (ApiException ex) {
      Assertions.assertEquals(422, ex.getCode());
      Assertions.assertEquals(
          "Failed to extract a frame from the provided motion capture (status code 422)",
          ex.getMessage());
    }
  }

  @Test
  public void downloadErrorTest() throws Exception {
    try {
      onfido.downloadMotionCapture(nonExistingId);
      Assertions.fail();
    } catch (ApiException ex) {
      Assertions.assertEquals(404, ex.getCode());
    }
  }

  @Test
  public void findMotionCaptureTest() throws Exception {
    String expectedFilename = EXAMPLE_ID_1 + ".mp4";

    MotionCapture motionCapture = onfido.findMotionCapture(EXAMPLE_ID_1);

    Assertions.assertEquals(expectedFilename, motionCapture.getFileName());

    Assertions.assertNotNull(motionCapture.toJson());
  }

  @Test
  public void listMotionCapturesTest() throws Exception {
    List<MotionCapture> motionCaptures =
        onfido.listMotionCaptures(sampleApplicantId).getMotionCaptures();

    Assertions.assertEquals(2, motionCaptures.size());

    Assertions.assertNotNull(motionCaptures.get(0).toJson());
    Assertions.assertNotNull(motionCaptures.get(1).toJson());
  }
}
