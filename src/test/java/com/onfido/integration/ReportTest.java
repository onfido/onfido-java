package com.onfido.integration;

import com.onfido.model.Applicant;
import com.onfido.model.Check;
import com.onfido.model.CheckBuilder;
import com.onfido.model.Document;
import com.onfido.model.DocumentBreakdown;
import com.onfido.model.DocumentReport;
import com.onfido.model.IdentityEnhancedProperties;
import com.onfido.model.IdentityEnhancedReport;
import com.onfido.model.Report;
import com.onfido.model.ReportDocument;
import com.onfido.model.ReportName;
import com.onfido.model.ReportStatus;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReportTest extends TestBase {
  private Applicant applicant;
  private Document document;
  private Check check;

  @BeforeEach
  public void setup() throws Exception {
    applicant = createApplicant();
    document = uploadDocument(applicant, "sample_driving_licence.png", "driving_licence");
    check =
        createCheck(
            applicant,
            document,
            new CheckBuilder().reportNames(Arrays.asList(ReportName.DOCUMENT)));
  }

  private List<Report> sortReports(List<Report> reports) {
    // TODO update after https://github.com/onfido/onfido-openapi-spec/pull/57
    // return reports.stream()
    //               .sorted(Comparator.comparing(Report::getName))
    //               .collect(Collectors.toList());

    try {
      reports.get(0).getDocumentReport();

      return reports;
    } catch (Exception ClassCastException) {
      // If sorting is not good, we swap them around
      return Arrays.asList(reports.get(1), reports.get(0));
    }
  }

  private UUID getReportId(Report report) {
    // TODO update after https://github.com/onfido/onfido-openapi-spec/pull/57
    // return report.getId();
    try {
      return report.getDocumentReport().getId();
    } catch (Exception ClassCastException) {
      return report.getIdentityEnhancedReport().getId();
    }
  }

  @Test
  public void findReportTest() throws Exception {
    List<UUID> reportIds = check.getReportIds();

    if (reportIds != null) {
      List<Report> reports =
          sortReports(
              Arrays.asList(
                  onfido.findReport(reportIds.get(0)), onfido.findReport(reportIds.get(1))));

      // TODO avoid casting after https://github.com/onfido/onfido-openapi-spec/pull/57
      DocumentReport documentReport = reports.get(0).getDocumentReport();
      IdentityEnhancedReport identityEnhancedReport = reports.get(1).getIdentityEnhancedReport();

      Assertions.assertEquals(ReportName.DOCUMENT, documentReport.getName());
      Assertions.assertEquals(ReportStatus.AWAITING_DATA, documentReport.getStatus());

      Assertions.assertEquals(ReportName.IDENTITY_ENHANCED, identityEnhancedReport.getName());
      Assertions.assertEquals(check.getId(), identityEnhancedReport.getCheckId());

      List<ReportDocument> documents = documentReport.getDocuments();

      Assertions.assertNotNull(documents);
      Assertions.assertEquals(documents.get(0).getId(), document.getId());

      Assertions.assertEquals(new DocumentBreakdown(), documentReport.getBreakdown());
      Assertions.assertEquals(
          new IdentityEnhancedProperties(), identityEnhancedReport.getProperties());
    } else {
      Assertions.fail();
      return;
    }
  }

  @Test
  public void listReportsTest() throws Exception {
    List<Report> reports = sortReports(onfido.listReports(check.getId()).getReports());

    // TODO avoid casting after https://github.com/onfido/onfido-openapi-spec/pull/57
    Assertions.assertEquals(ReportName.DOCUMENT, reports.get(0).getDocumentReport().getName());
    Assertions.assertEquals(
        ReportName.IDENTITY_ENHANCED, reports.get(1).getIdentityEnhancedReport().getName());
  }

  @Test
  public void resumeReportTest() throws Exception {
    List<UUID> reportIds = check.getReportIds();

    if (reportIds != null) {
      Report report = onfido.findReport(reportIds.get(0));
      onfido.resumeReport(getReportId(report));
    } else {
      Assertions.fail();
    }
  }

  @Test
  public void cancelReportTest() throws Exception {
    List<UUID> reportIds = check.getReportIds();

    if (reportIds != null) {
      Report report = onfido.findReport(reportIds.get(0));
      onfido.cancelReport(getReportId(report));
    } else {
      Assertions.fail();
    }
  }
}
