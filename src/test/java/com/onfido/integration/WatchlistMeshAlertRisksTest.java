package com.onfido.integration;

import com.google.gson.internal.LinkedTreeMap;
import com.onfido.model.AddressBuilder;
import com.onfido.model.Applicant;
import com.onfido.model.ApplicantBuilder;
import com.onfido.model.CountryCodes;
import com.onfido.model.Task;
import com.onfido.model.TaskItem;
import com.onfido.model.WatchlistMeshAlertRisk;
import com.onfido.model.WorkflowRun;
import com.onfido.model.WorkflowRunBuilder;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WatchlistMeshAlertRisksTest extends TestBase {
  private static final UUID WORKFLOW_ID = UUID.fromString("18effbfe-73c3-4680-ae43-e1c474767ff4");

  @Test
  public void listWatchlistMeshAlertRisks() throws Exception {
    Applicant applicant =
        onfido
            .createApplicant(
                new ApplicantBuilder()
                    .firstName("Donald")
                    .lastName("Consider")
                    .dob(LocalDate.of(1990, 1, 1))
                    .address(
                        new AddressBuilder()
                            .country(CountryCodes.PRT)
                            .town("Town")
                            .street("Street")
                            .buildingNumber("12")
                            .postcode("12345")))
            .execute();

    Map<String, Object> nationalId = new HashMap<>();
    nationalId.put("type", "passport");
    nationalId.put("value", "P1234567");

    Map<String, Object> customData = new HashMap<>();
    customData.put("national_id", nationalId);
    customData.put("nationality", "PRT");

    WorkflowRun workflowRun =
        onfido
            .createWorkflowRun(
                new WorkflowRunBuilder()
                    .workflowId(WORKFLOW_ID)
                    .applicantId(applicant.getId())
                    .customData(customData))
            .execute();

    TaskItem task =
        onfido.listTasks(workflowRun.getId()).execute().stream()
            .filter(
                workflowTask ->
                    workflowTask.getTaskDefId().equals("query_watchlists_complyadvantage_mesh"))
            .findFirst()
            .orElseThrow(() -> new AssertionError("Watchlist Mesh task was not created"));

    Task watchlistTask =
        repeatRequestUntilTaskOutputChanges(
            "findTask", new Object[] {workflowRun.getId(), task.getId()}, 30, 2000);
    LinkedTreeMap output = (LinkedTreeMap) watchlistTask.getOutput();
    LinkedTreeMap properties = (LinkedTreeMap) output.get("properties");
    UUID alertId = UUID.fromString((String) properties.get("alert_identifier"));

    List<WatchlistMeshAlertRisk> risks =
        onfido.listWatchlistMeshAlertRisks(alertId).page(1).perPage(1).execute();

    Assertions.assertFalse(risks.isEmpty());
    Assertions.assertTrue(risks.size() <= 1);
    Assertions.assertNotNull(risks.get(0).getIdentifier());
    Assertions.assertNotNull(risks.get(0).getDecision());
    Assertions.assertNotNull(risks.get(0).getDetail());
  }
}
