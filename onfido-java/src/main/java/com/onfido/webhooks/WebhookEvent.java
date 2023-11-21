package com.onfido.webhooks;

import com.onfido.models.Task;
import com.squareup.moshi.Json;
import java.util.Objects;

/** The response from Webhook events. */
public class WebhookEvent {

  @Json(name = "resource_type")
  private final String resourceType;

  @Json(name = "action")
  private final String action;

  @Json(name = "object")
  private final WebhookEventObject object;

  @Json(name = "resource")
  private final Task resource;

  /**
   * Instantiates a new WebhookEvent.
   *
   * @param resourceType the resource type
   * @param action the action
   * @param object the object
   */
  protected WebhookEvent(String resourceType, String action, WebhookEventObject object, Task resource) {
    this.resourceType = resourceType;
    this.action = action;
    this.object = object;
    this.resource = resource;
  }

  /**
   * Gets resource type.
   *
   * @return the resource type
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the action.
   *
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * Gets the event object.
   *
   * @return the WebHookEventObject
   */
  public WebhookEventObject getObject() {
    return object;
  }

  /**
   * Gets the event resource.
   *
   * @return the Task
   */
  public Task getResource() {
    return resource;
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
    return getResourceType().equals(event.getResourceType())
        && getAction().equals(event.getAction())
        && getObject().equals(event.getObject())
        && ((getResource() == null && event.getResource() == null) || getResource().equals(event.getResource()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, action, object);
  }
}
