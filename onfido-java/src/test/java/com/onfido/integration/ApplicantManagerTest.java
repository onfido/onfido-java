package com.onfido.integration;

import static org.junit.Assert.assertEquals;

import com.onfido.JsonObject;
import com.onfido.Onfido;
import com.onfido.models.Applicant;

import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import java.util.Comparator;
import java.util.stream.Collectors;

import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class ApplicantManagerTest extends TestsHelper {
  private Applicant applicant;

  @BeforeMethod
  public void setup() throws Exception {
    applicant = createApplicant();
  }

  @AfterMethod
  public void cleanUp() throws Exception {
    if (!isMockingEnabled()) {
      onfido.applicant.delete(applicant.getId());
    }
  }

  @Test
  public void createApplicantTest() throws Exception {
    Applicant applicant = createApplicant();

    assertRequestField("first_name", "First");
    assertEquals("First", applicant.getFirstName());
    assertEquals("Last", applicant.getLastName());
  }

  @Test
  public void findApplicantTest() throws Exception {
    Applicant applicant = createApplicant();

    prepareMock(new JsonObject().add("first_name", "First")
                                .add("last_name", "Last"));

    Applicant lookupApplicant = onfido.applicant.find(applicant.getId());

    takeRequest("/applicants/" + applicant.getId());

    assertEquals("First", applicant.getFirstName());
    assertEquals("Last", applicant.getLastName());
  }

  @Test
  public void updateApplicantTest() throws Exception {
    Applicant applicant = createApplicant();

    prepareMock(new JsonObject().add("first_name", "Updated")
                                .add("last_name", "Last"));

    Applicant updatedApplicant = onfido.applicant.update(applicant.getId(),
                                                         Applicant.request().firstName("Updated"));

    takeRequest("/applicants/" + applicant.getId());

    assertRequestField("first_name", "Updated");
    assertEquals("Updated", updatedApplicant.getFirstName());
  }

  @Test
  public void deleteApplicantTest() throws Exception {
    Applicant applicant = createApplicant();

    prepareMock(new JsonObject());
    onfido.applicant.delete(applicant.getId());
    takeRequest("/applicants/" + applicant.getId());
  }

  @Test
  public void restoreApplicantTest() throws Exception {
    Applicant applicant = createApplicant();

    prepareMock(new JsonObject());
    onfido.applicant.delete(applicant.getId());
    takeRequest("/applicants/" + applicant.getId());

    prepareMock(new JsonObject());
    onfido.applicant.restore(applicant.getId());
    takeRequest("/applicants/" + applicant.getId() + "/restore");
  }

  @Test
  public void listApplicants() throws Exception {
    Applicant applicant1 = createApplicant("Applicant1");
    Applicant applicant2 = createApplicant("Applicant2");

    prepareMock(
        new JsonObject()
            .add(
                "applicants",
                Arrays.asList(
                    new JsonObject().add("first_name", "Applicant1").map,
                    new JsonObject().add("first_name", "Applicant2").map)));

    List<Applicant> applicants = onfido.applicant.list(1, 20, false).stream()
                                                 .sorted(Comparator.comparing(Applicant::getFirstName))
                                                 .collect(Collectors.toList());

    takeRequest("/applicants/?page=1&per_page=20&include_deleted=false");

    assertEquals("Applicant1", applicants.get(0).getFirstName());
    assertEquals("Applicant2", applicants.get(1).getFirstName());
  }
}
