package com.onfido;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

public class OnfidoTest {
  @Test(expectedExceptions = RuntimeException.class)
  public void throwsExceptionForMissingApiToken() {
    Onfido.builder().build();
  }

  @Test(expectedExceptions = RuntimeException.class)
  public void throwsExceptionForNullApiToken() {
    Onfido.builder().apiToken(null).build();
  }

  @Test()
  public void usesUSRegionApiUrl() {
    Onfido onfido = Onfido.builder().apiToken("token").regionUS().build();
    assertEquals("https://api.us.onfido.com/v3/", onfido.config.getApiUrl());
  }

  @Test()
  public void usesCanadaRegionApiUrl() {
    Onfido onfido = Onfido.builder().apiToken("token").regionCA().build();
    assertEquals("https://api.ca.onfido.com/v3/", onfido.config.getApiUrl());
  }
}
