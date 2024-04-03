package com.onfido.integration;

import java.io.File;
import java.nio.file.Files;
import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.onfido.model.Applicant;
import com.onfido.model.WorkflowRun;
import com.onfido.model.WorkflowRunBuilder;

public class WorkflowRunTest extends TestBase {
  private WorkflowRun workflowRun;
  private Applicant applicant;

  static final UUID WORKFLOW_ID = UUID.fromString("e8c921eb-0495-44fe-b655-bcdcaffdafe5");

  @BeforeEach
  public void setup() throws Exception {
    applicant = createApplicant();
    workflowRun = createWorkflowRun(WORKFLOW_ID, applicant.getId());
  }

  private WorkflowRun createWorkflowRun(UUID workflowId, UUID applicantId) throws Exception {
    return onfido.createWorkflowRun(new WorkflowRunBuilder().workflowId(workflowId).applicantId(applicantId));
  }

  @Test
  public void createWorkflowRunTest() throws Exception {
    Assertions.assertEquals(WORKFLOW_ID, workflowRun.getWorkflowId());
    Assertions.assertEquals(applicant.getId(), workflowRun.getApplicantId());
  }

  @Test
  public void findWorkflowRunTest() throws Exception {
    WorkflowRun lookupWorkflowRun = onfido.findWorkflowRun(workflowRun.getId());

    Assertions.assertEquals(WORKFLOW_ID, lookupWorkflowRun.getWorkflowId());
    Assertions.assertEquals(applicant.getId(), lookupWorkflowRun.getApplicantId());
  }

  @Test
  public void evidenceWorkflowRunTest() throws Exception {
    File download = onfido.downloadSignedEvidenceFile(workflowRun.getId());
    byte[] content = Files.readAllBytes(download.toPath());

    Assertions.assertEquals("%PDF", new String(content, 0, 4));
    Assertions.assertTrue(download.length() > 0);
  }
}
