package com.onfido.webhooks;

import com.squareup.moshi.Json;
import java.util.Objects;

/** The event object within the webhook event response. */
public class WebhookEventObject {

  @Json(name = "id")
  private final String id;

  @Json(name = "status")
  private final String status;

  @Json(name = "task_spec_id")
  private final String taskSpecId;

  @Json(name = "task_def_id")
  private final String taskDefId;

  @Json(name = "workflow_run_id")
  private final String workflowRunId;

  @Json(name = "href")
  private final String href;

  @Json(name = "completed_at_iso8601")
  private final String completedAtIso8601;

  /**
   * Instantiates a new Webhook event object.
   *
   * @param id the id
   * @param status the status
   * @param taskSpecId the taskSpecId
   * @param taskDefId the taskDefId
   * @param workflowRunId the workflowRunId
   * @param href the href
   * @param completedAtIso8601 the completed at iso 8601
   */
  protected WebhookEventObject(
      String id,
      String status,
      String taskSpecId,
      String taskDefId,
      String workflowRunId,
      String href,
      String completedAtIso8601) {
    this.id = id;
    this.status = status;
    this.taskSpecId = taskSpecId;
    this.taskDefId = taskDefId;
    this.workflowRunId = workflowRunId;
    this.href = href;
    this.completedAtIso8601 = completedAtIso8601;
  }

  /**
   * Gets id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets taskSpecId.
   *
   * @return the taskSpecId
   */
  public String getTaskSpecId() {
    return taskSpecId;
  }

  /**
   * Gets taskDefId.
   *
   * @return the taskDefId.
   */
  public String getTaskDefId() {
    return taskDefId;
  }

  /**
   * get workflowRunId.
   *
   * @return the workflowRunId
   */
  public String getWorkflowRunId() {
    return workflowRunId;
  }

  /**
   * Gets href.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets completed at iso 8601.
   *
   * @return the completed at iso 8601
   */
  public String getCompletedAtIso8601() {
    return completedAtIso8601;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEventObject object = (WebhookEventObject) o;
    return getId().equals(object.getId())
        && getStatus().equals(object.getStatus())
        && getHref().equals(object.getHref())
        && getCompletedAtIso8601().equals(object.getCompletedAtIso8601());
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, status, completedAtIso8601);
  }
}
