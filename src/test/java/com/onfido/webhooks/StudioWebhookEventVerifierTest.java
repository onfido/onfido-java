package com.onfido.webhooks;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.onfido.WebhookEventVerifier;
import com.onfido.integration.TestBase;
import com.onfido.model.WebhookEvent;
import com.onfido.model.WebhookEventPayload;
import com.onfido.model.WebhookEventPayloadObject;
import com.onfido.model.WebhookEventType;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudioWebhookEventVerifierTest extends TestBase {
  private static final ObjectMapper objectMapper = new ObjectMapper();

  private static final String webhookToken = "sgx0lCZimfQBJHnuiKJaNUF76yQZfD94";

  private static final WebhookEventVerifier webhookEventVerifier =
      new WebhookEventVerifier(webhookToken);

  private static final UUID WORKFLOW_RUN_ID =
      UUID.fromString("d19692d6-730a-4730-9005-82185a5ec595");

  @Test
  public void workflowTaskStartedTest() throws Exception {
    String signature = "77ebc3e418f26be6eebb47f7ebe551321de26734fc273961e075fc9ab163d9c7";
    String rawEvent =
        "{\"payload\":{\"resource_type\":\"workflow_task\",\"action\":\"workflow_task.started\",\"object\":{\"id\":\"start\",\"task_spec_id\":\"start\",\"task_def_id\":\"start\",\"workflow_run_id\":\"d19692d6-730a-4730-9005-82185a5ec595\",\"status\":\"started\",\"started_at_iso8601\":\"2024-07-10T11:48:04Z\",\"href\":\"https://api.eu.onfido.com/v3.6/workflow_runs/d19692d6-730a-4730-9005-82185a5ec595/tasks/start\"},\"resource\":{\"task_def_id\":\"start\",\"workflow_run_id\":\"d19692d6-730a-4730-9005-82185a5ec595\",\"input\":{},\"id\":\"start\",\"updated_at\":\"2024-07-10T11:48:04Z\",\"created_at\":\"2024-07-10T11:48:04Z\",\"output\":{\"uuid\":\"520d3d08-c600-4458-abf3-d0e91cff2735\"},\"task_def_version\":null}}";

    WebhookEvent expectedEvent =
        new WebhookEvent()
            .payload(
                new WebhookEventPayload()
                    .action(WebhookEventType.WORKFLOW_TASK_STARTED)
                    .resourceType("workflow_task")
                    ._object(
                        new WebhookEventPayloadObject()
                            .id("start")
                            .href(
                                String.format(
                                    "https://api.eu.onfido.com/v3.6/workflow_runs/%s/tasks/start",
                                    WORKFLOW_RUN_ID))
                            .status("started")
                            .putAdditionalProperty(
                                "started_at_iso8601",
                                OffsetDateTime.parse("2024-04-04T09:21:21Z"))));

    WebhookEvent event = webhookEventVerifier.readPayload(rawEvent, signature);

    Assertions.assertEquals(expectedEvent, event);
  }

  @Test
  public void workflowTaskCompletedTest() throws Exception {
    String signature = "52a679d2fa4babbdad3cc1d62b40b2e9db0493ca82ee290cc2d269972a7dffed";
    String rawEvent =
        "{\"payload\":{\"resource_type\":\"workflow_task\",\"action\":\"workflow_task.completed\",\"object\":{\"id\":\"start\",\"task_spec_id\":\"start\",\"task_def_id\":\"start\",\"workflow_run_id\":\"d19692d6-730a-4730-9005-82185a5ec595\",\"status\":\"completed\",\"completed_at_iso8601\":\"2024-07-10T11:48:04Z\",\"href\":\"https://api.eu.onfido.com/v3.6/workflow_runs/d19692d6-730a-4730-9005-82185a5ec595/tasks/start\"},\"resource\":{\"task_def_id\":\"start\",\"workflow_run_id\":\"d19692d6-730a-4730-9005-82185a5ec595\",\"input\":{},\"id\":\"start\",\"updated_at\":\"2024-07-10T11:48:04Z\",\"created_at\":\"2024-07-10T11:48:04Z\",\"output\":{\"uuid\":\"520d3d08-c600-4458-abf3-d0e91cff2735\"},\"task_def_version\":null}}}";

    WebhookEvent expectedEvent =
        new WebhookEvent()
            .payload(
                new WebhookEventPayload()
                    .action(WebhookEventType.WORKFLOW_TASK_COMPLETED)
                    .resourceType("workflow_task")
                    ._object(
                        new WebhookEventPayloadObject()
                            .id("start")
                            .href(
                                String.format(
                                    "https://api.eu.onfido.com/v3.6/workflow_runs/%s/tasks/start",
                                    WORKFLOW_RUN_ID))
                            .status("completed")
                            .completedAtIso8601(OffsetDateTime.parse("2024-07-10T11:48:04Z"))));

    WebhookEvent event = webhookEventVerifier.readPayload(rawEvent, signature);

    Assertions.assertEquals(expectedEvent, event);
  }

  @Test
  public void workflowRunCompletedTest() throws Exception {
    String signature = "de43e2a218c589d6bb750d9d7014744d378660cd106886f722f72a9c0eef3027";
    String rawResource =
        "{\"link\":{\"completed_redirect_url\":null,\"language\":null,\"expired_redirect_url\":null,\"url\":\"https://eu.onfido.app/l/d19692d6-730a-4730-9005-82185a5ec595\",\"expires_at\":null},\"error\":null,\"id\":\"d19692d6-730a-4730-9005-82185a5ec595\",\"updated_at\":\"2024-07-10T11:48:04Z\",\"output\":null,\"applicant_id\":\"520d3d08-c600-4458-abf3-d0e91cff2735\",\"tags\":[],\"created_at\":\"2024-07-10T11:48:04Z\",\"sdk_token\":null,\"reasons\":[],\"status\":\"approved\",\"workflow_version_id\":1,\"dashboard_url\":\"https://dashboard.onfido.com/results/d19692d6-730a-4730-9005-82185a5ec595\",\"workflow_id\":\"221f9d24-cf72-4762-ac4a-01bf3ccc09dd\"}}";

    String rawEvent =
        String.format(
            "{\"payload\":{\"resource_type\":\"workflow_run\",\"action\":\"workflow_run.completed\",\"object\":{\"id\":\"d19692d6-730a-4730-9005-82185a5ec595\",\"status\":\"approved\",\"completed_at_iso8601\":\"2024-07-10T11:48:04Z\",\"href\":\"https://api.eu.onfido.com/v3.6/workflow_runs/d19692d6-730a-4730-9005-82185a5ec595\"},\"resource\":%s}",
            rawResource);

    WebhookEvent expectedEvent =
        new WebhookEvent()
            .payload(
                new WebhookEventPayload()
                    .action(WebhookEventType.WORKFLOW_RUN_COMPLETED)
                    .resourceType("workflow_run")
                    ._object(
                        new WebhookEventPayloadObject()
                            .id(WORKFLOW_RUN_ID)
                            .href(
                                String.format(
                                    "https://api.eu.onfido.com/v3.6/workflow_runs/%s",
                                    WORKFLOW_RUN_ID))
                            .status("approved")
                            .completedAtIso8601(OffsetDateTime.parse("2024-07-10T11:48:04Z")))
                    .resource(objectMapper.readValue(rawResource, Map.class)));

    WebhookEvent event = webhookEventVerifier.readPayload(rawEvent, signature);

    Assertions.assertEquals(expectedEvent, event);
  }
}
