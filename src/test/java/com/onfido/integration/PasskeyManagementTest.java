package com.onfido.integration;

import com.onfido.ApiResponse;
import com.onfido.model.Passkey;
import com.onfido.model.PasskeyUpdater;
import com.onfido.model.PasskeysList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasskeyManagementTest extends TestBase {

  private static final String SAMPLE_USERNAME = "sample-username";
  private static final String SAMPLE_PASSKEY_ID = "00000000-0000-0000-0000-000000000000";

  @Test
  public void listPasskeysTest() throws Exception {
    PasskeysList passkeys = onfido.listPasskeys(SAMPLE_USERNAME);

    Assertions.assertFalse(passkeys.getPasskeys().isEmpty());

    Passkey samplePasskey =
        passkeys.getPasskeys().stream()
            .filter(passkey -> SAMPLE_PASSKEY_ID.equals(passkey.getId()))
            .findFirst()
            .orElse(passkeys.getPasskeys().get(0));

    Assertions.assertNotNull(samplePasskey.getApplicationDomain());
    Assertions.assertNotNull(samplePasskey.getState());
    Assertions.assertNotNull(samplePasskey.getCreatedAt());

    Assertions.assertNotNull(samplePasskey.toJson());
  }

  @Test
  public void findPasskeyTest() throws Exception {
    Passkey passkey = onfido.findPasskey(SAMPLE_USERNAME, SAMPLE_PASSKEY_ID);

    Assertions.assertNotNull(passkey.getId());
    Assertions.assertNotNull(passkey.getApplicationDomain());
    Assertions.assertNotNull(passkey.getState());
    Assertions.assertNotNull(passkey.getCreatedAt());

    Assertions.assertNotNull(passkey.toJson());
  }

  @Test
  public void updatePasskeyStateTest() throws Exception {
    Passkey updated =
        onfido.updatePasskey(
            SAMPLE_USERNAME,
            SAMPLE_PASSKEY_ID,
            new PasskeyUpdater().state(PasskeyUpdater.StateEnum.INACTIVE));

    // Sandbox returns canned responses; expect a stable INACTIVE state
    Assertions.assertEquals(Passkey.StateEnum.INACTIVE, updated.getState());
  }

  @Test
  public void deletePasskeySuccessTest() {
    ApiResponse<Void> response =
        Assertions.assertDoesNotThrow(
            () -> onfido.deletePasskeyWithHttpInfo(SAMPLE_USERNAME, SAMPLE_PASSKEY_ID));

    Assertions.assertEquals(204, response.getStatusCode());
  }

  @Test
  public void deletePasskeysSuccessTest() {
    ApiResponse<Void> response =
        Assertions.assertDoesNotThrow(() -> onfido.deletePasskeysWithHttpInfo(SAMPLE_USERNAME));

    Assertions.assertEquals(204, response.getStatusCode());
  }
}
