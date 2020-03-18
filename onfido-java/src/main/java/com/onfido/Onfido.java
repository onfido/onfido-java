package com.onfido;

import com.onfido.api.Config;
import okhttp3.OkHttpClient;

/** The main class used for accessing instances of the manager classes. */
public final class Onfido {
  private static final OkHttpClient DEFAULT_CLIENT = new OkHttpClient();
  private static final String DEFAULT_API_URL = "https://api.onfido.com/v3/";
  private static final String US_API_URL = "https://api.us.onfido.com/v3/";

  /** The Configuration for the instance. */
  public final Config config;
  /** The HTTP Client for the instance. */
  public final OkHttpClient client;

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
    client = builder.client;
    applicant = new ApplicantManager(this.config, this.client);
    document = new DocumentManager(this.config, this.client);
    check = new CheckManager(this.config, this.client);
    report = new ReportManager(this.config, this.client);
    livePhoto = new LivePhotoManager(this.config, this.client);
    liveVideo = new LiveVideoManager(this.config, this.client);
    address = new AddressManager(this.config, this.client);
    sdkToken = new SdkTokenManager(this.config, this.client);
    webhook = new WebhookManager(this.config, this.client);
  }

  /** The Builder for the Onfido object. */
  public static final class Builder {
    /** The Api token. */
    public String apiToken = "";
    /** The Api url. */
    public String apiUrl = DEFAULT_API_URL;
    /** The Api url. */
    public OkHttpClient client = DEFAULT_CLIENT;

    private Builder() {}

    /**
     * Builds the Onfido object instance.
     *
     * @return the Onfido
     */
    public Onfido build() {
      if (apiToken == null || apiToken.isEmpty()) {
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
     * HTTP client attribute.
     *
     * @param client the HTTP client
     * @return the builder
     */
    public Builder client(OkHttpClient client) {
      this.client = client;
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
   * Shuts down the client, causing all future API calls to be rejected for the instance.
   */
  public void shutdown() {
    this.client.dispatcher().executorService().shutdown();
    this.client.connectionPool().evictAll();
  }
}
