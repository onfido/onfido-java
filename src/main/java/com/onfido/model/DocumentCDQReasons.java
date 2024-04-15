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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.onfido.JSON;

/**
 * DocumentCDQReasons
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DocumentCDQReasons {
  public static final String SERIALIZED_NAME_OBSCURED_DATA_POINTS = "obscured_data_points";
  @SerializedName(SERIALIZED_NAME_OBSCURED_DATA_POINTS)
  private String obscuredDataPoints;

  public static final String SERIALIZED_NAME_OBSCURED_SECURITY_FEATURES = "obscured_security_features";
  @SerializedName(SERIALIZED_NAME_OBSCURED_SECURITY_FEATURES)
  private String obscuredSecurityFeatures;

  public static final String SERIALIZED_NAME_ABNORMAL_DOCUMENT_FEATURES = "abnormal_document_features";
  @SerializedName(SERIALIZED_NAME_ABNORMAL_DOCUMENT_FEATURES)
  private String abnormalDocumentFeatures;

  public static final String SERIALIZED_NAME_WATERMARKS_DIGITAL_TEXT_OVERLAY = "watermarks_digital_text_overlay";
  @SerializedName(SERIALIZED_NAME_WATERMARKS_DIGITAL_TEXT_OVERLAY)
  private String watermarksDigitalTextOverlay;

  public static final String SERIALIZED_NAME_CORNER_REMOVED = "corner_removed";
  @SerializedName(SERIALIZED_NAME_CORNER_REMOVED)
  private String cornerRemoved;

  public static final String SERIALIZED_NAME_PUNCTURED_DOCUMENT = "punctured_document";
  @SerializedName(SERIALIZED_NAME_PUNCTURED_DOCUMENT)
  private String puncturedDocument;

  public static final String SERIALIZED_NAME_MISSING_BACK = "missing_back";
  @SerializedName(SERIALIZED_NAME_MISSING_BACK)
  private String missingBack;

  public static final String SERIALIZED_NAME_DIGITAL_DOCUMENT = "digital_document";
  @SerializedName(SERIALIZED_NAME_DIGITAL_DOCUMENT)
  private String digitalDocument;

  public DocumentCDQReasons() {
  }

  public DocumentCDQReasons obscuredDataPoints(String obscuredDataPoints) {
    this.obscuredDataPoints = obscuredDataPoints;
    return this;
  }

   /**
   * When data points are obscured to the point that we cannot confirm if the fonts match the expected ones.
   * @return obscuredDataPoints
  **/
  @javax.annotation.Nullable
  public String getObscuredDataPoints() {
    return obscuredDataPoints;
  }

  public void setObscuredDataPoints(String obscuredDataPoints) {
    this.obscuredDataPoints = obscuredDataPoints;
  }


  public DocumentCDQReasons obscuredSecurityFeatures(String obscuredSecurityFeatures) {
    this.obscuredSecurityFeatures = obscuredSecurityFeatures;
    return this;
  }

   /**
   * When a critical security feature is obscured. This can also refer to when the holder&#39;s wet signature, necessary for the document to be valid, is not present.
   * @return obscuredSecurityFeatures
  **/
  @javax.annotation.Nullable
  public String getObscuredSecurityFeatures() {
    return obscuredSecurityFeatures;
  }

  public void setObscuredSecurityFeatures(String obscuredSecurityFeatures) {
    this.obscuredSecurityFeatures = obscuredSecurityFeatures;
  }


  public DocumentCDQReasons abnormalDocumentFeatures(String abnormalDocumentFeatures) {
    this.abnormalDocumentFeatures = abnormalDocumentFeatures;
    return this;
  }

   /**
   * One of 3 reasons (1) OCR Assisted Scans (i.e. when you&#39;re able to move the mouse and highlight part of text), (2) Severely Washed out Background, (3) Overlapping Text.
   * @return abnormalDocumentFeatures
  **/
  @javax.annotation.Nullable
  public String getAbnormalDocumentFeatures() {
    return abnormalDocumentFeatures;
  }

  public void setAbnormalDocumentFeatures(String abnormalDocumentFeatures) {
    this.abnormalDocumentFeatures = abnormalDocumentFeatures;
  }


  public DocumentCDQReasons watermarksDigitalTextOverlay(String watermarksDigitalTextOverlay) {
    this.watermarksDigitalTextOverlay = watermarksDigitalTextOverlay;
    return this;
  }

   /**
   * Any digital text or electronic watermarks on the document.
   * @return watermarksDigitalTextOverlay
  **/
  @javax.annotation.Nullable
  public String getWatermarksDigitalTextOverlay() {
    return watermarksDigitalTextOverlay;
  }

  public void setWatermarksDigitalTextOverlay(String watermarksDigitalTextOverlay) {
    this.watermarksDigitalTextOverlay = watermarksDigitalTextOverlay;
  }


  public DocumentCDQReasons cornerRemoved(String cornerRemoved) {
    this.cornerRemoved = cornerRemoved;
    return this;
  }

   /**
   * If the corner has been physically cut off. This can be found on some documents that are no longer valid.
   * @return cornerRemoved
  **/
  @javax.annotation.Nullable
  public String getCornerRemoved() {
    return cornerRemoved;
  }

  public void setCornerRemoved(String cornerRemoved) {
    this.cornerRemoved = cornerRemoved;
  }


  public DocumentCDQReasons puncturedDocument(String puncturedDocument) {
    this.puncturedDocument = puncturedDocument;
    return this;
  }

   /**
   * A punched hole is present.
   * @return puncturedDocument
  **/
  @javax.annotation.Nullable
  public String getPuncturedDocument() {
    return puncturedDocument;
  }

  public void setPuncturedDocument(String puncturedDocument) {
    this.puncturedDocument = puncturedDocument;
  }


  public DocumentCDQReasons missingBack(String missingBack) {
    this.missingBack = missingBack;
    return this;
  }

   /**
   * When the back of a document is needed for processing, but is not available.
   * @return missingBack
  **/
  @javax.annotation.Nullable
  public String getMissingBack() {
    return missingBack;
  }

  public void setMissingBack(String missingBack) {
    this.missingBack = missingBack;
  }


  public DocumentCDQReasons digitalDocument(String digitalDocument) {
    this.digitalDocument = digitalDocument;
    return this;
  }

   /**
   * When a document has been published digitally, there aren&#39;t enough security features to review so we cannot perform a full fraud assessment.
   * @return digitalDocument
  **/
  @javax.annotation.Nullable
  public String getDigitalDocument() {
    return digitalDocument;
  }

  public void setDigitalDocument(String digitalDocument) {
    this.digitalDocument = digitalDocument;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the DocumentCDQReasons instance itself
   */
  public DocumentCDQReasons putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentCDQReasons documentCDQReasons = (DocumentCDQReasons) o;
    return Objects.equals(this.obscuredDataPoints, documentCDQReasons.obscuredDataPoints) &&
        Objects.equals(this.obscuredSecurityFeatures, documentCDQReasons.obscuredSecurityFeatures) &&
        Objects.equals(this.abnormalDocumentFeatures, documentCDQReasons.abnormalDocumentFeatures) &&
        Objects.equals(this.watermarksDigitalTextOverlay, documentCDQReasons.watermarksDigitalTextOverlay) &&
        Objects.equals(this.cornerRemoved, documentCDQReasons.cornerRemoved) &&
        Objects.equals(this.puncturedDocument, documentCDQReasons.puncturedDocument) &&
        Objects.equals(this.missingBack, documentCDQReasons.missingBack) &&
        Objects.equals(this.digitalDocument, documentCDQReasons.digitalDocument)&&
        Objects.equals(this.additionalProperties, documentCDQReasons.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(obscuredDataPoints, obscuredSecurityFeatures, abnormalDocumentFeatures, watermarksDigitalTextOverlay, cornerRemoved, puncturedDocument, missingBack, digitalDocument, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCDQReasons {\n");
    sb.append("    obscuredDataPoints: ").append(toIndentedString(obscuredDataPoints)).append("\n");
    sb.append("    obscuredSecurityFeatures: ").append(toIndentedString(obscuredSecurityFeatures)).append("\n");
    sb.append("    abnormalDocumentFeatures: ").append(toIndentedString(abnormalDocumentFeatures)).append("\n");
    sb.append("    watermarksDigitalTextOverlay: ").append(toIndentedString(watermarksDigitalTextOverlay)).append("\n");
    sb.append("    cornerRemoved: ").append(toIndentedString(cornerRemoved)).append("\n");
    sb.append("    puncturedDocument: ").append(toIndentedString(puncturedDocument)).append("\n");
    sb.append("    missingBack: ").append(toIndentedString(missingBack)).append("\n");
    sb.append("    digitalDocument: ").append(toIndentedString(digitalDocument)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("obscured_data_points");
    openapiFields.add("obscured_security_features");
    openapiFields.add("abnormal_document_features");
    openapiFields.add("watermarks_digital_text_overlay");
    openapiFields.add("corner_removed");
    openapiFields.add("punctured_document");
    openapiFields.add("missing_back");
    openapiFields.add("digital_document");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DocumentCDQReasons
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentCDQReasons.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentCDQReasons is not found in the empty JSON string", DocumentCDQReasons.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("obscured_data_points") != null && !jsonObj.get("obscured_data_points").isJsonNull()) && !jsonObj.get("obscured_data_points").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `obscured_data_points` to be a primitive type in the JSON string but got `%s`", jsonObj.get("obscured_data_points").toString()));
      }
      if ((jsonObj.get("obscured_security_features") != null && !jsonObj.get("obscured_security_features").isJsonNull()) && !jsonObj.get("obscured_security_features").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `obscured_security_features` to be a primitive type in the JSON string but got `%s`", jsonObj.get("obscured_security_features").toString()));
      }
      if ((jsonObj.get("abnormal_document_features") != null && !jsonObj.get("abnormal_document_features").isJsonNull()) && !jsonObj.get("abnormal_document_features").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `abnormal_document_features` to be a primitive type in the JSON string but got `%s`", jsonObj.get("abnormal_document_features").toString()));
      }
      if ((jsonObj.get("watermarks_digital_text_overlay") != null && !jsonObj.get("watermarks_digital_text_overlay").isJsonNull()) && !jsonObj.get("watermarks_digital_text_overlay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `watermarks_digital_text_overlay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("watermarks_digital_text_overlay").toString()));
      }
      if ((jsonObj.get("corner_removed") != null && !jsonObj.get("corner_removed").isJsonNull()) && !jsonObj.get("corner_removed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `corner_removed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("corner_removed").toString()));
      }
      if ((jsonObj.get("punctured_document") != null && !jsonObj.get("punctured_document").isJsonNull()) && !jsonObj.get("punctured_document").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `punctured_document` to be a primitive type in the JSON string but got `%s`", jsonObj.get("punctured_document").toString()));
      }
      if ((jsonObj.get("missing_back") != null && !jsonObj.get("missing_back").isJsonNull()) && !jsonObj.get("missing_back").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `missing_back` to be a primitive type in the JSON string but got `%s`", jsonObj.get("missing_back").toString()));
      }
      if ((jsonObj.get("digital_document") != null && !jsonObj.get("digital_document").isJsonNull()) && !jsonObj.get("digital_document").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `digital_document` to be a primitive type in the JSON string but got `%s`", jsonObj.get("digital_document").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentCDQReasons.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentCDQReasons' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentCDQReasons> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentCDQReasons.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentCDQReasons>() {
           @Override
           public void write(JsonWriter out, DocumentCDQReasons value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentCDQReasons read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DocumentCDQReasons instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentCDQReasons given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentCDQReasons
  * @throws IOException if the JSON string is invalid with respect to DocumentCDQReasons
  */
  public static DocumentCDQReasons fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentCDQReasons.class);
  }

 /**
  * Convert an instance of DocumentCDQReasons to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

