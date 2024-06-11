package com.onfido.integration;

import static com.onfido.model.WorkflowRun.StatusEnum.APPROVED;

import com.google.gson.Gson;
import com.onfido.model.*;
import java.io.FileReader;
import java.io.Reader;
import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WorkflowRunOutputsTest extends TestBase {
  private Applicant applicant;
  private final Gson gson = new Gson();

  @BeforeEach
  public void setup() throws Exception {
    applicant = createApplicant();
  }

  @Test
  public void profileDataCaptureAsOutput() throws Exception {
    UUID workflowId = UUID.fromString("d27e510b-27a8-44c3-a3cc-bf4c0648a4ba");
    UUID workflowRunId = createWorkflowRun(workflowId, applicant.getId()).getId();

    String taskId = getTaskIdByPartialId(workflowRunId, "profile");

    Reader reader = new FileReader("media/ProfileDataCapture.json");
    CompleteTaskBuilder completeTaskBuilder = new CompleteTaskBuilder();
    completeTaskBuilder.setData(new CompleteTaskDataBuilder(gson.fromJson(reader, Object.class)));

    onfido.completeTask(workflowRunId, taskId, completeTaskBuilder);
    WorkflowRun workflowRun = onfido.findWorkflowRun(workflowRunId);

    Map<?, ?> output = (Map<?, ?>) workflowRun.getOutput();
    Assertions.assertEquals(
        completeTaskBuilder.getData().getObject(), output.get("profile_capture_data"));
  }

  @Test
  public void documentAndFacialSimilarityReportsAsOutputs() throws Exception {
    UUID workflowId = UUID.fromString("5025d9fd-7842-4805-bce1-a7bfd7131b4e");
    UUID workflowRunId = createWorkflowRun(workflowId, applicant.getId()).getId();

    String profileDataTaskId = getTaskIdByPartialId(workflowRunId, "profile");

    Map<String, String> completeProfileDataTaskBody = new HashMap<>();
    completeProfileDataTaskBody.put("first_name", "First");
    completeProfileDataTaskBody.put("last_name", "Last");

    CompleteTaskBuilder completeProfileDataTaskBuilder = new CompleteTaskBuilder();
    completeProfileDataTaskBuilder.setData(
        new CompleteTaskDataBuilder(completeProfileDataTaskBody));
    onfido.completeTask(workflowRunId, profileDataTaskId, completeProfileDataTaskBuilder);

    String documentCaptureTaskId = getTaskIdByPartialId(workflowRunId, "document_photo");
    Document document = uploadDocument(applicant, "sample_driving_licence.png", "driving_licence");

    Map<String, String> completeDocumentCaptureTaskBody = new HashMap<>();
    List<Object> completeDocumentCaptureTaskBodyArray = new ArrayList<>();
    CompleteTaskBuilder completeDocumentCaptureTaskBuilder = new CompleteTaskBuilder();

    completeDocumentCaptureTaskBody.put("id", document.getId().toString());
    completeDocumentCaptureTaskBodyArray.add(completeDocumentCaptureTaskBody);
    completeDocumentCaptureTaskBuilder.setData(
        new CompleteTaskDataBuilder(completeDocumentCaptureTaskBodyArray));
    onfido.completeTask(workflowRunId, documentCaptureTaskId, completeDocumentCaptureTaskBuilder);

    String photoCaptureTaskId = getTaskIdByPartialId(workflowRunId, "face_photo");
    LivePhoto livePhoto = uploadLivePhoto(applicant, "sample_photo.png");

    Map<String, String> completeLivePhotoCaptureTaskBody = new HashMap<>();
    List<Object> completeLivePhotoCaptureTaskBodyArray = new ArrayList<>();
    CompleteTaskBuilder completeLivePhotoCaptureTaskBuilder = new CompleteTaskBuilder();

    completeLivePhotoCaptureTaskBody.put("id", livePhoto.getId().toString());
    completeLivePhotoCaptureTaskBodyArray.add(completeLivePhotoCaptureTaskBody);
    completeLivePhotoCaptureTaskBuilder.setData(
        new CompleteTaskDataBuilder(completeLivePhotoCaptureTaskBodyArray));
    onfido.completeTask(workflowRunId, photoCaptureTaskId, completeLivePhotoCaptureTaskBuilder);

    // wait for workflow run to finish
    WorkflowRun workflowRun =
        (WorkflowRun)
            repeatRequestUntilStatusChanges(
                "findWorkflowRun",
                new UUID[] {workflowRunId},
                WorkflowRun.StatusEnum.APPROVED,
                10,
                1000);

    Assertions.assertEquals(APPROVED, workflowRun.getStatus());

    Map<?, ?> workflowRunOutput = (Map<?, ?>) workflowRun.getOutput();

    // workflow run has configured as output the result of the document
    // report `doc` and the facial similarity report `selfie`
    String outputDocumentReport = gson.toJson(workflowRunOutput.get("doc"));
    String outputFacialSimilarityReport = gson.toJson(workflowRunOutput.get("selfie"));

    Assertions.assertTrue(outputDocumentReport.contains("breakdown"));
    Assertions.assertTrue(outputDocumentReport.contains("properties"));
    Assertions.assertTrue(outputDocumentReport.contains("repeat_attempts"));
    Assertions.assertTrue(outputDocumentReport.contains("result"));
    Assertions.assertTrue(outputDocumentReport.contains("status"));
    Assertions.assertTrue(outputDocumentReport.contains("sub_result"));
    Assertions.assertTrue(outputDocumentReport.contains("uuid"));

    Assertions.assertTrue(outputFacialSimilarityReport.contains("breakdown"));
    Assertions.assertTrue(outputFacialSimilarityReport.contains("properties"));
    Assertions.assertTrue(outputFacialSimilarityReport.contains("result"));
    Assertions.assertTrue(outputFacialSimilarityReport.contains("status"));
    Assertions.assertTrue(outputFacialSimilarityReport.contains("uuid"));
  }
}
