package com.onfido;

import com.onfido.api.Config;
import com.onfido.managers.AddressManager;
import com.onfido.managers.ApplicantManager;
import com.onfido.managers.CheckManager;
import com.onfido.managers.DocumentManager;
import com.onfido.managers.LivePhotoManager;
import com.onfido.managers.LiveVideoManager;
import com.onfido.managers.ReportManager;
import com.onfido.managers.SdkTokenManager;
import com.onfido.managers.WebhookManager;

/**
 * The main class used for accessing instances of the manager classes.
 */
public final class Onfido {

  private static final String DEFAULT_API_URL = "https://api.onfido.com/v3/";
  private static final String US_API_URL = "https://api.us.onfido.com/v3/";

  /**
   * The Configuration for the instance.
   */
  public final Config config;

  /**
   * The manager class for the Applicant resource.
   */
  public final ApplicantManager applicant;
  /**
   * The manager class for the Document resource.
   */
  public final DocumentManager document;
  /**
   * The manager class for the Check resource.
   */
  public final CheckManager check;
  /**
   * The manager class for the Report resource.
   */
  public final ReportManager report;
  /**
   * The manager class for the Live photo resource.
   */
  public final LivePhotoManager livePhoto;
  /**
   * The manager class for the Live video resource.
   */
  public final LiveVideoManager liveVideo;
  /**
   * The manager class for the Address resource
   */
  public final AddressManager address;
  /**
   * The manager class for the Sdk token resource.
   */
  public final SdkTokenManager sdkToken;
  /**
   * The manager class for the Webhook resource.
   */
  public final WebhookManager webhook;

  private Onfido(Builder builder) {
    config = new Config(builder);
    applicant = new ApplicantManager(this.config);
    document = new DocumentManager(this.config);
    check = new CheckManager(this.config);
    report = new ReportManager(this.config);
    livePhoto = new LivePhotoManager(this.config);
    liveVideo = new LiveVideoManager(this.config);
    address = new AddressManager(this.config);
    sdkToken = new SdkTokenManager(this.config);
    webhook = new WebhookManager(this.config);
  }

  /**
   * The Builder for the Onfido object.
   */
  public static final class Builder {
    /**
     * The Api token.
     */
    public String apiToken = "";
    /**
     * The Api url.
     */
    public String apiUrl = DEFAULT_API_URL;

    private Builder() {}

    /**
     * Builds the Onfido object instance.
     *
     * @return the Onfido
     */
    public Onfido build() {
      return new Onfido(this);
    }

    /**
     * Api token attribute.
     *
     * @param apiToken the api token
     * @return the builder
     */
    public Builder apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Sets the object to use the US region base URL.
     *
     * @return the builder
     */
    public Builder regionUS() {
      this.apiUrl = US_API_URL;
      return this;
    }

    /**
     * Sets the object to use the specified URL for the api. Used for testing.
     *
     * @param url the url
     * @return the builder
     */
    public Builder unknownApiUrl(String url) {
      this.apiUrl = url;
      return this;
    }
  }

  /**
   * Gives access to the builder for the object.
   *
   * @return the builder
   */
  public static Builder builder() {
    return new Builder();
  }
}
