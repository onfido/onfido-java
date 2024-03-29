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
import com.onfido.model.FacialSimilarityPhotoBreakdownImageIntegrityBreakdownFaceDetected;
import com.onfido.model.FacialSimilarityPhotoFullyAutoBreakdownImageIntegrityBreakdownSourceIntegrity;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * FacialSimilarityPhotoFullyAutoBreakdownImageIntegrityBreakdown
 */
@JsonPropertyOrder({
  FacialSimilarityPhotoFullyAutoBreakdownImageIntegrityBreakdown.JSON_PROPERTY_FACE_DETECTED,
  FacialSimilarityPhotoFullyAutoBreakdownImageIntegrityBreakdown.JSON_PROPERTY_SOURCE_INTEGRITY
})
@JsonTypeName("facial_similarity_photo_fully_auto_breakdown_image_integrity_breakdown")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FacialSimilarityPhotoFullyAutoBreakdownImageIntegrityBreakdown {
  public static final String JSON_PROPERTY_FACE_DETECTED = "face_detected";
  private FacialSimilarityPhotoBreakdownImageIntegrityBreakdownFaceDetected faceDetected;

  public static final String JSON_PROPERTY_SOURCE_INTEGRITY = "source_integrity";
  private FacialSimilarityPhotoFullyAutoBreakdownImageIntegrityBreakdownSourceIntegrity sourceIntegrity;

  public FacialSimilarityPhotoFullyAutoBreakdownImageIntegrityBreakdown() { 
  }

  public FacialSimilarityPhotoFullyAutoBreakdownImageIntegrityBreakdown faceDetected(FacialSimilarityPhotoBreakdownImageIntegrityBreakdownFaceDetected faceDetected) {
    this.faceDetected = faceDetected;
    return this;
  }

   /**
   * Get faceDetected
   * @return faceDetected
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FACE_DETECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FacialSimilarityPhotoBreakdownImageIntegrityBreakdownFaceDetected getFaceDetected() {
    return faceDetected;
  }


  @JsonProperty(JSON_PROPERTY_FACE_DETECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFaceDetected(FacialSimilarityPhotoBreakdownImageIntegrityBreakdownFaceDetected faceDetected) {
    this.faceDetected = faceDetected;
  }


  public FacialSimilarityPhotoFullyAutoBreakdownImageIntegrityBreakdown sourceIntegrity(FacialSimilarityPhotoFullyAutoBreakdownImageIntegrityBreakdownSourceIntegrity sourceIntegrity) {
    this.sourceIntegrity = sourceIntegrity;
    return this;
  }

   /**
   * Get sourceIntegrity
   * @return sourceIntegrity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_INTEGRITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FacialSimilarityPhotoFullyAutoBreakdownImageIntegrityBreakdownSourceIntegrity getSourceIntegrity() {
    return sourceIntegrity;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_INTEGRITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceIntegrity(FacialSimilarityPhotoFullyAutoBreakdownImageIntegrityBreakdownSourceIntegrity sourceIntegrity) {
    this.sourceIntegrity = sourceIntegrity;
  }


  /**
   * Return true if this facial_similarity_photo_fully_auto_breakdown_image_integrity_breakdown object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacialSimilarityPhotoFullyAutoBreakdownImageIntegrityBreakdown facialSimilarityPhotoFullyAutoBreakdownImageIntegrityBreakdown = (FacialSimilarityPhotoFullyAutoBreakdownImageIntegrityBreakdown) o;
    return Objects.equals(this.faceDetected, facialSimilarityPhotoFullyAutoBreakdownImageIntegrityBreakdown.faceDetected) &&
        Objects.equals(this.sourceIntegrity, facialSimilarityPhotoFullyAutoBreakdownImageIntegrityBreakdown.sourceIntegrity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faceDetected, sourceIntegrity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacialSimilarityPhotoFullyAutoBreakdownImageIntegrityBreakdown {\n");
    sb.append("    faceDetected: ").append(toIndentedString(faceDetected)).append("\n");
    sb.append("    sourceIntegrity: ").append(toIndentedString(sourceIntegrity)).append("\n");
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
