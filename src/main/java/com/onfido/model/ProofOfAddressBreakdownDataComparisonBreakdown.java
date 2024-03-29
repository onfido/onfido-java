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
 * ProofOfAddressBreakdownDataComparisonBreakdown
 */
@JsonPropertyOrder({
  ProofOfAddressBreakdownDataComparisonBreakdown.JSON_PROPERTY_ADDRESS,
  ProofOfAddressBreakdownDataComparisonBreakdown.JSON_PROPERTY_FIRST_NAME,
  ProofOfAddressBreakdownDataComparisonBreakdown.JSON_PROPERTY_LAST_NAME
})
@JsonTypeName("proof_of_address_breakdown_data_comparison_breakdown")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProofOfAddressBreakdownDataComparisonBreakdown {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry address;

  public static final String JSON_PROPERTY_FIRST_NAME = "first_name";
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "last_name";
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry lastName;

  public ProofOfAddressBreakdownDataComparisonBreakdown() { 
  }

  public ProofOfAddressBreakdownDataComparisonBreakdown address(DocumentBreakdownDataComparisonBreakdownIssuingCountry address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(DocumentBreakdownDataComparisonBreakdownIssuingCountry address) {
    this.address = address;
  }


  public ProofOfAddressBreakdownDataComparisonBreakdown firstName(DocumentBreakdownDataComparisonBreakdownIssuingCountry firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(DocumentBreakdownDataComparisonBreakdownIssuingCountry firstName) {
    this.firstName = firstName;
  }


  public ProofOfAddressBreakdownDataComparisonBreakdown lastName(DocumentBreakdownDataComparisonBreakdownIssuingCountry lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(DocumentBreakdownDataComparisonBreakdownIssuingCountry lastName) {
    this.lastName = lastName;
  }


  /**
   * Return true if this proof_of_address_breakdown_data_comparison_breakdown object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProofOfAddressBreakdownDataComparisonBreakdown proofOfAddressBreakdownDataComparisonBreakdown = (ProofOfAddressBreakdownDataComparisonBreakdown) o;
    return Objects.equals(this.address, proofOfAddressBreakdownDataComparisonBreakdown.address) &&
        Objects.equals(this.firstName, proofOfAddressBreakdownDataComparisonBreakdown.firstName) &&
        Objects.equals(this.lastName, proofOfAddressBreakdownDataComparisonBreakdown.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProofOfAddressBreakdownDataComparisonBreakdown {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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
