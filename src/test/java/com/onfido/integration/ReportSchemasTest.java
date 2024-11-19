package com.onfido.integration;

import static com.onfido.model.ReportStatus.COMPLETE;

import com.onfido.model.*;
import java.time.LocalDate;
import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReportSchemasTest extends TestBase {
  private Applicant applicant;
  private Document document;

  @BeforeEach
  public void setup() throws Exception {
    applicant = createApplicant();
    document =
        uploadDocument(applicant, "sample_driving_licence.png", DocumentTypes.DRIVING_LICENCE);
  }

  @Test
  public void schemaOfDocumentReportIsValid() throws Exception {
    Check check =
        createCheck(
            applicant,
            document,
            new CheckBuilder().reportNames(Arrays.asList(ReportName.DOCUMENT)));

    Report documentReport =
        (Report)
            repeatRequestUntilStatusChanges(
                "findReport", new Object[] {check.getReportIds().get(0)}, COMPLETE, 10, 1000);

    Assertions.assertEquals(COMPLETE, documentReport.getStatus());
    Assertions.assertEquals(ReportName.DOCUMENT, documentReport.getName());
    Assertions.assertEquals(check.getId(), documentReport.getReportShared().getCheckId());
    Assertions.assertNotNull(documentReport.getDocumentReport().getBreakdown());
    Assertions.assertNotNull(documentReport.getDocumentReport().getProperties());
    Assertions.assertNotNull(documentReport.getReportShared().getResult());
    Assertions.assertNotNull(documentReport.getReportShared().getSubResult());

    Assertions.assertEquals(
        "clear",
        documentReport
            .getDocumentReport()
            .getBreakdown()
            .getDataComparison()
            .getBreakdown()
            .getIssuingCountry()
            .getResult());
    Assertions.assertEquals(
        LocalDate.parse("1990-01-01"),
        documentReport.getDocumentReport().getProperties().getDateOfBirth());
    Assertions.assertEquals(check.getId(), documentReport.getReportShared().getCheckId());
    Assertions.assertNotNull(documentReport.getDocumentReport().getBreakdown());
    Assertions.assertNotNull(documentReport.getDocumentReport().getProperties());
    Assertions.assertNull(documentReport.getDocumentReport().getProperties().getDocumentSubtype());

    Assertions.assertNotNull(documentReport.getDocumentReport().toJson());
    Assertions.assertNotNull(documentReport.getDocumentReport().getBreakdown().toJson());
    Assertions.assertNotNull(documentReport.getDocumentReport().getProperties().toJson());
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

    Report facialSimilarityPhotoFullyAutoReport =
        (Report)
            repeatRequestUntilStatusChanges(
                "findReport", new Object[] {check.getReportIds().get(0)}, COMPLETE, 10, 1000);

    Assertions.assertEquals(COMPLETE, facialSimilarityPhotoFullyAutoReport.getStatus());
    Assertions.assertEquals(
        ReportName.FACIAL_SIMILARITY_PHOTO_FULLY_AUTO,
        facialSimilarityPhotoFullyAutoReport.getName());
    Assertions.assertEquals(
        check.getId(), facialSimilarityPhotoFullyAutoReport.getReportShared().getCheckId());
    Assertions.assertNotNull(
        facialSimilarityPhotoFullyAutoReport
            .getFacialSimilarityPhotoFullyAutoReport()
            .getBreakdown());
    Assertions.assertNotNull(facialSimilarityPhotoFullyAutoReport.getReportShared().getResult());
    Assertions.assertNotNull(
        facialSimilarityPhotoFullyAutoReport
            .getFacialSimilarityPhotoFullyAutoReport()
            .getProperties());

    Assertions.assertNotNull(
        facialSimilarityPhotoFullyAutoReport.getFacialSimilarityPhotoFullyAutoReport().toJson());
    Assertions.assertNotNull(
        facialSimilarityPhotoFullyAutoReport
            .getFacialSimilarityPhotoFullyAutoReport()
            .getProperties()
            .toJson());
  }

  @Test
  public void schemaOfDocumentWithAddressInformationReportIsValid() throws Exception {
    uploadLivePhoto(applicant, "sample_photo.png");

    Check check =
        createCheck(
            applicant,
            document,
            new CheckBuilder()
                .reportNames(Arrays.asList(ReportName.DOCUMENT_WITH_ADDRESS_INFORMATION)));

    Report report =
        (Report)
            repeatRequestUntilStatusChanges(
                "findReport", new Object[] {check.getReportIds().get(0)}, COMPLETE, 10, 1000);

    Assertions.assertEquals(COMPLETE, report.getStatus());
    Assertions.assertEquals(ReportName.DOCUMENT_WITH_ADDRESS_INFORMATION, report.getName());
    Assertions.assertEquals(check.getId(), report.getReportShared().getCheckId());
    Assertions.assertNotNull(report.getDocumentWithAddressInformationReport().getBreakdown());
    Assertions.assertNotNull(report.getReportShared().getResult());

    Assertions.assertEquals(
        "driving_licence",
        report
            .getDocumentWithAddressInformationReport()
            .getProperties()
            .getBarcode()
            .getDocumentType());
  }

  @Test
  public void schemaOfFacialSimilarityPhotoFullyAutoReportIsValid() throws Exception {
    uploadLivePhoto(applicant, "sample_photo.png");

    Check check =
        createCheck(
            applicant,
            document,
            new CheckBuilder()
                .reportNames(Arrays.asList(ReportName.FACIAL_SIMILARITY_PHOTO_FULLY_AUTO)));

    Report report =
        (Report)
            repeatRequestUntilStatusChanges(
                "findReport", new Object[] {check.getReportIds().get(0)}, COMPLETE, 10, 1000);

    Assertions.assertEquals(COMPLETE, report.getStatus());
    Assertions.assertEquals(ReportName.FACIAL_SIMILARITY_PHOTO_FULLY_AUTO, report.getName());
    Assertions.assertEquals(check.getId(), report.getReportShared().getCheckId());

    FacialSimilarityPhotoFullyAutoReport facialSimilarityPhotoFullyAutoReport =
        report.getFacialSimilarityPhotoFullyAutoReport();

    Assertions.assertNotNull(facialSimilarityPhotoFullyAutoReport.getLivePhotos());
    Assertions.assertNotNull(facialSimilarityPhotoFullyAutoReport.getLiveVideos());
    Assertions.assertNotNull(facialSimilarityPhotoFullyAutoReport.getMotionCaptures());
    Assertions.assertNotNull(facialSimilarityPhotoFullyAutoReport.getIdPhotos());
  }
}
