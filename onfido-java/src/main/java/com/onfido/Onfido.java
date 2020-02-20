package com.onfido;

import com.onfido.api.Config;
import okhttp3.OkHttpClient;

/** The main class used for accessing instances of the manager classes. */
public final class Onfido {
  private static final OkHttpClient CLIENT = new OkHttpClient();

  private static final String DEFAULT_API_URL = "https://api.onfido.com/v3/";
  private static final String US_API_URL = "https://api.us.onfido.com/v3/";

  /** The Configuration for the instance. */
  public final Config config;

  /** The manager class for the Applicant resource. */
  public final ApplicantManager applicant;
  /** The manager class for the Document resource. */
  public final DocumentManager document;
  /** The manager class for the Check resource. */
  public final CheckManager check;
  /** The manager class for the Report resource. */
  public final ReportManager report;
  /** The manager class for the Live photo resource. */
  public final LivePhotoManager livePhoto;
  /** The manager class for the Live video resource. */
  public final LiveVideoManager liveVideo;
  /** The manager class for the Address resource */
  public final AddressManager address;
  /** The manager class for the Sdk token resource. */
  public final SdkTokenManager sdkToken;
  /** The manager class for the Webhook resource. */
  public final WebhookManager webhook;

  private Onfido(Builder builder) {
    config = new Config(builder);
    applicant = new ApplicantManager(this.config, CLIENT);
    document = new DocumentManager(this.config, CLIENT);
    check = new CheckManager(this.config, CLIENT);
    report = new ReportManager(this.config, CLIENT);
    livePhoto = new LivePhotoManager(this.config, CLIENT);
    liveVideo = new LiveVideoManager(this.config, CLIENT);
    address = new AddressManager(this.config, CLIENT);
    sdkToken = new SdkTokenManager(this.config, CLIENT);
    webhook = new WebhookManager(this.config, CLIENT);
  }

  /** The Builder for the Onfido object. */
  public static final class Builder {
    /** The Api token. */
    public String apiToken = "";
    /** The Api url. */
    public String apiUrl = DEFAULT_API_URL;

    private Builder() {}

    /**
     * Builds the Onfido object instance.
     *
     * @return the Onfido
     */
    public Onfido build() {
      if (apiToken.isEmpty()) {
        throw new RuntimeException("Please provide an apiToken");
      }

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

  /**
   * Shuts down the client across all Onfido instances, causing all future API calls to be rejected.
   */
  public static void shutdown() {
    CLIENT.dispatcher().executorService().shutdown();
    CLIENT.connectionPool().evictAll();
  }
}
