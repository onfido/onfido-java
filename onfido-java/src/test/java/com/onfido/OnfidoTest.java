package com.onfido;

import org.testng.annotations.Test;

public class OnfidoTest {
  @Test(expectedExceptions = RuntimeException.class)
  public void throwsExceptionForMissingApiToken() {
    Onfido.builder().build();
  }
}
