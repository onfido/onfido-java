package com.onfido.api;

import com.squareup.moshi.Json;

public class WebhookObject {

    @Json(name = "id") public String id;
    @Json(name = "status") public String status;
    @Json(name = "href") public String href;
    @Json(name = "completed_at_iso8601") public String completedAtIso8601;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookObject object = (WebhookObject) o;
        return id.equals(object.id) &&
                status.equals(object.status) &&
                href.equals(object.href) &&
                completedAtIso8601.equals(object.completedAtIso8601);
    }
}
