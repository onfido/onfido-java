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
import com.onfido.model.DocumentBreakdownDataComparisonBreakdownIssuingCountry;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * DocumentBreakdownAgeValidationBreakdown
 */
@JsonPropertyOrder({
  DocumentBreakdownAgeValidationBreakdown.JSON_PROPERTY_MINIMUM_ACCEPTED_AGE
})
@JsonTypeName("document_breakdown_age_validation_breakdown")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocumentBreakdownAgeValidationBreakdown {
  public static final String JSON_PROPERTY_MINIMUM_ACCEPTED_AGE = "minimum_accepted_age";
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry minimumAcceptedAge;

  public DocumentBreakdownAgeValidationBreakdown() { 
  }

  public DocumentBreakdownAgeValidationBreakdown minimumAcceptedAge(DocumentBreakdownDataComparisonBreakdownIssuingCountry minimumAcceptedAge) {
    this.minimumAcceptedAge = minimumAcceptedAge;
    return this;
  }

   /**
   * Get minimumAcceptedAge
   * @return minimumAcceptedAge
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMUM_ACCEPTED_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getMinimumAcceptedAge() {
    return minimumAcceptedAge;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM_ACCEPTED_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimumAcceptedAge(DocumentBreakdownDataComparisonBreakdownIssuingCountry minimumAcceptedAge) {
    this.minimumAcceptedAge = minimumAcceptedAge;
  }


  /**
   * Return true if this document_breakdown_age_validation_breakdown object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBreakdownAgeValidationBreakdown documentBreakdownAgeValidationBreakdown = (DocumentBreakdownAgeValidationBreakdown) o;
    return Objects.equals(this.minimumAcceptedAge, documentBreakdownAgeValidationBreakdown.minimumAcceptedAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumAcceptedAge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBreakdownAgeValidationBreakdown {\n");
    sb.append("    minimumAcceptedAge: ").append(toIndentedString(minimumAcceptedAge)).append("\n");
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
