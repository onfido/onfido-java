package com.onfido.integration;

import com.onfido.JsonObject;
import com.onfido.api.FileDownload;
import com.onfido.exceptions.ApiException;
import com.onfido.models.MotionCapture;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MotionCaptureManagerTest extends TestBase {

  static private final String EXAMPLE_ID_1 = System.getenv("ONFIDO_SAMPLE_MOTION_ID_1");
  static private final String NON_EXISTING_ID = "00000000-0000-0000-0000-000000000000";

  @Test
  public void downloadMotionCaptureTest() throws Exception {
    prepareMock("test", "video/mp4", 200);

    FileDownload download = onfido.getMotionCaptureManager().download(EXAMPLE_ID_1);

    takeRequest("/motion_captures/" + EXAMPLE_ID_1 + "/download");

    assertTrue(download.content.length > 0);
    assertTrue(download.contentType.contains("video/mp4"));
  }

  @Test
  public void downloadMotionCaptureFrameTest() throws Exception {
    prepareMock("test", "image/jpeg", 200);

    try {
      FileDownload download = onfido.getMotionCaptureManager().downloadFrame(EXAMPLE_ID_1);
      takeRequest("/motion_captures/" + EXAMPLE_ID_1 + "/frame");

      assertTrue(download.contentType.contains("image/jpeg"));
    } catch (ApiException ex) {
      Assert.assertFalse(isMockingEnabled());
      Assert.assertEquals(422, ex.getStatusCode());
      Assert.assertEquals("Failed to extract a frame from the provided motion capture (status code 422)", ex.getMessage());
    }
  }

  @Test
  public void downloadErrorTest() throws Exception {
    prepareMock("error", "video/mp4", 404);

    try {
      onfido.getMotionCaptureManager().download(NON_EXISTING_ID);
      Assert.fail();
    } catch (ApiException ex) {
      takeRequest(String.format("/motion_captures/%s/download", NON_EXISTING_ID));
      Assert.assertEquals(404, ex.getStatusCode());
    }
  }

  @Test
  public void findMotionCaptureTest() throws Exception {
    String expectedFilename = EXAMPLE_ID_1 + ".mp4";

    prepareMock(new JsonObject().add("file_name", expectedFilename));

    MotionCapture motionCapture = onfido.getMotionCaptureManager().find(EXAMPLE_ID_1);

    takeRequest("/motion_captures/" + EXAMPLE_ID_1);
    assertEquals(expectedFilename, motionCapture.getFileName());
  }

  @Test
  public void listMotionCapturesTest() throws Exception {
    prepareMock(new JsonObject().add("motion_captures",
                                     Arrays.asList(
                                       new JsonObject().add("id", "id-1").map,
                                       new JsonObject().add("id", "id-2").map)));

    List<MotionCapture> motionCaptures = onfido.getMotionCaptureManager().list(sampleApplicantId);

    takeRequest("/motion_captures/?applicant_id=" + sampleApplicantId);

    assertEquals(2, motionCaptures.size());
  }
}
