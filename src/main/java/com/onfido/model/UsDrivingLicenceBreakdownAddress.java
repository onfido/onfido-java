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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.onfido.model.UsDrivingLicenceBreakdownAddressBreakdown;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * Asserts whether the address data provided matches a real driving license in the DMV driver&#39;s license database.
 */
@JsonPropertyOrder({
  UsDrivingLicenceBreakdownAddress.JSON_PROPERTY_RESULT,
  UsDrivingLicenceBreakdownAddress.JSON_PROPERTY_BREAKDOWN
})
@JsonTypeName("us_driving_licence_breakdown_address")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsDrivingLicenceBreakdownAddress {
  public static final String JSON_PROPERTY_RESULT = "result";
  private String result;

  public static final String JSON_PROPERTY_BREAKDOWN = "breakdown";
  private UsDrivingLicenceBreakdownAddressBreakdown breakdown;

  public UsDrivingLicenceBreakdownAddress() { 
  }

  public UsDrivingLicenceBreakdownAddress result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(String result) {
    this.result = result;
  }


  public UsDrivingLicenceBreakdownAddress breakdown(UsDrivingLicenceBreakdownAddressBreakdown breakdown) {
    this.breakdown = breakdown;
    return this;
  }

   /**
   * Get breakdown
   * @return breakdown
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsDrivingLicenceBreakdownAddressBreakdown getBreakdown() {
    return breakdown;
  }


  @JsonProperty(JSON_PROPERTY_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreakdown(UsDrivingLicenceBreakdownAddressBreakdown breakdown) {
    this.breakdown = breakdown;
  }


  /**
   * Return true if this us_driving_licence_breakdown_address object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsDrivingLicenceBreakdownAddress usDrivingLicenceBreakdownAddress = (UsDrivingLicenceBreakdownAddress) o;
    return Objects.equals(this.result, usDrivingLicenceBreakdownAddress.result) &&
        Objects.equals(this.breakdown, usDrivingLicenceBreakdownAddress.breakdown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, breakdown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsDrivingLicenceBreakdownAddress {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    breakdown: ").append(toIndentedString(breakdown)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
