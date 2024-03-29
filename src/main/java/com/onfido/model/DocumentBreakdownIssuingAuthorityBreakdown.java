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
import com.onfido.model.DocumentBreakdownIssuingAuthorityBreakdownNfcActiveAuthentication;
import com.onfido.model.DocumentBreakdownIssuingAuthorityBreakdownNfcPassiveAuthentication;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * DocumentBreakdownIssuingAuthorityBreakdown
 */
@JsonPropertyOrder({
  DocumentBreakdownIssuingAuthorityBreakdown.JSON_PROPERTY_NFC_ACTIVE_AUTHENTICATION,
  DocumentBreakdownIssuingAuthorityBreakdown.JSON_PROPERTY_NFC_PASSIVE_AUTHENTICATION
})
@JsonTypeName("document_breakdown_issuing_authority_breakdown")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocumentBreakdownIssuingAuthorityBreakdown {
  public static final String JSON_PROPERTY_NFC_ACTIVE_AUTHENTICATION = "nfc_active_authentication";
  private DocumentBreakdownIssuingAuthorityBreakdownNfcActiveAuthentication nfcActiveAuthentication;

  public static final String JSON_PROPERTY_NFC_PASSIVE_AUTHENTICATION = "nfc_passive_authentication";
  private DocumentBreakdownIssuingAuthorityBreakdownNfcPassiveAuthentication nfcPassiveAuthentication;

  public DocumentBreakdownIssuingAuthorityBreakdown() { 
  }

  public DocumentBreakdownIssuingAuthorityBreakdown nfcActiveAuthentication(DocumentBreakdownIssuingAuthorityBreakdownNfcActiveAuthentication nfcActiveAuthentication) {
    this.nfcActiveAuthentication = nfcActiveAuthentication;
    return this;
  }

   /**
   * Get nfcActiveAuthentication
   * @return nfcActiveAuthentication
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NFC_ACTIVE_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownIssuingAuthorityBreakdownNfcActiveAuthentication getNfcActiveAuthentication() {
    return nfcActiveAuthentication;
  }


  @JsonProperty(JSON_PROPERTY_NFC_ACTIVE_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNfcActiveAuthentication(DocumentBreakdownIssuingAuthorityBreakdownNfcActiveAuthentication nfcActiveAuthentication) {
    this.nfcActiveAuthentication = nfcActiveAuthentication;
  }


  public DocumentBreakdownIssuingAuthorityBreakdown nfcPassiveAuthentication(DocumentBreakdownIssuingAuthorityBreakdownNfcPassiveAuthentication nfcPassiveAuthentication) {
    this.nfcPassiveAuthentication = nfcPassiveAuthentication;
    return this;
  }

   /**
   * Get nfcPassiveAuthentication
   * @return nfcPassiveAuthentication
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NFC_PASSIVE_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownIssuingAuthorityBreakdownNfcPassiveAuthentication getNfcPassiveAuthentication() {
    return nfcPassiveAuthentication;
  }


  @JsonProperty(JSON_PROPERTY_NFC_PASSIVE_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNfcPassiveAuthentication(DocumentBreakdownIssuingAuthorityBreakdownNfcPassiveAuthentication nfcPassiveAuthentication) {
    this.nfcPassiveAuthentication = nfcPassiveAuthentication;
  }


  /**
   * Return true if this document_breakdown_issuing_authority_breakdown object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBreakdownIssuingAuthorityBreakdown documentBreakdownIssuingAuthorityBreakdown = (DocumentBreakdownIssuingAuthorityBreakdown) o;
    return Objects.equals(this.nfcActiveAuthentication, documentBreakdownIssuingAuthorityBreakdown.nfcActiveAuthentication) &&
        Objects.equals(this.nfcPassiveAuthentication, documentBreakdownIssuingAuthorityBreakdown.nfcPassiveAuthentication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nfcActiveAuthentication, nfcPassiveAuthentication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBreakdownIssuingAuthorityBreakdown {\n");
    sb.append("    nfcActiveAuthentication: ").append(toIndentedString(nfcActiveAuthentication)).append("\n");
    sb.append("    nfcPassiveAuthentication: ").append(toIndentedString(nfcPassiveAuthentication)).append("\n");
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
