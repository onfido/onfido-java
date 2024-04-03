package com.onfido.integration;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.onfido.ApiException;
import com.onfido.Configuration;
import com.onfido.api.DefaultApi;
import com.onfido.model.Applicant;
import com.onfido.model.ApplicantBuilder;
import com.onfido.model.Check;
import com.onfido.model.CheckBuilder;
import com.onfido.model.CountryCodes;
import com.onfido.model.Document;
import com.onfido.model.LocationBuilder;
import com.onfido.model.ReportName;
import com.onfido.model.Webhook;

@TestInstance(Lifecycle.PER_CLASS)
public class TestBase {

  static private final String apiToken = System.getenv("ONFIDO_API_TOKEN");

  static protected final UUID sampleApplicantId = UUID.fromString(System.getenv("ONFIDO_SAMPLE_APPLICANT_ID"));
  static protected final UUID nonExistingId = UUID.fromString("00000000-0000-0000-0000-000000000000");

  protected DefaultApi onfido;

  public TestBase() {
    onfido = new DefaultApi(Configuration.getDefaultApiClient()
                  .setApiToken(apiToken)
                  .setConnectTimeout(60_000)
                  .setReadTimeout(60_000));
  }

  @AfterAll
  private void tearDownAndCleanUp() throws IOException, ApiException {
    cleanUpApplicants();
    cleanUpWebhooks();
  }


  public Applicant createApplicant(String first_name) throws IOException, InterruptedException, ApiException {
    Applicant applicant = onfido.createApplicant(new ApplicantBuilder()
                                                      .firstName(first_name)
                                                      .lastName("Last")
                                                      .location(new LocationBuilder()
                                                        .ipAddress("127.0.0.1")
                                                        .countryOfResidence(CountryCodes.GBR)));

    return applicant;
  }

  public Applicant createApplicant() throws IOException, InterruptedException, ApiException {
    return createApplicant("First");
  }

  protected Document uploadDocument(Applicant applicant, String filename, String document_type) throws IOException, InterruptedException, ApiException {
    File file = new File("media/" + filename);

    LocationBuilder locationBuilder = new LocationBuilder()
                                          .ipAddress("127.0.0.1")
                                          .countryOfResidence(CountryCodes.GBR);

    return onfido.uploadDocument(document_type, applicant.getId(), file, null, "front", CountryCodes.USA, null,
    locationBuilder);
  }

  protected Check createCheck( Applicant applicant, Document document, CheckBuilder checkBuilder ) throws IOException, InterruptedException, ApiException {
    return onfido.createCheck(checkBuilder.applicantId(applicant.getId())
                                            .reportNames( Arrays.asList(
                                              ReportName.DOCUMENT,
                                              ReportName.IDENTITY_ENHANCED))
                                            .documentIds( Arrays.asList(
                                              document.getId())));
  }

  private boolean isAValidUuid( UUID uuid )
  {
    return uuid != null && uuid.toString().length() == 36;
  }

  public void cleanUpApplicants() throws IOException, ApiException {
    // Don't perform any clean-up when sample applicant id is not valid
    if ( !isAValidUuid(sampleApplicantId) ) {
      return;
    }

    for (Applicant applicant : onfido.listApplicants(1, 100, false).getApplicants()) {
      if ( ! applicant.getId().equals(sampleApplicantId) ) {
        try {
          onfido.deleteApplicant(applicant.getId());
        } catch (ApiException e)
        {
          // Just ignore any failure during clean up
        }
      }
    }
  }

  public void cleanUpWebhooks() throws IOException, ApiException {
    for (Webhook webhook : onfido.listWebhooks().getWebhooks()) {
      onfido.deleteWebhook(webhook.getId());
    }
  }
}
