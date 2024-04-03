package com.onfido.integration;

import com.onfido.model.Applicant;
import com.onfido.model.Check;
import com.onfido.model.CheckBuilder;
import com.onfido.model.Document;
import com.onfido.model.UsDrivingLicenceBuilder;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CheckTest extends TestBase {
  private Applicant applicant;
  private Document document;

  @BeforeEach
  public void setup() throws Exception {
    applicant = createApplicant();
    document = uploadDocument(applicant, "sample_driving_licence.png", "driving_licence");
  }

  @Test
  public void createCheckTest() throws Exception {
    Check check =
        createCheck(applicant, document, new CheckBuilder().reportNames(Arrays.asList("document")));

    Assertions.assertEquals(applicant.getId(), check.getApplicantId());
    Assertions.assertEquals(null, check.getWebhookIds());
  }

  @Test
  public void createSubResultCheckTest() throws Exception {
    Check check =
        createCheck(
            applicant,
            document,
            new CheckBuilder().reportNames(Arrays.asList("document")).subResult("rejected"));
    Assertions.assertEquals(applicant.getId(), check.getApplicantId());
  }

  @Test
  public void createConsiderCheckTest() throws Exception {
    Check check =
        createCheck(
            applicant,
            document,
            new CheckBuilder()
                .reportNames(Arrays.asList("document", "identity_enhanced"))
                .consider(Arrays.asList("identity_enhanced")));

    Assertions.assertEquals(applicant.getId(), check.getApplicantId());
  }

  @Test
  public void createDrivingLicenceCheckTest() throws Exception {
    Check check =
        createCheck(
            applicant,
            document,
            new CheckBuilder()
                .reportNames(Arrays.asList("document"))
                .consider(Arrays.asList("identity_enhanced"))
                .reportNames(Arrays.asList("us_driving_licence"))
                .usDrivingLicence(new UsDrivingLicenceBuilder().idNumber("12345").state("GA")));

    Assertions.assertEquals(applicant.getId(), check.getApplicantId());
  }

  @Test
  public void findCheckTest() throws Exception {
    Check check =
        createCheck(applicant, document, new CheckBuilder().reportNames(Arrays.asList("document")));

    Check lookupCheck = onfido.findCheck(check.getId());

    Assertions.assertEquals(check.getApplicantId(), lookupCheck.getApplicantId());
  }

  @Test
  public void listChecks() throws Exception {
    createCheck(applicant, document, new CheckBuilder().reportNames(Arrays.asList("document")));

    List<Check> checks = onfido.listChecks(applicant.getId()).getChecks();

    Assertions.assertEquals(applicant.getId(), checks.get(0).getApplicantId());
    Assertions.assertEquals(1, checks.size());
  }

  @Test
  public void resumeCheckTest() throws Exception {
    Check check =
        createCheck(applicant, document, new CheckBuilder().reportNames(Arrays.asList("document")));

    onfido.resumeCheck(check.getId());
  }

  @Test
  public void downloadCheckTest() throws Exception {
    Check check =
        createCheck(applicant, document, new CheckBuilder().reportNames(Arrays.asList("document")));

    File download = onfido.downloadCheck(check.getId());
    Assertions.assertTrue(download.length() > 0);
  }
}
