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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicantManagerTest extends ApiIntegrationTest {

  public Applicant getApplicant( String first_name, int id ) throws Exception {
    prepareMock(new JsonObject().add("first_name", first_name)
                                .add("last_name", "Last")
                                .add("id", String.valueOf(id)));

    Applicant applicant = onfido.applicant.create(
               Applicant.request().firstName(first_name)
                                  .lastName("Last"));

    takeRequest("/applicants/");

    return applicant;
  }

  public Applicant getApplicant() throws Exception {
    return getApplicant("First", 1);
  }

  @AfterTest()
  public void cleanUp() throws Exception {
    String sampleApplicantId = System.getenv("ONFIDO_SAMPLE_APPLICANT_ID");

    if ( isMockingEnabled() ) {
      return;
    }

    for (Applicant applicant : onfido.applicant.list(1, 20, false)) {
      if ( applicant.getId() != sampleApplicantId ) {
        onfido.applicant.delete(applicant.getId());
      }
    }
  }

  @Test
  public void createApplicant() throws Exception {
    Applicant applicant = getApplicant();

    assertRequestField("first_name", "First");
    assertEquals("First", applicant.getFirstName());
    assertEquals("Last", applicant.getLastName());
  }

  @Test
  public void findApplicant() throws Exception {
    Applicant applicant = getApplicant();

    prepareMock(new JsonObject().add("first_name", "First")
                                .add("last_name", "Last"));

    Applicant lookupApplicant = onfido.applicant.find(applicant.getId());

    takeRequest("/applicants/" + applicant.getId());

    assertEquals("First", applicant.getFirstName());
    assertEquals("Last", applicant.getLastName());
  }

  @Test
  public void updateApplicant() throws Exception {
    Applicant applicant = getApplicant();

    prepareMock(new JsonObject().add("first_name", "Updated")
                                .add("last_name", "Last"));

    Applicant updatedApplicant = onfido.applicant.update(applicant.getId(),
                                                         Applicant.request().firstName("Updated"));

    takeRequest("/applicants/" + applicant.getId());

    assertRequestField("first_name", "Updated");
    assertEquals("Updated", updatedApplicant.getFirstName());
  }

  @Test
  public void deleteApplicant() throws Exception {
    Applicant applicant = getApplicant();

    prepareMock(new JsonObject());
    onfido.applicant.delete(applicant.getId());
    takeRequest("/applicants/" + applicant.getId());
  }

  @Test
  public void restoreApplicant() throws Exception {
    Applicant applicant = getApplicant();

    prepareMock(new JsonObject());
    onfido.applicant.delete(applicant.getId());
    takeRequest("/applicants/" + applicant.getId());

    prepareMock(new JsonObject());
    onfido.applicant.restore(applicant.getId());
    takeRequest("/applicants/" + applicant.getId() + "/restore");
  }

  @Test
  public void listApplicants() throws Exception {
    Applicant applicant1 = getApplicant("Applicant1", 1);
    Applicant applicant2 = getApplicant("Applicant2", 2);

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
