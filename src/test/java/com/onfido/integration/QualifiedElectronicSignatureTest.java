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

public class QualifiedElectronicSignatureTest extends TestBase {

  @Test
  public void documentsTest() throws Exception {
    UUID applicantId = createApplicant().getId();
    UUID workflowId = UUID.fromString("8b74614f-9e7f-42fd-852a-5f2bcc852587");

    Map<String, Object> customData = new HashMap<>();
    customData.put("country_of_operation", "GBR");
    customData.put("document_date_of_expiry", "2022-01-01");
    customData.put("document_issuing_country", "FRA");
    customData.put("document_issuing_date", "2022-01-01");
    customData.put("document_number", "Example string");
    customData.put(
        "document_to_sign_url",
        "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf");
    customData.put("document_type", "driving_licence");

    WorkflowRun workflowRun =
        onfido
            .createWorkflowRun(
                new WorkflowRunBuilder()
                    .workflowId(workflowId)
                    .applicantId(applicantId)
                    .customData(customData))
            .execute();
    UUID workflowRunId = workflowRun.getId();

    TaskItem task = onfido.listTasks(workflowRunId).execute().get(1);

    LinkedTreeMap output =
        (LinkedTreeMap)
            repeatRequestUntilTaskOutputChanges(
                    "findTask", new Object[] {workflowRunId, task.getId()}, 10, 3000)
                .getOutput();

    LinkedTreeMap properties = (LinkedTreeMap) output.get("properties");
    ArrayList signedDocuments = (ArrayList) properties.get("signed_documents");
    LinkedTreeMap signedDocument = (LinkedTreeMap) signedDocuments.get(0);
    UUID fileId = UUID.fromString((String) signedDocument.get("id"));

    byte[] byteArray = onfido.downloadQesDocument(workflowRunId, fileId).execute().getByteArray();

    Assertions.assertEquals("%PDF", new String(byteArray, 0, 4));
    Assertions.assertTrue(byteArray.length > 0);
  }
}
