package com.onfido;

import com.onfido.api.Config;
import com.onfido.managers.*;

public final class Onfido {

  private static final String DEFAULT_API_URL = "https://api.onfido.com/v3/";
  private static final String US_API_URL = "https://api.us.onfido.com/v3/";

  public final Config config;

  public final ApplicantManager applicant;
  public final DocumentManager document;
  public final CheckManager check;
  public final ReportManager report;
  public final LivePhotoManager livePhoto;
  public final LiveVideoManager liveVideo;
  public final AddressManager address;
  public final SdkTokenManager sdkToken;
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

  public static final class Builder {
    public String apiToken = "";
    public String apiUrl = DEFAULT_API_URL;

    private Builder() {}

    public Onfido build() {
      return new Onfido(this);
    }

    public Builder apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    public Builder regionUS() {
      this.apiUrl = US_API_URL;
      return this;
    }

    public Builder unknownApiUrl(String url) {
      this.apiUrl = url;
      return this;
    }
  }

  public static Builder builder() {
    return new Builder();
  }
}
