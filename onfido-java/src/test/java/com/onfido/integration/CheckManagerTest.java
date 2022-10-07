package com.onfido.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.api.FileDownload;
import com.onfido.models.Applicant;
import com.onfido.models.Check;
import com.onfido.models.Document;

import java.util.Arrays;
import java.util.List;

import com.onfido.models.DrivingLicence;

import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CheckManagerTest extends TestBase {
  private Applicant applicant;
  private Document document;

  @BeforeMethod
  public void setup() throws Exception {
    applicant = createApplicant();
    document = uploadDocument(applicant, "file.png");
  }

  @Test
  public void createCheckTest() throws Exception {
    Check check = createCheck(applicant, document,
      Check.request().reportNames("document"));

    assertRequestField("applicant_id", applicant.getId());
    assertRequestField("privacy_notices_read_consent_given", true);

    assertEquals(applicant.getId(), check.getApplicantId());
    assertEquals(null, check.getWebhookIds());
    assertTrue(check.getPrivacyNoticesReadConsentGiven());
  }

  @Test
  public void createSubResultCheckTest() throws Exception {
    Check check = createCheck(applicant, document,
      Check.request().reportNames("document").subResult("rejected"));

    assertRequestField("applicant_id", applicant.getId());
    assertRequestField("sub_result", "rejected");

    assertEquals(applicant.getId(), check.getApplicantId());
  }

  @Test
  public void createConsiderCheckTest() throws Exception {
    Check check = createCheck(applicant, document,
      Check.request().reportNames("document", "identity_enhanced")
                     .consider("identity_enhanced"));

    assertRequestField("applicant_id", applicant.getId());
    assertRequestField("consider", List.of("identity_enhanced"));

    assertEquals(applicant.getId(), check.getApplicantId());
  }

  @Test
  public void createDrivingLicenceCheckTest() throws Exception {
    skipTestIfMockingNotEnabled();

    Check check = createCheck(applicant, document,
      Check.request().reportNames("document")
                    .consider("identity_enhanced")
                    .reportNames("us_driving_licence")
                    .usDrivingLicence(DrivingLicence.request().idNumber("12345")
                                                              .state("GA")));

    assertRequestField("applicant_id", applicant.getId());

    assertEquals(applicant.getId(), check.getApplicantId());
  }

  @Test
  public void findCheckTest() throws Exception {
    Check check = createCheck(applicant, document,
      Check.request().reportNames("document"));

    prepareMock(new JsonObject().add("applicant_id", applicant.getId()));

    Check lookupCheck = onfido.check.find(check.getId());

    takeRequest("/checks/" + check.getId());

    assertEquals(check.getApplicantId(), lookupCheck.getApplicantId());
  }

  @Test
  public void listChecks() throws Exception {
    Check check = createCheck(applicant, document,
      Check.request().reportNames("document"));

    prepareMock(new JsonObject().add("checks",
      Arrays.asList(new JsonObject().add("applicant_id", applicant.getId()).map)));

    List<Check> checks = onfido.check.list(applicant.getId());

    takeRequest("/checks/?applicant_id=" + applicant.getId());

    assertEquals(applicant.getId(), checks.get(0).getApplicantId());
    assertEquals(1, checks.size());
  }

  @Test
  public void resumeCheckTest() throws Exception {
    Check check = createCheck(applicant, document,
      Check.request().reportNames("document"));

    prepareMock(new JsonObject());
    onfido.check.resume(check.getId());
    takeRequest("/checks/" + check.getId() + "/resume");
  }

  @Test
  public void downloadCheckTest() throws Exception {
    Check check = createCheck(applicant, document,
      Check.request().reportNames("document"));

    prepareMock("test", "application/pdf", 200);

    FileDownload download = onfido.check.download(check.getId());

    takeRequest("/checks/" + check.getId() + "/download");

    assertEquals("application/pdf", download.contentType);
    assertTrue(download.content.length > 0);
  }
}
