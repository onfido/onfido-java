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
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
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
    return reports.stream()
        .sorted(Comparator.comparing(Report::getName))
        .collect(Collectors.toList());
  }

  private UUID getReportId(Report report) {
    return report.getId();
  }

  @Test
  public void findReportTest() throws Exception {
    List<UUID> reportIds = check.getReportIds();

    if (reportIds != null) {
      List<Report> reports =
          sortReports(
              Arrays.asList(
                  onfido.findReport(reportIds.get(0)), onfido.findReport(reportIds.get(1))));

      Assertions.assertEquals(ReportName.DOCUMENT, reports.get(0).getName());
      Assertions.assertEquals(ReportStatus.AWAITING_DATA, reports.get(0).getStatus());

      Assertions.assertEquals(ReportName.IDENTITY_ENHANCED, reports.get(1).getName());
      Assertions.assertEquals(check.getId(), reports.get(1).getCheckId());

      List<ReportDocument> documents = reports.get(0).getDocuments();

      Assertions.assertNotNull(documents);
      Assertions.assertEquals(documents.get(0).getId(), document.getId());

      Assertions.assertEquals(
          new DocumentBreakdown(), reports.get(0).getDocumentReport().getBreakdown());
      Assertions.assertEquals(
          new IdentityEnhancedProperties(),
          reports.get(1).getIdentityEnhancedReport().getProperties());
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
