package com.onfido.exceptions;

import java.util.Collections;
import java.util.Map;

import com.onfido.api.ApiJson;

final class ErrorJson {
  private static final ApiJson<ErrorJson> JSON = new ApiJson<ErrorJson>(ErrorJson.class);

  private static final class InnerErrorJson {
    final String type;
    final String message;
    final Map<String, Object> fields;

    private InnerErrorJson() {
      this.type = "unknown";
      this.message = "Unknown error";
      this.fields = Collections.emptyMap();
    }
  }

  private final InnerErrorJson error;

  private ErrorJson() {
    this.error = new InnerErrorJson();
  }

  protected static ErrorJson fromJson(String json) {
    try {
      return JSON.parse(json);
    } catch (OnfidoException e) {
      return new ErrorJson();
    }
  }

  protected String getType() {
    return error.type;
  }

  protected String getMessage() {
    return error.message;
  }

  protected Map<String, Object> getFields() {
    return error.fields;
  }
}
