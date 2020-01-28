package com.onfido.api;

import com.squareup.moshi.Json;

import java.util.Objects;

public class WebhookEvent {

    @Json(name = "resource_type") private final String resourceType;
    @Json(name = "action") private final String action;
    @Json(name = "object") private final WebhookEventObject object;

    protected WebhookEvent(String resourceType, String action, WebhookEventObject object) {
        this.resourceType = resourceType;
        this.action = action;
        this.object = object;
    }

    public String getResourceType() {
        return resourceType;
    }

    public String getAction() {
        return action;
    }

    public WebhookEventObject getObject() {
        return object;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookEvent event = (WebhookEvent) o;
        return getResourceType().equals(event.getResourceType()) &&
                getAction().equals(event.getAction()) &&
                getObject().equals(event.getObject());
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, action, object);
    }
}
