package com.onfido.webhooks;

import com.squareup.moshi.Json;

/** A wrapper class for parsing webhook event responses. */
public class WebhookPayload {

  @Json(name = "payload")
  private final WebhookEvent payload;

  /**
   * Instantiates a new Webhook payload.
   *
   * @param payload the payload
   */
  protected WebhookPayload(WebhookEvent payload) {
    this.payload = payload;
  }

  /**
   * Gets Webhook payload.
   *
   * @return the payload
   */
  public WebhookEvent getPayload() {
    return payload;
  }
}
