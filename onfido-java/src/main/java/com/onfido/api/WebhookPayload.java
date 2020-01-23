package com.onfido.api;

import com.squareup.moshi.Json;

public class WebhookPayload {

    @Json(name = "payload") private final WebhookEvent payload;

    protected WebhookPayload(WebhookEvent payload) {
        this.payload = payload;
    }

    public WebhookEvent getPayload() {
        return payload;
    }
}
