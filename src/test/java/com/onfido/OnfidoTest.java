package com.onfido;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.onfido.ApiClient.Region;
import com.onfido.api.DefaultApi;

public class OnfidoTest {

  @Test
  public void throwsExceptionForMissingApiToken() {
    ApiException thrown = assertThrows(
        ApiException.class,
           () -> new DefaultApi(Configuration.getDefaultApiClient()).findApplicant(UUID.fromString("839d4812-7c49-4008-8d83-bbd7610f0fec")),
           "Expected to throw, but it didn't"
    );

    assertTrue(thrown.getMessage().contains("authorization_error"));
  }

  @Test
  public void throwsExceptionForNullApiToken() {
    ApiException thrown = assertThrows(
      ApiException.class,
      () -> new DefaultApi(Configuration.getDefaultApiClient().setApiToken(null)).findApplicant(UUID.fromString("839d4812-7c49-4008-8d83-bbd7610f0fec")),
      "Expected to throw, but it didn't"
    );

    assertTrue(thrown.getMessage().contains("authorization_error"));
  }

  @Test
  public void usesDefaultRegionApiUrl() {
    DefaultApi onfido = new DefaultApi(Configuration.getDefaultApiClient().setApiToken("token"));
    Assertions.assertEquals("https://api.eu.onfido.com/v3.6", onfido.getApiClient().getBasePath());
  }

  @Test
  public void usesEURegionApiUrl() {
    DefaultApi onfido = new DefaultApi(Configuration.getDefaultApiClient().setRegion(Region.EU).setApiToken("token"));
    Assertions.assertEquals("https://api.eu.onfido.com/v3.6", onfido.getApiClient().getBasePath());
  }

  @Test()
  public void usesUSRegionApiUrl() {
    DefaultApi onfido = new DefaultApi(Configuration.getDefaultApiClient().setRegion(Region.US).setApiToken("token"));
    Assertions.assertEquals("https://api.us.onfido.com/v3.6", onfido.getApiClient().getBasePath());
  }

  @Test()
  public void usesCARegionApiUrl() {
    DefaultApi onfido = new DefaultApi(Configuration.getDefaultApiClient().setRegion(Region.CA).setApiToken("token"));
    Assertions.assertEquals("https://api.ca.onfido.com/v3.6", onfido.getApiClient().getBasePath());
  }
}
