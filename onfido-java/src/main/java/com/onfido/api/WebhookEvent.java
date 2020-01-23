package com.onfido.api;

import com.squareup.moshi.Json;

public class WebhookEvent {

    @Json(name = "resource_type") public String resourceType;
    @Json(name = "action") public String action;
    @Json(name = "object") public WebhookObject object;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookEvent event = (WebhookEvent) o;
        return resourceType.equals(event.resourceType) &&
                action.equals(event.action) &&
                object.equals(event.object);
    }
}
