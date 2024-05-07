package com.onfido.integration;

import com.onfido.model.*;

import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.onfido.model.ReportStatus.COMPLETE;

public class ReportSchemasTest extends TestBase {
  private Applicant applicant;
  private Document document;

  @BeforeEach
  public void setup() throws Exception {
    applicant = createApplicant();
    document = uploadDocument(applicant, "sample_driving_licence.png", "driving_licence");
  }

  @Test
  public void schemaOfDocumentReportIsValid() throws Exception {
    Check check =
        createCheck(
            applicant,
            document,
            new CheckBuilder().reportNames(Arrays.asList(ReportName.DOCUMENT)));

    DocumentReport documentReport =
        onfido.findReport(check.getReportIds().get(0)).getDocumentReport();

    int iteration = 0;
    while (!documentReport.getStatus().equals(COMPLETE)) {
      if (iteration > 10) {
        Assertions.fail("Report did not complete in time");
      }
      iteration += 1;
      Thread.sleep(1000);
      documentReport = onfido.findReport(check.getReportIds().get(0)).getDocumentReport();
    }
  }

  @Test
  public void schemaOfFacialSimilarityPhotoReportIsValid() throws Exception {
    uploadLivePhoto(applicant, "sample_photo.png");

    Check check =
        createCheck(
            applicant,
            document,
            new CheckBuilder()
                .reportNames(Arrays.asList(ReportName.FACIAL_SIMILARITY_PHOTO_FULLY_AUTO)));

    FacialSimilarityPhotoFullyAutoReport facialSimilarityPhotoFullyAutoReport =
        onfido.findReport(check.getReportIds().get(0)).getFacialSimilarityPhotoFullyAutoReport();

    int iteration = 0;
    while (!facialSimilarityPhotoFullyAutoReport.getStatus().equals(COMPLETE)) {
      if (iteration > 10) {
        Assertions.fail("Report did not complete in time");
      }
      iteration += 1;
      Thread.sleep(1000);
      facialSimilarityPhotoFullyAutoReport =
          onfido.findReport(check.getReportIds().get(0)).getFacialSimilarityPhotoFullyAutoReport();
    }
  }
}
