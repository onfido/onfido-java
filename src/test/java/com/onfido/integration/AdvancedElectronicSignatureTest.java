package com.onfido.integration;

import com.google.gson.internal.LinkedTreeMap;
import com.onfido.model.TaskItem;
import com.onfido.model.WorkflowRun;
import com.onfido.model.WorkflowRunBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdvancedElectronicSignatureTest extends TestBase {

  @Test
  public void documentsTest() throws Exception {
    UUID applicantId = createApplicant().getId();
    UUID workflowId = UUID.fromString("9554c27e-9886-4052-992d-816467d97d24");

    Map<String, Object> customData = new HashMap<>();
    customData.put("face_result", "clear");
    customData.put("doc_result", "clear");
    customData.put("transaction_id", "995bf84c-d708-4977-8b88-d4b66bebdaf6");

    WorkflowRun workflowRun =
        onfido.createWorkflowRun(
            new WorkflowRunBuilder()
                .workflowId(workflowId)
                .applicantId(applicantId)
                .customData(customData));
    UUID workflowRunId = workflowRun.getId();

    TaskItem task = onfido.listTasks(workflowRunId).get(1);

    LinkedTreeMap output =
        (LinkedTreeMap)
            repeatRequestUntilTaskOutputChanges(
                    "findTask", new Object[] {workflowRunId, task.getId()}, 10, 3000)
                .getOutput();

    LinkedTreeMap properties = (LinkedTreeMap) output.get("properties");
    ArrayList signedDocuments = (ArrayList) properties.get("signed_documents");
    LinkedTreeMap signedDocument = (LinkedTreeMap) signedDocuments.get(0);
    LinkedTreeMap receiptDocument = (LinkedTreeMap) properties.get("receipt_document");
    UUID signedDocumentFileId = UUID.fromString((String) signedDocument.get("id"));
    UUID receiptDocumentFileId = UUID.fromString((String) receiptDocument.get("id"));

    byte[] signedDocumentBytes =
        onfido.downloadAesDocument(workflowRunId, signedDocumentFileId).getByteArray();
    byte[] receiptDocumentBytes =
        onfido.downloadAesDocument(workflowRunId, receiptDocumentFileId).getByteArray();

    Assertions.assertEquals("%PDF", new String(signedDocumentBytes, 0, 4));
    Assertions.assertTrue(signedDocumentBytes.length > 0);
    Assertions.assertEquals("%PDF", new String(receiptDocumentBytes, 0, 4));
    Assertions.assertTrue(receiptDocumentBytes.length > 0);
  }
}
