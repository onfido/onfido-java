package com.onfido.integration;

import com.onfido.model.Applicant;
import com.onfido.model.BiometricToken;
import com.onfido.model.BiometricTokenData;
import com.onfido.model.BiometricTokenResponse;
import com.onfido.model.BiometricTokenUpdater;
import com.onfido.model.BiometricTokensResponse;
import com.onfido.model.InvalidatedBiometricTokenResponse;
import com.onfido.model.InvalidatedBiometricTokensResponse;
import com.onfido.model.LivePhoto;
import com.onfido.model.UpdatedBiometricTokenResponse;
import com.onfido.model.WorkflowRun;
import com.onfido.model.WorkflowRunBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiometricTokenTest extends TestBase {

  private static final UUID BIOMETRIC_WORKFLOW_ID =
      UUID.fromString("b79dcf69-41a0-412d-b803-d1a618730f72");

  private String biometricCustomerUserId;
  private UUID biometricTokenId;
  private BiometricTokensResponse biometricTokens;

  @BeforeEach
  public void setup() throws Exception {
    Applicant applicant = createApplicant(uniqueFirstName());
    LivePhoto livePhoto = uploadLivePhoto(applicant, "sample_photo.png");

    biometricCustomerUserId = "test-user-id-" + UUID.randomUUID();

    Map<String, Object> mediaId = new HashMap<>();
    mediaId.put("id", livePhoto.getId().toString());

    List<Map<String, Object>> mediaIds = new ArrayList<>();
    mediaIds.add(mediaId);

    Map<String, Object> customData = new HashMap<>();
    customData.put("media_ids", mediaIds);

    WorkflowRun workflowRun =
        onfido
            .createWorkflowRun(
                new WorkflowRunBuilder()
                    .applicantId(applicant.getId())
                    .workflowId(BIOMETRIC_WORKFLOW_ID)
                    .customerUserId(biometricCustomerUserId)
                    .customData(customData))
            .execute();

    Assertions.assertEquals(biometricCustomerUserId, workflowRun.getCustomerUserId());

    biometricTokens = waitForBiometricTokens();
    biometricTokenId = biometricTokens.getBiometricTokens().get(0).getUuid();
  }

  @Test
  public void listBiometricTokensTest() throws Exception {
    Assertions.assertFalse(biometricTokens.getBiometricTokens().isEmpty());
    Assertions.assertNotNull(biometricTokens.getBiometricTokens().get(0).getUuid());
    Assertions.assertNotNull(biometricTokens.getBiometricTokens().get(0).getData().getStatus());
    Assertions.assertNotNull(biometricTokens.toJson());
  }

  @Test
  public void findBiometricTokenTest() throws Exception {
    BiometricTokenResponse biometricTokenResponse =
        onfido.findBiometricToken(biometricCustomerUserId, biometricTokenId).execute();

    BiometricToken biometricToken = biometricTokenResponse.getBiometricToken();

    Assertions.assertEquals(biometricTokenId, biometricToken.getUuid());
    Assertions.assertNotNull(biometricToken.getData().getStatus());
    Assertions.assertNotNull(biometricTokenResponse.toJson());
  }

  @Test
  public void updateBiometricTokenStatusTest() throws Exception {
    UpdatedBiometricTokenResponse response =
        onfido
            .updateBiometricToken(
                biometricCustomerUserId,
                biometricTokenId,
                new BiometricTokenUpdater().status(BiometricTokenUpdater.StatusEnum.APPROVED))
            .execute();

    Assertions.assertEquals(biometricTokenId, response.getBiometricToken().getUuid());
    Assertions.assertEquals(
        BiometricTokenData.StatusEnum.APPROVED, response.getBiometricToken().getData().getStatus());
    Assertions.assertNotNull(response.toJson());
  }

  @Test
  public void invalidateBiometricTokenTest() throws Exception {
    InvalidatedBiometricTokenResponse response =
        onfido.invalidateBiometricToken(biometricCustomerUserId, biometricTokenId).execute();

    Assertions.assertNotNull(response.toJson());
  }

  @Test
  public void invalidateBiometricTokensTest() throws Exception {
    InvalidatedBiometricTokensResponse response =
        onfido.invalidateBiometricTokens(biometricCustomerUserId).execute();

    Assertions.assertNotNull(response.toJson());
  }

  private String uniqueFirstName() {
    return "First" + UUID.randomUUID().toString().replace("-", "").substring(0, 8);
  }

  private BiometricTokensResponse waitForBiometricTokens() throws Exception {
    for (int attempt = 0; attempt < 10; attempt++) {
      BiometricTokensResponse response = onfido.listBiometricTokens(biometricCustomerUserId).execute();
      if (!response.getBiometricTokens().isEmpty()) {
        return response;
      }

      Thread.sleep(3000);
    }

    throw new RuntimeException("Biometric tokens were not created in time");
  }
}
