package com.onfido.integration;

import com.onfido.model.WorkflowRun;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class QualifiedElectronicSignatureTest extends TestBase {
    private UUID applicantId;
    private WorkflowRun workflowRun;
    private UUID workflowRunId;

    static final UUID WORKFLOW_ID = UUID.fromString("e8c921eb-0495-44fe-b655-bcdcaffdafe5");
    static final UUID FILE_ID = UUID.fromString("221f9d24-cf72-4762-ac4a-01bf3ccc09dd");

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
    }

    @Test
    public void documentsTest() throws Exception {
        byte[] byteArray = onfido.downloadQesDocument(workflowRunId, FILE_ID).getByteArray();

        Assertions.assertEquals("%PDF", new String(byteArray, 0, 4));
        Assertions.assertTrue(byteArray.length > 0);
    }
}
