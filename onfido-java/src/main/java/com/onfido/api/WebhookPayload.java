package com.onfido.api;

import com.squareup.moshi.Json;

/**
 * The type Webhook payload.
 */
public class WebhookPayload {

    @Json(name = "payload") private final WebhookEvent payload;

    /**
     * Instantiates a new Webhook payload.
     *
     * @param payload the payload
     */
    protected WebhookPayload(WebhookEvent payload) {
        this.payload = payload;
    }

    /**
     * Gets payload.
     *
     * @return the payload
     */
    public WebhookEvent getPayload() {
        return payload;
    }
}
