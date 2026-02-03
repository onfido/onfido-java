package com.onfido.integration;

import com.onfido.model.Applicant;
import com.onfido.model.CompleteTaskBuilder;
import com.onfido.model.CompleteTaskDataBuilder;
import com.onfido.model.Task;
import com.onfido.model.TaskItem;
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
    List<TaskItem> tasks = onfido.listTasks(workflowRunId).execute();

    Assertions.assertEquals(2, tasks.size());

    Assertions.assertNotNull(tasks.get(0).toJson());
    Assertions.assertNotNull(tasks.get(1).toJson());
  }

  @Test
  public void findTask() throws Exception {
    TaskItem lookupTask = onfido.listTasks(workflowRunId).execute().get(0);

    Task task = onfido.findTask(workflowRunId, lookupTask.getId()).execute();

    Assertions.assertEquals(lookupTask.getId(), task.getId());
    Assertions.assertEquals(lookupTask.getTaskDefId(), task.getTaskDefId());

    Assertions.assertNotNull(task.toJson());
  }

  @Test
  public void completeTask() throws Exception {
    String taskId = getTaskIdByPartialId(workflowRunId, "profile");

    Map<String, String> completeTaskBody = new HashMap<>();
    completeTaskBody.put("first_name", "First");
    completeTaskBody.put("last_name", "Last");

    CompleteTaskBuilder completeTaskBuilder = new CompleteTaskBuilder();
    completeTaskBuilder.setData(new CompleteTaskDataBuilder(completeTaskBody));

    onfido.completeTask(workflowRunId, taskId, completeTaskBuilder).execute();

    Task completedTask = onfido.findTask(workflowRunId, taskId).execute();
    Map<?, ?> taskOutput = (Map<?, ?>) completedTask.getOutput();

    Assertions.assertEquals("First", taskOutput.get("first_name"));
    Assertions.assertEquals("Last", taskOutput.get("last_name"));
  }
}
