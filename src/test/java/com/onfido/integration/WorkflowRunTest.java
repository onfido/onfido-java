package com.onfido.integration;

import com.onfido.FileTransfer;
import com.onfido.model.TimelineFileReference;
import com.onfido.model.WorkflowRun;
import com.onfido.model.WorkflowRunBuilder;
import com.onfido.model.WorkflowRunStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WorkflowRunTest extends TestBase {
  private UUID applicantId;
  private WorkflowRun workflowRun;
  private UUID workflowRunId;

  static final UUID WORKFLOW_ID = UUID.fromString("e8c921eb-0495-44fe-b655-bcdcaffdafe5");
  static final UUID WORKFLOW_ID_TIMELINE = UUID.fromString("221f9d24-cf72-4762-ac4a-01bf3ccc09dd");

  @BeforeEach
  public void setup() throws Exception {
    applicantId = createApplicant().getId();
    workflowRun = createWorkflowRun(WORKFLOW_ID, applicantId);
    workflowRunId = workflowRun.getId();
  }

  @Test
  public void createWorkflowRunTest() throws Exception {
    Assertions.assertEquals(WORKFLOW_ID, workflowRun.getWorkflowId());
    Assertions.assertEquals(applicantId, workflowRun.getApplicantId());

    Assertions.assertNotNull(workflowRun.toJson());
  }

  @Test
  public void createWorkflowRunWithCustomInputsTest() throws Exception {
    UUID workflowId = UUID.fromString("45092b29-f220-479e-aa6f-a6f989baac4c");
    Map<String, Object> customData = new HashMap<>();
    customData.put("age", 18);
    customData.put("is_employed", true);

    WorkflowRun workflowRunWithCustomInputs =
        onfido.createWorkflowRun(
            new WorkflowRunBuilder()
                .workflowId(workflowId)
                .applicantId(applicantId)
                .customData(customData));

    Assertions.assertEquals(workflowId, workflowRunWithCustomInputs.getWorkflowId());
    Assertions.assertEquals(applicantId, workflowRunWithCustomInputs.getApplicantId());
    Assertions.assertEquals(WorkflowRunStatus.APPROVED, workflowRunWithCustomInputs.getStatus());

    Assertions.assertNotNull(workflowRunWithCustomInputs.toJson());
  }

  @Test
  public void findWorkflowRunTest() throws Exception {
    WorkflowRun lookupWorkflowRun = onfido.findWorkflowRun(workflowRunId);

    Assertions.assertEquals(WORKFLOW_ID, lookupWorkflowRun.getWorkflowId());
    Assertions.assertEquals(applicantId, lookupWorkflowRun.getApplicantId());

    Assertions.assertNotNull(lookupWorkflowRun.toJson());
  }

  @Test
  public void evidenceWorkflowRunTest() throws Exception {
    byte[] byteArray = onfido.downloadSignedEvidenceFile(workflowRunId).getByteArray();

    Assertions.assertEquals("%PDF", new String(byteArray, 0, 4));
    Assertions.assertTrue(byteArray.length > 0);
  }

  @Test
  public void generateTimelineFileTest() throws Exception {
    UUID workflowRunId = createWorkflowRun(WORKFLOW_ID_TIMELINE, applicantId).getId();

    repeatRequestUntilStatusChanges(
        "findWorkflowRun", new UUID[] {workflowRunId}, WorkflowRunStatus.APPROVED, 10, 1000);
    TimelineFileReference workflowTimelineFileData = onfido.createTimelineFile(workflowRunId);

    Assertions.assertNotNull(workflowTimelineFileData.getWorkflowTimelineFileId());
    Assertions.assertNotNull(workflowTimelineFileData.getHref());

    Assertions.assertNotNull(workflowTimelineFileData.toJson());
  }

  @Test
  public void findTimelineFileTest() throws Exception {
    UUID workflowRunId = createWorkflowRun(WORKFLOW_ID_TIMELINE, applicantId).getId();

    repeatRequestUntilStatusChanges(
        "findWorkflowRun", new UUID[] {workflowRunId}, WorkflowRunStatus.APPROVED, 10, 1000);
    UUID timelineFileId = onfido.createTimelineFile(workflowRunId).getWorkflowTimelineFileId();

    FileTransfer download =
        (FileTransfer)
            repeatRequestUntilHttpCodeChanges(
                "findTimelineFile", new UUID[] {workflowRunId, timelineFileId}, 10, 1000);

    byte[] byteArray = download.getByteArray();

    Assertions.assertEquals("%PDF", new String(byteArray, 0, 4));
    Assertions.assertTrue(byteArray.length > 0);
  }
}
