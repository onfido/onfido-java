package com.onfido.integration;

import static org.junit.Assert.assertEquals;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.models.WorkflowRun;
import com.onfido.models.Applicant;
import com.onfido.exceptions.OnfidoException;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.UUID;

import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class WorkflowRunManagerTest extends TestBase {
  private WorkflowRun workflowRun;
  private Applicant applicant;

  static final String WORKFLOW_ID = "e8c921eb-0495-44fe-b655-bcdcaffdafe5";

  @BeforeMethod
  public void setup() throws Exception {
    applicant = createApplicant();
    workflowRun = createWorkflowRun(WORKFLOW_ID, applicant.getId());
  }

  private WorkflowRun createWorkflowRun(String workflowId, String applicantId) throws Exception {
    prepareMock(new JsonObject().add("workflow_id", workflowId)
                                .add("applicant_id", applicantId)
                                .add("id", UUID.randomUUID().toString()));

    WorkflowRun workflowRun = onfido.getWorkflowRunManager().create(WorkflowRun.request().workflowId(workflowId).applicantId(applicantId));

    takeRequest("/workflow_runs/");

    assertRequestField("workflow_id", workflowId);
    assertRequestField("applicant_id", applicantId);

    return workflowRun;
  }

  @Test
  public void createWorkflowRunTest() throws Exception {
    assertEquals(WORKFLOW_ID, workflowRun.getWorkflowId());
    assertEquals(applicant.getId(), workflowRun.getApplicantId());
  }

  @Test
  public void findWorkflowRunTest() throws Exception {
    prepareMock(new JsonObject().add("workflow_id", WORKFLOW_ID).add("applicant_id", applicant.getId()));

    WorkflowRun lookupWorkflowRun = onfido.getWorkflowRunManager().find(workflowRun.getId());

    takeRequest("/workflow_runs/" + workflowRun.getId());

    assertEquals(WORKFLOW_ID, lookupWorkflowRun.getWorkflowId());
    assertEquals(applicant.getId(), lookupWorkflowRun.getApplicantId());
  }
}
