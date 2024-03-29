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
import com.onfido.model.IdentityEnhancedBreakdownAddressBreakdownCreditAgenciesProperties;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * The number of address matches against credit agencies.
 */
@JsonPropertyOrder({
  IdentityEnhancedBreakdownAddressBreakdownCreditAgencies.JSON_PROPERTY_RESULT,
  IdentityEnhancedBreakdownAddressBreakdownCreditAgencies.JSON_PROPERTY_PROPERTIES
})
@JsonTypeName("identity_enhanced_breakdown_address_breakdown_credit_agencies")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IdentityEnhancedBreakdownAddressBreakdownCreditAgencies {
  public static final String JSON_PROPERTY_RESULT = "result";
  private String result;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private IdentityEnhancedBreakdownAddressBreakdownCreditAgenciesProperties properties;

  public IdentityEnhancedBreakdownAddressBreakdownCreditAgencies() { 
  }

  public IdentityEnhancedBreakdownAddressBreakdownCreditAgencies result(String result) {
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


  public IdentityEnhancedBreakdownAddressBreakdownCreditAgencies properties(IdentityEnhancedBreakdownAddressBreakdownCreditAgenciesProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IdentityEnhancedBreakdownAddressBreakdownCreditAgenciesProperties getProperties() {
    return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(IdentityEnhancedBreakdownAddressBreakdownCreditAgenciesProperties properties) {
    this.properties = properties;
  }


  /**
   * Return true if this identity_enhanced_breakdown_address_breakdown_credit_agencies object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityEnhancedBreakdownAddressBreakdownCreditAgencies identityEnhancedBreakdownAddressBreakdownCreditAgencies = (IdentityEnhancedBreakdownAddressBreakdownCreditAgencies) o;
    return Objects.equals(this.result, identityEnhancedBreakdownAddressBreakdownCreditAgencies.result) &&
        Objects.equals(this.properties, identityEnhancedBreakdownAddressBreakdownCreditAgencies.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityEnhancedBreakdownAddressBreakdownCreditAgencies {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
