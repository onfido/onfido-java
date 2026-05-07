package com.onfido;

import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JSONTest {

  @Test
  public void parsesEmptyDateStringAsNull() {
    com.onfido.model.Applicant applicant =
        JSON.getGson().fromJson("{\"dob\": \"\"}", com.onfido.model.Applicant.class);

    Assertions.assertNull(applicant.getDob());
  }
}
