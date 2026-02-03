package com.onfido.integration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PingTest extends TestBase {

  @Test
  public void pingTest() throws Exception {
    String response = onfido.ping().execute();

    Assertions.assertEquals("OK", response);
  }
}
