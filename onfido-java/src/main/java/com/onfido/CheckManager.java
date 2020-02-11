package com.onfido;

import com.onfido.api.ApiJson;
import com.onfido.api.Config;
import com.onfido.api.ResourceManager;
import com.onfido.exceptions.OnfidoException;
import com.onfido.models.Check;

import okhttp3.OkHttpClient;

import java.util.List;

/**
 * Manager class for the Check resource type. Contains resource-specific methods for interacting
 * with the API.
 */
public class CheckManager extends ResourceManager {
  private ApiJson<Check> checkParser = new ApiJson<>(Check.class);
  private ApiJson<Check.Request> requestFormatter = new ApiJson<>(Check.Request.class);

  /**
   * Instantiates a new Check manager.
   *
   * @param config the config
   */
  protected CheckManager(Config config, OkHttpClient client) {
    super("checks/", config, client);
  }

  /**
   * Initiates a check for an applicant, which can contain one or more reports.
   *
   * @param request the request body
   * @return the Check
   * @throws OnfidoException the onfido exception
   */
  public Check create(Check.Request request) throws OnfidoException {
    return checkParser.parse(post("", requestFormatter.toJson(request)));
  }

  /**
   * Retrieves a single check.
   *
   * @param checkId the check id
   * @return the Check
   * @throws OnfidoException the onfido exception
   */
  public Check find(String checkId) throws OnfidoException {
    return checkParser.parse(get(checkId));
  }

  /**
   * Returns all checks for an applicant.
   *
   * @param applicantId the applicant id
   * @return a list of Checks
   * @throws OnfidoException the onfido exception
   */
  public List<Check> list(String applicantId) throws OnfidoException {
    return checkParser.parseWrappedList(get("?applicant_id=" + applicantId), "checks");
  }

  /**
   * Resumes a paused check. If successful, returns a 204 No Content response.
   *
   * @param checkId the check id
   * @throws OnfidoException the onfido exception
   */
  public void resume(String checkId) throws OnfidoException {
    post(checkId + "/resume", "");
  }
}
