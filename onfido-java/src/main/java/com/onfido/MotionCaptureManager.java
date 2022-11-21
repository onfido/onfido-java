package com.onfido;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.FileDownload;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.MotionCapture;
import okhttp3.OkHttpClient;

import java.util.List;

/**
 * Manager class for the Motion capture resource type. Contains resource-specific methods for
 * interacting with the API.
 */
public class MotionCaptureManager extends ResourceManager {
  private final ApiJson<MotionCapture> motionCaptureParser = new ApiJson<>(MotionCapture.class);

  protected MotionCaptureManager(Config config, OkHttpClient client) {
    super("motion_captures/", config, client);
  }

  /**
   * Downloads a motion capture.
   *
   * @param motionCaptureId the motion capture id
   * @return the downloaded file as a FileDownload
   * @throws OnfidoException the onfido exception
   */
  public FileDownload download(String motionCaptureId) throws OnfidoException {
    return downloadRequest(motionCaptureId + "/download");
  }

  /**
   * Instead of the whole motion capture, a single frame can be downloaded.
   *
   * @param motionCaptureId the motion capture id
   * @return the downloaded file as a FileDownload
   * @throws OnfidoException the onfido exception
   */
  public FileDownload downloadFrame(String motionCaptureId) throws OnfidoException {
    return downloadRequest(motionCaptureId + "/frame");
  }

  /**
   * Retrieves a single motion capture.
   *
   * @param motionCaptureId the motion capture id
   * @return the MotionCapture
   * @throws OnfidoException the onfido exception
   */
  public MotionCapture find(String motionCaptureId) throws OnfidoException {
    return motionCaptureParser.parse(get(motionCaptureId));
  }

  /**
   * Lists all the live videos that belong to an applicant.
   *
   * @param applicantId the applicant id
   * @return the list of MotionCaptures
   * @throws OnfidoException the onfido exception
   */
  public List<MotionCapture> list(String applicantId) throws OnfidoException {
    return motionCaptureParser.parseWrappedList(get("?applicant_id=" + applicantId), "motion_captures");
  }
}
