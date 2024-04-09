/*
 * Onfido API v3.6
 * The Onfido API
 *
 * The version of the OpenAPI document: 3.6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.onfido.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The sub_result of the report. It gives a more detailed result for document reports only, and will be null otherwise. Read-only.
 */
@JsonAdapter(ReportSubResult.Adapter.class)
public enum ReportSubResult {
  
  CLEAR("clear"),
  
  REJECTED("rejected"),
  
  SUSPECTED("suspected"),
  
  CAUTION("caution"),
  
  UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

  private String value;

  ReportSubResult(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportSubResult fromValue(String value) {
    for (ReportSubResult b : ReportSubResult.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN_DEFAULT_OPEN_API;
  }

  public static class Adapter extends TypeAdapter<ReportSubResult> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportSubResult enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportSubResult read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportSubResult.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ReportSubResult.fromValue(value);
  }
}

