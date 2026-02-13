package com.onfido.integration;

import com.onfido.model.Applicant;
import com.onfido.model.ApplicantConsent;
import com.onfido.model.ApplicantConsentBuilder;
import com.onfido.model.ApplicantConsentName;
import com.onfido.model.ApplicantUpdater;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ApplicantTest extends TestBase {
  private Applicant applicant;

  @BeforeEach
  public void setup() throws Exception {
    applicant = createApplicant();
  }

  @AfterEach
  public void cleanUp() throws Exception {
    onfido.deleteApplicant(applicant.getId()).execute();
  }

  @Test
  public void createApplicantTest() throws Exception {
    Applicant applicant = createApplicant();

    Assertions.assertEquals("First", applicant.getFirstName());
    Assertions.assertEquals("Last", applicant.getLastName());

    Assertions.assertNotNull(applicant.toJson());
  }

  @Test
  public void findApplicantTest() throws Exception {
    Applicant applicant = createApplicant();
    Applicant lookupApplicant = onfido.findApplicant(applicant.getId()).execute();

    Assertions.assertEquals("First", lookupApplicant.getFirstName());
    Assertions.assertEquals("Last", lookupApplicant.getLastName());

    Assertions.assertNotNull(lookupApplicant.toJson());
  }

  @Test
  public void updateApplicantTest() throws Exception {
    Applicant updatedApplicant =
        onfido
            .updateApplicant(applicant.getId(), new ApplicantUpdater().firstName("Updated"))
            .execute();

    Assertions.assertEquals("Updated", updatedApplicant.getFirstName());
    Assertions.assertEquals("Last", updatedApplicant.getLastName());

    Assertions.assertNotNull(updatedApplicant.toJson());
  }

  @Test
  public void findApplicantConsentsTest() throws Exception {
    List<ApplicantConsentBuilder> consents =
        Arrays.asList(
            new ApplicantConsentBuilder()
                .name(ApplicantConsentName.PRIVACY_NOTICES_READ)
                .granted(true),
            new ApplicantConsentBuilder().name(ApplicantConsentName.SSN_VERIFICATION).granted(true),
            new ApplicantConsentBuilder()
                .name(ApplicantConsentName.PHONE_NUMBER_VERIFICATION)
                .granted(true));

    onfido.updateApplicant(applicant.getId(), new ApplicantUpdater().consents(consents)).execute();

    List<ApplicantConsent> actualConsents =
        onfido.findApplicantConsents(applicant.getId()).execute();

    Map<ApplicantConsentName, Boolean> expectedConsents =
        consents.stream()
            .collect(
                Collectors.toMap(
                    ApplicantConsentBuilder::getName, ApplicantConsentBuilder::getGranted));

    Map<ApplicantConsentName, Boolean> actualConsentsMap =
        actualConsents.stream()
            .collect(Collectors.toMap(ApplicantConsent::getName, ApplicantConsent::getGranted));

    Assertions.assertEquals(expectedConsents, actualConsentsMap);
  }

  @Test
  public void deleteApplicantTest() throws Exception {
    Applicant applicant = createApplicant();

    onfido.deleteApplicant(applicant.getId()).execute();
  }

  @Test
  public void restoreApplicantTest() throws Exception {
    Applicant applicant = createApplicant();

    onfido.deleteApplicant(applicant.getId()).execute();
    onfido.restoreApplicant(applicant.getId()).execute();
  }

  @Test
  public void listApplicants() throws Exception {
    createApplicant("Applicant1");
    createApplicant("Applicant2");

    List<Applicant> applicants =
        onfido
            .listApplicants()
            .page(1)
            .perPage(20)
            .includeDeleted(false)
            .execute()
            .getApplicants()
            .stream()
            .sorted(Comparator.comparing(Applicant::getFirstName))
            .collect(Collectors.toList());

    Assertions.assertEquals("Applicant1", applicants.get(0).getFirstName());
    Assertions.assertEquals("Applicant2", applicants.get(1).getFirstName());

    Assertions.assertNotNull(applicants.get(0).toJson());
    Assertions.assertNotNull(applicants.get(1).toJson());
  }
}
