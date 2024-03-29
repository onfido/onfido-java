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
import com.onfido.model.IndiaPanReportAllOfBreakdownDeviceBreakdownPanValid;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * IndiaPanReportAllOfBreakdownDeviceBreakdown
 */
@JsonPropertyOrder({
  IndiaPanReportAllOfBreakdownDeviceBreakdown.JSON_PROPERTY_PAN_VALID,
  IndiaPanReportAllOfBreakdownDeviceBreakdown.JSON_PROPERTY_NAME_MATCH
})
@JsonTypeName("india_pan_report_allOf_breakdown_device_breakdown")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IndiaPanReportAllOfBreakdownDeviceBreakdown {
  public static final String JSON_PROPERTY_PAN_VALID = "pan_valid";
  private IndiaPanReportAllOfBreakdownDeviceBreakdownPanValid panValid;

  public static final String JSON_PROPERTY_NAME_MATCH = "name_match";
  private IndiaPanReportAllOfBreakdownDeviceBreakdownPanValid nameMatch;

  public IndiaPanReportAllOfBreakdownDeviceBreakdown() { 
  }

  public IndiaPanReportAllOfBreakdownDeviceBreakdown panValid(IndiaPanReportAllOfBreakdownDeviceBreakdownPanValid panValid) {
    this.panValid = panValid;
    return this;
  }

   /**
   * Get panValid
   * @return panValid
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAN_VALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IndiaPanReportAllOfBreakdownDeviceBreakdownPanValid getPanValid() {
    return panValid;
  }


  @JsonProperty(JSON_PROPERTY_PAN_VALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPanValid(IndiaPanReportAllOfBreakdownDeviceBreakdownPanValid panValid) {
    this.panValid = panValid;
  }


  public IndiaPanReportAllOfBreakdownDeviceBreakdown nameMatch(IndiaPanReportAllOfBreakdownDeviceBreakdownPanValid nameMatch) {
    this.nameMatch = nameMatch;
    return this;
  }

   /**
   * Get nameMatch
   * @return nameMatch
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IndiaPanReportAllOfBreakdownDeviceBreakdownPanValid getNameMatch() {
    return nameMatch;
  }


  @JsonProperty(JSON_PROPERTY_NAME_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNameMatch(IndiaPanReportAllOfBreakdownDeviceBreakdownPanValid nameMatch) {
    this.nameMatch = nameMatch;
  }


  /**
   * Return true if this india_pan_report_allOf_breakdown_device_breakdown object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndiaPanReportAllOfBreakdownDeviceBreakdown indiaPanReportAllOfBreakdownDeviceBreakdown = (IndiaPanReportAllOfBreakdownDeviceBreakdown) o;
    return Objects.equals(this.panValid, indiaPanReportAllOfBreakdownDeviceBreakdown.panValid) &&
        Objects.equals(this.nameMatch, indiaPanReportAllOfBreakdownDeviceBreakdown.nameMatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(panValid, nameMatch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndiaPanReportAllOfBreakdownDeviceBreakdown {\n");
    sb.append("    panValid: ").append(toIndentedString(panValid)).append("\n");
    sb.append("    nameMatch: ").append(toIndentedString(nameMatch)).append("\n");
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
