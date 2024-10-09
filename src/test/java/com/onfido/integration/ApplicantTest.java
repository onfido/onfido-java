package com.onfido.integration;

import com.onfido.model.Applicant;
import com.onfido.model.ApplicantUpdater;
import java.util.Comparator;
import java.util.List;
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
    onfido.deleteApplicant(applicant.getId());
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
    Applicant lookupApplicant = onfido.findApplicant(applicant.getId());

    Assertions.assertEquals("First", lookupApplicant.getFirstName());
    Assertions.assertEquals("Last", lookupApplicant.getLastName());

    Assertions.assertNotNull(lookupApplicant.toJson());
  }

  @Test
  public void updateApplicantTest() throws Exception {
    Applicant updatedApplicant =
        onfido.updateApplicant(applicant.getId(), new ApplicantUpdater().firstName("Updated"));

    Assertions.assertEquals("Updated", updatedApplicant.getFirstName());
    Assertions.assertEquals("Last", updatedApplicant.getLastName());

    Assertions.assertNotNull(updatedApplicant.toJson());
  }

  @Test
  public void deleteApplicantTest() throws Exception {
    Applicant applicant = createApplicant();

    onfido.deleteApplicant(applicant.getId());
  }

  @Test
  public void restoreApplicantTest() throws Exception {
    Applicant applicant = createApplicant();

    onfido.deleteApplicant(applicant.getId());
    onfido.restoreApplicant(applicant.getId());
  }

  @Test
  public void listApplicants() throws Exception {
    createApplicant("Applicant1");
    createApplicant("Applicant2");

    List<Applicant> applicants =
        onfido.listApplicants(1, 20, false).getApplicants().stream()
            .sorted(Comparator.comparing(Applicant::getFirstName))
            .collect(Collectors.toList());

    Assertions.assertEquals("Applicant1", applicants.get(0).getFirstName());
    Assertions.assertEquals("Applicant2", applicants.get(1).getFirstName());

    Assertions.assertNotNull(applicants.get(0).toJson());
    Assertions.assertNotNull(applicants.get(1).toJson());
  }
}
