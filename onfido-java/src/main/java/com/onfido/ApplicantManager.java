package com.onfido;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.Applicant;
import java.util.List;
import okhttp3.OkHttpClient;

/**
 * Manager class for the Applicant resource type. Contains resource-specific methods for interacting
 * with the API.
 */
public class ApplicantManager extends ResourceManager {
  private ApiJson<Applicant> applicantParser = new ApiJson<>(Applicant.class);
  private ApiJson<Applicant.Request> requestFormatter = new ApiJson<>(Applicant.Request.class);

  /**
   * Instantiates a new ApplicantManager.
   *
   * @param config the configuration of the parent Onfido object
   */
  protected ApplicantManager(Config config, OkHttpClient client) {
    super("applicants/", config, client);
  }

  /**
   * Creates a single applicant.
   *
   * @param request the request body
   * @return an Applicant
   * @throws OnfidoException the onfido exception
   */
  public Applicant create(Applicant.Request request) throws OnfidoException {
    return applicantParser.parse(post("", requestFormatter.toJson(request)));
  }

  /**
   * Retrieves a single applicant.
   *
   * @param applicantId the applicant id
   * @return an Applicant
   * @throws OnfidoException the onfido exception
   */
  public Applicant find(String applicantId) throws OnfidoException {
    return applicantParser.parse(get(applicantId));
  }

  /**
   * Updates an applicant’s information.
   *
   * @param applicantId the applicant id
   * @param request the request body
   * @return an Applicant
   * @throws OnfidoException the onfido exception
   */
  public Applicant update(String applicantId, Applicant.Request request) throws OnfidoException {
    return applicantParser.parse(put(applicantId, requestFormatter.toJson(request)));
  }

  /**
   * Deletes a single applicant. If successful, returns a 204 No Content response.
   *
   * @param applicantId the applicant id
   * @throws OnfidoException the onfido exception
   */
  public void delete(String applicantId) throws OnfidoException {
    deleteRequest(applicantId);
  }

  /**
   * Restores a single applicant scheduled for deletion. If successful, returns a 204 No Content
   * response.
   *
   * @param applicantId the applicant id
   * @throws OnfidoException the onfido exception
   */
  public void restore(String applicantId) throws OnfidoException {
    post(applicantId + "/restore", "");
  }

  /**
   * Lists all applicants you’ve created, sorted by creation date in descending order.
   *
   * @param page the page
   * @param perPage the amount of applicants per page
   * @param includedDeleted boolean to include applicants scheduled for deletion
   * @return the list of Applicants
   * @throws OnfidoException the onfido exception
   */
  public List<Applicant> list(int page, int perPage, boolean includedDeleted)
      throws OnfidoException {
    return applicantParser.parseWrappedList(
        get("?page=" + page + "&per_page=" + perPage + "&include_deleted=" + includedDeleted),
        "applicants");
  }
}
