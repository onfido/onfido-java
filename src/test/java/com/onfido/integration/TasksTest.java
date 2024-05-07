package com.onfido.integration;

import com.onfido.model.Applicant;
import com.onfido.model.CompleteTaskRequest;
import com.onfido.model.Task;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TasksTest extends TestBase {
  private UUID workflowRunId;

  static final UUID WORKFLOW_ID = UUID.fromString("e8c921eb-0495-44fe-b655-bcdcaffdafe5");

  @BeforeEach
  public void setup() throws Exception {
    Applicant applicant = createApplicant();
    workflowRunId = createWorkflowRun(WORKFLOW_ID, applicant.getId()).getId();
  }

  @Test
  public void listTasks() throws Exception {
    List<Task> tasks = onfido.listTasks(workflowRunId);

    Assertions.assertEquals(2, tasks.size());
  }

  @Test
  public void findTask() throws Exception {
    Task lookupTask = onfido.listTasks(workflowRunId).get(0);

    Task task = onfido.findTask(workflowRunId, lookupTask.getId());

    Assertions.assertEquals(lookupTask.getId(), task.getId());
    Assertions.assertEquals(lookupTask.getTaskDefId(), task.getTaskDefId());
  }

  @Test
  public void completeTask() throws Exception {
    String taskId = getTaskIdByPartialId(workflowRunId, "profile");

    Map<String, String> completeTaskBody = new HashMap<>();
    completeTaskBody.put("first_name", "First");
    completeTaskBody.put("last_name", "Last");

    CompleteTaskRequest completeTaskRequest = new CompleteTaskRequest();
    completeTaskRequest.setData(completeTaskBody);

    onfido.completeTask(workflowRunId, taskId, completeTaskRequest);

    Task completedTask = onfido.findTask(workflowRunId, taskId);
    Map<String, String> taskOutput =
        (Map<String, String>) completedTask.getAdditionalProperties().get("output");

    Assertions.assertEquals("First", taskOutput.get("first_name"));
    Assertions.assertEquals("Last", taskOutput.get("last_name"));
  }
}
