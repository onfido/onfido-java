package com.onfido.exceptions;

import java.util.Collections;
import java.util.Map;

import com.onfido.api.ApiJson;

/**
 * The type Error json.
 */
final class ErrorJson {
  private static final ApiJson<ErrorJson> JSON = new ApiJson<ErrorJson>(ErrorJson.class);

  private static final class InnerErrorJson {
      /**
       * The Type.
       */
      final String type;
      /**
       * The Message.
       */
      final String message;
      /**
       * The Fields.
       */
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

    /**
     * From json error json.
     *
     * @param json the json
     * @return the error json
     */
    protected static ErrorJson fromJson(String json) {
    try {
      return JSON.parse(json);
    } catch (OnfidoException e) {
      return new ErrorJson();
    }
  }

    /**
     * Gets type.
     *
     * @return the type
     */
    protected String getType() {
    return error.type;
  }

    /**
     * Gets message.
     *
     * @return the message
     */
    protected String getMessage() {
    return error.message;
  }

    /**
     * Gets fields.
     *
     * @return the fields
     */
    protected Map<String, Object> getFields() {
    return error.fields;
  }
}
