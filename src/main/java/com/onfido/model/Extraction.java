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
import com.onfido.model.ExtractionDocumentClassification;
import com.onfido.model.ExtractionExtractedData;
import java.util.Arrays;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * Extraction
 */
@JsonPropertyOrder({
  Extraction.JSON_PROPERTY_DOCUMENT_ID,
  Extraction.JSON_PROPERTY_DOCUMENT_CLASSIFICATION,
  Extraction.JSON_PROPERTY_EXTRACTED_DATA
})
@JsonTypeName("extraction")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Extraction {
  public static final String JSON_PROPERTY_DOCUMENT_ID = "document_id";
  private UUID documentId;

  public static final String JSON_PROPERTY_DOCUMENT_CLASSIFICATION = "document_classification";
  private ExtractionDocumentClassification documentClassification;

  public static final String JSON_PROPERTY_EXTRACTED_DATA = "extracted_data";
  private ExtractionExtractedData extractedData;

  public Extraction() { 
  }

  public Extraction documentId(UUID documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * The unique identifier of the uploaded document.
   * @return documentId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getDocumentId() {
    return documentId;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentId(UUID documentId) {
    this.documentId = documentId;
  }


  public Extraction documentClassification(ExtractionDocumentClassification documentClassification) {
    this.documentClassification = documentClassification;
    return this;
  }

   /**
   * Get documentClassification
   * @return documentClassification
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_CLASSIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExtractionDocumentClassification getDocumentClassification() {
    return documentClassification;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_CLASSIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentClassification(ExtractionDocumentClassification documentClassification) {
    this.documentClassification = documentClassification;
  }


  public Extraction extractedData(ExtractionExtractedData extractedData) {
    this.extractedData = extractedData;
    return this;
  }

   /**
   * Get extractedData
   * @return extractedData
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTRACTED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExtractionExtractedData getExtractedData() {
    return extractedData;
  }


  @JsonProperty(JSON_PROPERTY_EXTRACTED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtractedData(ExtractionExtractedData extractedData) {
    this.extractedData = extractedData;
  }


  /**
   * Return true if this extraction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Extraction extraction = (Extraction) o;
    return Objects.equals(this.documentId, extraction.documentId) &&
        Objects.equals(this.documentClassification, extraction.documentClassification) &&
        Objects.equals(this.extractedData, extraction.extractedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, documentClassification, extractedData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Extraction {\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentClassification: ").append(toIndentedString(documentClassification)).append("\n");
    sb.append("    extractedData: ").append(toIndentedString(extractedData)).append("\n");
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
