package com.onfido.integration;

import static org.junit.Assert.assertEquals;

import com.onfido.JsonObject;
import com.onfido.Onfido;

import com.onfido.models.Applicant;
import com.onfido.models.Check;
import com.onfido.models.Document;
import com.onfido.models.Report;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReportManagerTest extends TestsHelper {
  private Applicant applicant;
  private Document document;
  private Check check;

  @BeforeMethod
  public void setup() throws Exception {
    applicant = createApplicant();
    document = uploadDocument(applicant, "file.png");
    check = createCheck(applicant, document,
      Check.request().reportNames("document"));
  }

  private Report findReport(String reportId, String mockedReportName) throws Exception {
    prepareMock(new JsonObject().add("name", mockedReportName));
    Report report = onfido.report.find(reportId);
    takeRequest("/reports/" + reportId);

    return report;
  }

  @Test
  public void findReportTest() throws Exception {
    // Get both reports in a list and sort them according their name
    List<Report> reports = Arrays.asList(
      findReport(check.getReportIds().get(0), "identity_enhanced"),
      findReport(check.getReportIds().get(1), "document")).stream()
        .sorted(Comparator.comparing(Report::getName))
        .collect(Collectors.toList());

    assertEquals("document", reports.get(0).getName());
    assertEquals("identity_enhanced", reports.get(1).getName());
  }

  @Test
  public void listReportsTest() throws Exception {
    prepareMock(new JsonObject().add("reports", Arrays.asList(
                            new JsonObject().add("name", "document").map,
                            new JsonObject().add("name", "identity_enhanced").map)));

    List<Report> reports = onfido.report.list(check.getId()).stream()
                                        .sorted(Comparator.comparing(Report::getName))
                                        .collect(Collectors.toList());

    takeRequest("/reports/?check_id=" + check.getId());

    assertEquals("document", reports.get(0).getName());
    assertEquals("identity_enhanced", reports.get(1).getName());
  }

  @Test
  public void resumeReportTest() throws Exception {
    Report report = findReport(check.getReportIds().get(0), "document");

    prepareMock("", null, 204);
    onfido.report.resume(report.getId());
    takeRequest("/reports/" + report.getId() + "/resume");
  }

  @Test
  public void cancelReportTest() throws Exception {
    Report report = findReport(check.getReportIds().get(0), "document");

    prepareMock("", null, 204);
    onfido.report.cancel(report.getId());
    takeRequest("/reports/" + report.getId() + "/cancel");
  }
}
