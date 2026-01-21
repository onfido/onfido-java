package com.onfido.integration;

import com.onfido.model.Applicant;
import com.onfido.model.Check;
import com.onfido.model.CheckBuilder;
import com.onfido.model.Document;
import com.onfido.model.DocumentReport;
import com.onfido.model.DocumentTypes;
import com.onfido.model.IdentityEnhancedBreakdown;
import com.onfido.model.IdentityEnhancedProperties;
import com.onfido.model.IdentityEnhancedReport;
import com.onfido.model.IdrSsnBreakdown;
import com.onfido.model.Report;
import com.onfido.model.ReportDocument;
import com.onfido.model.ReportName;
import com.onfido.model.ReportStatus;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReportTest extends TestBase {
  private Document document;
  private Check check;

  @BeforeEach
  public void setup() throws Exception {
    Applicant applicant = createApplicant();
    document =
        uploadDocument(applicant, "sample_driving_licence.png", DocumentTypes.DRIVING_LICENCE);
    check =
        createCheck(
            applicant,
            document,
            new CheckBuilder()
                .reportNames(Arrays.asList(ReportName.DOCUMENT, ReportName.IDENTITY_ENHANCED)));
  }

  private List<Report> sortReports(List<Report> reports) {
    return reports.stream()
        .sorted(Comparator.comparing(Report::getName))
        .collect(Collectors.toList());
  }

  @Test
  public void findReportTest() throws Exception {
    List<UUID> reportIds = check.getReportIds();

    if (reportIds != null) {
      List<Report> reports =
          sortReports(
              Arrays.asList(
                  (Report)
                      repeatRequestUntilStatusChanges(
                          "findReport",
                          new Object[] {reportIds.get(0)},
                          ReportStatus.COMPLETE,
                          MAX_RETRIES,
                          SLEEP_TIME),
                  (Report)
                      repeatRequestUntilStatusChanges(
                          "findReport",
                          new Object[] {reportIds.get(1)},
                          ReportStatus.COMPLETE,
                          MAX_RETRIES,
                          SLEEP_TIME)));

      DocumentReport documentReport = reports.get(0).getDocumentReport();
      IdentityEnhancedReport identityEnhancedReport = reports.get(1).getIdentityEnhancedReport();

      Assertions.assertEquals(ReportName.DOCUMENT, documentReport.getName());
      Assertions.assertEquals(ReportStatus.COMPLETE, documentReport.getStatus());

      Assertions.assertEquals(ReportName.IDENTITY_ENHANCED, identityEnhancedReport.getName());
      Assertions.assertEquals(check.getId(), identityEnhancedReport.getCheckId());

      List<ReportDocument> documents = documentReport.getDocuments();

      Assertions.assertNotNull(documents);
      Assertions.assertEquals(documents.get(0).getId(), document.getId());

      Assertions.assertEquals(
          new IdentityEnhancedProperties(), identityEnhancedReport.getProperties());

      IdentityEnhancedBreakdown breakdown = identityEnhancedReport.getBreakdown();

      Assertions.assertNotNull(breakdown);
      Assertions.assertNull(breakdown.getSsn());
      Assertions.assertNull(breakdown.getSsn1());
    } else {
      Assertions.fail();
      return;
    }
  }

  @Test
  public void listReportsTest() throws Exception {
    List<Report> reports = sortReports(onfido.listReports(check.getId()).getReports());

    Assertions.assertEquals(ReportName.DOCUMENT, reports.get(0).getName());
    Assertions.assertEquals(ReportName.IDENTITY_ENHANCED, reports.get(1).getName());
  }

  @Test
  public void resumeReportTest() throws Exception {
    List<UUID> reportIds = check.getReportIds();

    if (reportIds != null) {
      Report report = onfido.findReport(reportIds.get(0));
      onfido.resumeReport(report.getId());
    } else {
      Assertions.fail();
    }
  }

  @Test
  public void cancelReportTest() throws Exception {
    List<UUID> reportIds = check.getReportIds();

    if (reportIds != null) {
      Report report = onfido.findReport(reportIds.get(0));
      onfido.cancelReport(report.getId());
    } else {
      Assertions.fail();
    }
  }
}
