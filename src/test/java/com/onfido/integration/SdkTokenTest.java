package com.onfido.integration;



import com.onfido.model.Applicant;
import com.onfido.model.SdkToken;
import com.onfido.model.SdkTokenBuilder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SdkTokenTest extends TestBase {

  @Test
  public void generateTokenTest() throws Exception {
    Applicant applicant = createApplicant();

    SdkToken token = onfido.generateSdkToken(
      new SdkTokenBuilder().applicantId(applicant.getId())
                            .referrer("https://*.example.com/example_page/*"));

    Assertions.assertTrue(token.getToken().length() > 0);
  }
}
