package com.onfido.integration;

import com.onfido.ApiException;
import com.onfido.Configuration;
import com.onfido.FileTransfer;
import com.onfido.api.DefaultApi;
import com.onfido.model.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.UUID;
import java.util.stream.Collectors;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestBase {

  private static final String apiToken = System.getenv("ONFIDO_API_TOKEN");

  protected static final UUID sampleApplicantId =
      UUID.fromString(System.getenv("ONFIDO_SAMPLE_APPLICANT_ID"));
  protected static final UUID nonExistingId =
      UUID.fromString("00000000-0000-0000-0000-000000000000");

  protected final int MAX_RETRIES = 15;
  protected final int SLEEP_TIME = 1000;

  protected DefaultApi onfido;

  public TestBase() {
    onfido =
        new DefaultApi(
            Configuration.getDefaultApiClient()
                .setApiToken(apiToken)
                .setConnectTimeout(60_000)
                .setReadTimeout(60_000)
                .setWriteTimeout(60_000));
  }

  @AfterAll
  public void tearDownAndCleanUp() throws IOException, ApiException {
    cleanUpApplicants();
    cleanUpWebhooks();
  }

  public Applicant createApplicant(String first_name)
      throws IOException, InterruptedException, ApiException {
    Applicant applicant =
        onfido
            .createApplicant(
                new ApplicantBuilder()
                    .firstName(first_name)
                    .lastName("Last")
                    .email("first.last@gmail.com")
                    .phoneNumber("351911111111")
                    .location(
                        new LocationBuilder()
                            .ipAddress("127.0.0.1")
                            .countryOfResidence(CountryCodes.GBR))
                    .consents(
                        Arrays.asList(
                            new ApplicantConsentBuilder()
                                .name(ApplicantConsentName.PRIVACY_NOTICES_READ)
                                .granted(true))))
            .execute();

    return applicant;
  }

  public Applicant createApplicant() throws IOException, InterruptedException, ApiException {
    return createApplicant("First");
  }

  protected Document uploadDocument(
      Applicant applicant, String filename, DocumentTypes document_type)
      throws IOException, InterruptedException, ApiException {
    File file = new File("media/" + filename);
    byte[] byteArray = Files.readAllBytes(file.toPath());

    LocationBuilder locationBuilder =
        new LocationBuilder().ipAddress("127.0.0.1").countryOfResidence(CountryCodes.GBR);

    return onfido
        .uploadDocument(document_type, applicant.getId(), new FileTransfer(byteArray, filename))
        .side("front")
        .issuingCountry(CountryCodes.USA)
        .location(locationBuilder)
        .execute();
  }

  protected SigningDocument uploadSigningDocument(Applicant applicant, String filename)
      throws ApiException {
    return onfido
        .uploadSigningDocument(applicant.getId(), new FileTransfer(new File("media/" + filename)))
        .execute();
  }

  protected LivePhoto uploadLivePhoto(Applicant applicant, String filename) throws Exception {
    return onfido
        .uploadLivePhoto()
        .applicantId(applicant.getId())
        ._file(new FileTransfer(new File("media/" + filename)))
        .advancedValidation(true)
        .execute();
  }

  protected IdPhoto uploadIdPhoto(Applicant applicant, String filename) throws Exception {
    return onfido
        .uploadIdPhoto()
        .applicantId(applicant.getId())
        ._file(new FileTransfer(new File("media/" + filename)))
        .execute();
  }

  protected Check createCheck(Applicant applicant, Document document, CheckBuilder checkBuilder)
      throws IOException, InterruptedException, ApiException {
    return onfido
        .createCheck(
            checkBuilder
                .applicantId(applicant.getId())
                .documentIds(Arrays.asList(document.getId())))
        .execute();
  }

  protected WorkflowRun createWorkflowRun(UUID workflowId, UUID applicantId) throws Exception {
    return onfido
        .createWorkflowRun(new WorkflowRunBuilder().workflowId(workflowId).applicantId(applicantId))
        .execute();
  }

  private boolean isAValidUuid(UUID uuid) {
    return uuid != null && uuid.toString().length() == 36;
  }

  public void cleanUpApplicants() throws IOException, ApiException {
    // Don't perform any clean-up when sample applicant id is not valid
    if (!isAValidUuid(sampleApplicantId)) {
      return;
    }

    for (Applicant applicant :
        onfido
            .listApplicants()
            .page(1)
            .perPage(100)
            .includeDeleted(false)
            .execute()
            .getApplicants()) {
      if (!applicant.getId().equals(sampleApplicantId)) {
        try {
          onfido.deleteApplicant(applicant.getId()).execute();
        } catch (ApiException e) {
          // Just ignore any failure during clean up
        }
      }
    }
  }

  public void cleanUpWebhooks() throws IOException, ApiException {
    for (Webhook webhook : onfido.listWebhooks().execute().getWebhooks()) {
      onfido.deleteWebhook(webhook.getId()).execute();
    }
  }

  public String getTaskIdByPartialId(UUID workflowRunId, String partialId) throws ApiException {
    return onfido.listTasks(workflowRunId).execute().stream()
        .filter((task) -> task.getTaskDefId().contains(partialId))
        .collect(Collectors.toList())
        .get(0)
        .getId();
  }

  public WatchlistMonitor createWatchlistMonitor(
      UUID applicantId, WatchlistMonitorBuilder.ReportNameEnum reportName) throws ApiException {
    return onfido
        .createWatchlistMonitor(
            new WatchlistMonitorBuilder().applicantId(applicantId).reportName(reportName))
        .execute();
  }

  private Method getMethod(String methodName, Object[] params) throws NoSuchMethodException {
    Class<?>[] paramTypes = new Class<?>[params.length];
    for (int i = 0; i < params.length; i++) {
      paramTypes[i] = params[i].getClass();
    }

    return onfido.getClass().getMethod(methodName, paramTypes);
  }

  public Object repeatRequestUntilStatusChanges(
      String methodName, Object[] params, Object status, int maxRetries, int sleepTime)
      throws NoSuchMethodException,
          IllegalAccessException,
          InterruptedException,
          InvocationTargetException {
    Method method = getMethod(methodName, params);
    Object request = method.invoke(onfido, params);
    Method executeMethod = request.getClass().getMethod("execute");
    Object instance = executeMethod.invoke(request);

    int iteration = 0;
    Method getStatusMethod = instance.getClass().getMethod("getStatus");

    while (!getStatusMethod.invoke(instance).equals(status)) {
      if (iteration > maxRetries) {
        throw new RuntimeException("Status did not change in time");
      }

      iteration += 1;
      Thread.sleep(sleepTime);
      request = method.invoke(onfido, params);
      instance = executeMethod.invoke(request);
    }
    return instance;
  }

  public Task repeatRequestUntilTaskOutputChanges(
      String methodName, Object[] params, int maxRetries, int sleepTime)
      throws NoSuchMethodException,
          IllegalAccessException,
          InterruptedException,
          InvocationTargetException {
    Method method = getMethod(methodName, params);
    Object request = method.invoke(onfido, params);
    Method executeMethod = request.getClass().getMethod("execute");
    Task instance = (Task) executeMethod.invoke(request);

    int iteration = 0;

    while (instance.getOutput() == null) {
      if (iteration > maxRetries) {
        throw new RuntimeException("Task output did not change in time");
      }

      iteration += 1;
      Thread.sleep(sleepTime);
      request = method.invoke(onfido, params);
      instance = (Task) executeMethod.invoke(request);
    }
    return instance;
  }

  public Object repeatRequestUntilHttpCodeChanges(
      String methodName, Object[] params, int maxRetries, int sleepTime)
      throws NoSuchMethodException, IllegalAccessException, InterruptedException {
    Method method = getMethod(methodName, params);
    Object instance = null;
    int iteration = 0;

    while (iteration <= maxRetries) {
      try {
        Object request = method.invoke(onfido, params);
        Method executeMethod = request.getClass().getMethod("execute");
        instance = executeMethod.invoke(request);
        break;
      } catch (InvocationTargetException e) {
        Thread.sleep(sleepTime);
        iteration += 1;
      }
    }

    if (instance == null) {
      throw new RuntimeException("Method did not execute successfully within the retry limit.");
    }
    return instance;
  }
}
