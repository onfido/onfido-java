package com.onfido.exceptions;

import java.util.Map;

public final class ApiException extends OnfidoException {
  private static final long serialVersionUID = 1;

  private int statusCode;
  private final String type;
  private final Map<String, Object> fields;

  private ApiException(String message, int statusCode, String type, Map<String, Object> fields) {
    super(message, null);
    this.statusCode = statusCode;
    this.type = type;
    this.fields = fields;
  }

  public static ApiException fromResponseBody(String body, int statusCode) {
    ErrorJson error = ErrorJson.fromJson(body);
    return new ApiException(error.getMessage(), statusCode, error.getType(), error.getFields());
  }

  @Override
  public String getMessage() {
    String message = String.format("%s (status code %d)", super.getMessage(), statusCode);

    if (fields.size() == 0) {
      return message;
    }

    return String.format("%s | Field errors: %s", message, fields);
  }

  public int getStatusCode() {
    return statusCode;
  }

  public boolean isClientError() {
    return statusCode < 500;
  }

  public String getType() {
    return type;
  }

  public Map<String, Object> getFields() {
    return fields;
  }
}
