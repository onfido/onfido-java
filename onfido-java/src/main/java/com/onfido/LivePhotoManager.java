package com.onfido;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.FileDownload;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.LivePhoto;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.List;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;

/**
 * Manager class for the Live photo resource type. Contains resource-specific methods for
 * interacting with the API.
 */
public class LivePhotoManager extends ResourceManager {
  private ApiJson<LivePhoto> livePhotoParser = new ApiJson<>(LivePhoto.class);

  protected LivePhotoManager(Config config, OkHttpClient client) {
    super("live_photos/", config, client);
  }

  /**
   * Uploads a live photo as part of a multipart request.
   *
   * @param inputStream the content from the desired file as an InputStream
   * @param fileName the file name, including the file extension
   * @param request the request body
   * @return the live photo
   * @throws IOException the io exception
   * @throws OnfidoException the onfido exception
   */
  public LivePhoto upload(InputStream inputStream, String fileName, LivePhoto.Request request)
      throws IOException, OnfidoException {

    MultipartBody.Builder builder = new MultipartBody.Builder().setType(MultipartBody.FORM);

    addFormDataParam(builder, "applicant_id", request.getApplicantId());
    addFormDataParam(builder, "advanced_validation", request.getAdvancedValidation());

    builder.addFormDataPart(
        "file",
        fileName,
        RequestBody.create(
            readInputStream(inputStream),
            MediaType.get(URLConnection.guessContentTypeFromName(fileName))));

    return livePhotoParser.parse(uploadRequest("", builder.build()));
  }

  /**
   * Downloads a live photo.
   *
   * @param livePhotoId the live photo id
   * @return the downloaded file as a FileDownload
   * @throws OnfidoException the onfido exception
   */
  public FileDownload download(String livePhotoId) throws OnfidoException {
    return downloadRequest(livePhotoId + "/download");
  }

  /**
   * Retrieves a single live photo.
   *
   * @param livePhotoId the live photo id
   * @return the LivePhoto
   * @throws OnfidoException the onfido exception
   */
  public LivePhoto find(String livePhotoId) throws OnfidoException {
    return livePhotoParser.parse(get(livePhotoId));
  }

  /**
   * Lists the live photos that belong to an applicant.
   *
   * @param applicantId the applicant id
   * @return the list of LivePhotos
   * @throws OnfidoException the onfido exception
   */
  public List<LivePhoto> list(String applicantId) throws OnfidoException {
    return livePhotoParser.parseWrappedList(get("?applicant_id=" + applicantId), "live_photos");
  }
}
