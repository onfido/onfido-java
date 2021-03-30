package com.onfido;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

public class OnfidoTest {
  @Test(expectedExceptions = RuntimeException.class)
  public void throwsExceptionForMissingApiToken() {
    Onfido.builder().regionEU().build();
  }

  @Test(expectedExceptions = RuntimeException.class)
  public void throwsExceptionForNullApiToken() {
    Onfido.builder().regionEU().apiToken(null).build();
  }

  @Test(expectedExceptions = RuntimeException.class)
  public void throwsExceptionForMissingRegion() {
    Onfido.builder().apiToken("token").build();
  }

  @Test()
  public void usesEURegionApiUrl() {
    Onfido onfido = Onfido.builder().apiToken("token").regionEU().build();
    assertEquals("https://api.eu.onfido.com/v3.1/", onfido.config.getApiUrl());
  }

  @Test()
  public void usesUSRegionApiUrl() {
    Onfido onfido = Onfido.builder().apiToken("token").regionUS().build();
    assertEquals("https://api.us.onfido.com/v3.1/", onfido.config.getApiUrl());
  }

  @Test()
  public void usesCanadaRegionApiUrl() {
    Onfido onfido = Onfido.builder().apiToken("token").regionCA().build();
    assertEquals("https://api.ca.onfido.com/v3.1/", onfido.config.getApiUrl());
  }
}
