package com.onfido.models;

import com.onfido.JsonObject;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class ApplicantTest {
  @Test
  public void convertsToJson() {
    String json = Applicant.request().firstName("First").lastName("Last").toJson();

    JsonObject jsonObject = JsonObject.parse(json);
    assertEquals("First", jsonObject.get("first_name"));
    assertEquals("Last", jsonObject.get("last_name"));
  }
}
