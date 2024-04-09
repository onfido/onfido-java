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
import com.onfido.model.DocumentBreakdownVisualAuthenticityBreakdownDigitalTampering;
import com.onfido.model.DocumentBreakdownVisualAuthenticityBreakdownFaceDetection;
import com.onfido.model.DocumentBreakdownVisualAuthenticityBreakdownFonts;
import com.onfido.model.DocumentBreakdownVisualAuthenticityBreakdownOriginalDocumentPresent;
import com.onfido.model.DocumentBreakdownVisualAuthenticityBreakdownOther;
import com.onfido.model.DocumentBreakdownVisualAuthenticityBreakdownPictureFaceIntegrity;
import com.onfido.model.DocumentBreakdownVisualAuthenticityBreakdownSecurityFeatures;
import com.onfido.model.DocumentBreakdownVisualAuthenticityBreakdownTemplate;
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
 * DocumentBreakdownVisualAuthenticityBreakdown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DocumentBreakdownVisualAuthenticityBreakdown {
  public static final String SERIALIZED_NAME_FONTS = "fonts";
  @SerializedName(SERIALIZED_NAME_FONTS)
  private DocumentBreakdownVisualAuthenticityBreakdownFonts fonts;

  public static final String SERIALIZED_NAME_PICTURE_FACE_INTEGRITY = "picture_face_integrity";
  @SerializedName(SERIALIZED_NAME_PICTURE_FACE_INTEGRITY)
  private DocumentBreakdownVisualAuthenticityBreakdownPictureFaceIntegrity pictureFaceIntegrity;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private DocumentBreakdownVisualAuthenticityBreakdownTemplate template;

  public static final String SERIALIZED_NAME_SECURITY_FEATURES = "security_features";
  @SerializedName(SERIALIZED_NAME_SECURITY_FEATURES)
  private DocumentBreakdownVisualAuthenticityBreakdownSecurityFeatures securityFeatures;

  public static final String SERIALIZED_NAME_ORIGINAL_DOCUMENT_PRESENT = "original_document_present";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_DOCUMENT_PRESENT)
  private DocumentBreakdownVisualAuthenticityBreakdownOriginalDocumentPresent originalDocumentPresent;

  public static final String SERIALIZED_NAME_DIGITAL_TAMPERING = "digital_tampering";
  @SerializedName(SERIALIZED_NAME_DIGITAL_TAMPERING)
  private DocumentBreakdownVisualAuthenticityBreakdownDigitalTampering digitalTampering;

  public static final String SERIALIZED_NAME_OTHER = "other";
  @SerializedName(SERIALIZED_NAME_OTHER)
  private DocumentBreakdownVisualAuthenticityBreakdownOther other;

  public static final String SERIALIZED_NAME_FACE_DETECTION = "face_detection";
  @SerializedName(SERIALIZED_NAME_FACE_DETECTION)
  private DocumentBreakdownVisualAuthenticityBreakdownFaceDetection faceDetection;

  public DocumentBreakdownVisualAuthenticityBreakdown() {
  }

  public DocumentBreakdownVisualAuthenticityBreakdown fonts(DocumentBreakdownVisualAuthenticityBreakdownFonts fonts) {
    this.fonts = fonts;
    return this;
  }

   /**
   * Get fonts
   * @return fonts
  **/
  @javax.annotation.Nullable
  public DocumentBreakdownVisualAuthenticityBreakdownFonts getFonts() {
    return fonts;
  }

  public void setFonts(DocumentBreakdownVisualAuthenticityBreakdownFonts fonts) {
    this.fonts = fonts;
  }


  public DocumentBreakdownVisualAuthenticityBreakdown pictureFaceIntegrity(DocumentBreakdownVisualAuthenticityBreakdownPictureFaceIntegrity pictureFaceIntegrity) {
    this.pictureFaceIntegrity = pictureFaceIntegrity;
    return this;
  }

   /**
   * Get pictureFaceIntegrity
   * @return pictureFaceIntegrity
  **/
  @javax.annotation.Nullable
  public DocumentBreakdownVisualAuthenticityBreakdownPictureFaceIntegrity getPictureFaceIntegrity() {
    return pictureFaceIntegrity;
  }

  public void setPictureFaceIntegrity(DocumentBreakdownVisualAuthenticityBreakdownPictureFaceIntegrity pictureFaceIntegrity) {
    this.pictureFaceIntegrity = pictureFaceIntegrity;
  }


  public DocumentBreakdownVisualAuthenticityBreakdown template(DocumentBreakdownVisualAuthenticityBreakdownTemplate template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  public DocumentBreakdownVisualAuthenticityBreakdownTemplate getTemplate() {
    return template;
  }

  public void setTemplate(DocumentBreakdownVisualAuthenticityBreakdownTemplate template) {
    this.template = template;
  }


  public DocumentBreakdownVisualAuthenticityBreakdown securityFeatures(DocumentBreakdownVisualAuthenticityBreakdownSecurityFeatures securityFeatures) {
    this.securityFeatures = securityFeatures;
    return this;
  }

   /**
   * Get securityFeatures
   * @return securityFeatures
  **/
  @javax.annotation.Nullable
  public DocumentBreakdownVisualAuthenticityBreakdownSecurityFeatures getSecurityFeatures() {
    return securityFeatures;
  }

  public void setSecurityFeatures(DocumentBreakdownVisualAuthenticityBreakdownSecurityFeatures securityFeatures) {
    this.securityFeatures = securityFeatures;
  }


  public DocumentBreakdownVisualAuthenticityBreakdown originalDocumentPresent(DocumentBreakdownVisualAuthenticityBreakdownOriginalDocumentPresent originalDocumentPresent) {
    this.originalDocumentPresent = originalDocumentPresent;
    return this;
  }

   /**
   * Get originalDocumentPresent
   * @return originalDocumentPresent
  **/
  @javax.annotation.Nullable
  public DocumentBreakdownVisualAuthenticityBreakdownOriginalDocumentPresent getOriginalDocumentPresent() {
    return originalDocumentPresent;
  }

  public void setOriginalDocumentPresent(DocumentBreakdownVisualAuthenticityBreakdownOriginalDocumentPresent originalDocumentPresent) {
    this.originalDocumentPresent = originalDocumentPresent;
  }


  public DocumentBreakdownVisualAuthenticityBreakdown digitalTampering(DocumentBreakdownVisualAuthenticityBreakdownDigitalTampering digitalTampering) {
    this.digitalTampering = digitalTampering;
    return this;
  }

   /**
   * Get digitalTampering
   * @return digitalTampering
  **/
  @javax.annotation.Nullable
  public DocumentBreakdownVisualAuthenticityBreakdownDigitalTampering getDigitalTampering() {
    return digitalTampering;
  }

  public void setDigitalTampering(DocumentBreakdownVisualAuthenticityBreakdownDigitalTampering digitalTampering) {
    this.digitalTampering = digitalTampering;
  }


  public DocumentBreakdownVisualAuthenticityBreakdown other(DocumentBreakdownVisualAuthenticityBreakdownOther other) {
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/
  @javax.annotation.Nullable
  public DocumentBreakdownVisualAuthenticityBreakdownOther getOther() {
    return other;
  }

  public void setOther(DocumentBreakdownVisualAuthenticityBreakdownOther other) {
    this.other = other;
  }


  public DocumentBreakdownVisualAuthenticityBreakdown faceDetection(DocumentBreakdownVisualAuthenticityBreakdownFaceDetection faceDetection) {
    this.faceDetection = faceDetection;
    return this;
  }

   /**
   * Get faceDetection
   * @return faceDetection
  **/
  @javax.annotation.Nullable
  public DocumentBreakdownVisualAuthenticityBreakdownFaceDetection getFaceDetection() {
    return faceDetection;
  }

  public void setFaceDetection(DocumentBreakdownVisualAuthenticityBreakdownFaceDetection faceDetection) {
    this.faceDetection = faceDetection;
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
   * @return the DocumentBreakdownVisualAuthenticityBreakdown instance itself
   */
  public DocumentBreakdownVisualAuthenticityBreakdown putAdditionalProperty(String key, Object value) {
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
    DocumentBreakdownVisualAuthenticityBreakdown documentBreakdownVisualAuthenticityBreakdown = (DocumentBreakdownVisualAuthenticityBreakdown) o;
    return Objects.equals(this.fonts, documentBreakdownVisualAuthenticityBreakdown.fonts) &&
        Objects.equals(this.pictureFaceIntegrity, documentBreakdownVisualAuthenticityBreakdown.pictureFaceIntegrity) &&
        Objects.equals(this.template, documentBreakdownVisualAuthenticityBreakdown.template) &&
        Objects.equals(this.securityFeatures, documentBreakdownVisualAuthenticityBreakdown.securityFeatures) &&
        Objects.equals(this.originalDocumentPresent, documentBreakdownVisualAuthenticityBreakdown.originalDocumentPresent) &&
        Objects.equals(this.digitalTampering, documentBreakdownVisualAuthenticityBreakdown.digitalTampering) &&
        Objects.equals(this.other, documentBreakdownVisualAuthenticityBreakdown.other) &&
        Objects.equals(this.faceDetection, documentBreakdownVisualAuthenticityBreakdown.faceDetection)&&
        Objects.equals(this.additionalProperties, documentBreakdownVisualAuthenticityBreakdown.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fonts, pictureFaceIntegrity, template, securityFeatures, originalDocumentPresent, digitalTampering, other, faceDetection, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBreakdownVisualAuthenticityBreakdown {\n");
    sb.append("    fonts: ").append(toIndentedString(fonts)).append("\n");
    sb.append("    pictureFaceIntegrity: ").append(toIndentedString(pictureFaceIntegrity)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    securityFeatures: ").append(toIndentedString(securityFeatures)).append("\n");
    sb.append("    originalDocumentPresent: ").append(toIndentedString(originalDocumentPresent)).append("\n");
    sb.append("    digitalTampering: ").append(toIndentedString(digitalTampering)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    faceDetection: ").append(toIndentedString(faceDetection)).append("\n");
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
    openapiFields.add("fonts");
    openapiFields.add("picture_face_integrity");
    openapiFields.add("template");
    openapiFields.add("security_features");
    openapiFields.add("original_document_present");
    openapiFields.add("digital_tampering");
    openapiFields.add("other");
    openapiFields.add("face_detection");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DocumentBreakdownVisualAuthenticityBreakdown
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentBreakdownVisualAuthenticityBreakdown.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentBreakdownVisualAuthenticityBreakdown is not found in the empty JSON string", DocumentBreakdownVisualAuthenticityBreakdown.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `fonts`
      if (jsonObj.get("fonts") != null && !jsonObj.get("fonts").isJsonNull()) {
        DocumentBreakdownVisualAuthenticityBreakdownFonts.validateJsonElement(jsonObj.get("fonts"));
      }
      // validate the optional field `picture_face_integrity`
      if (jsonObj.get("picture_face_integrity") != null && !jsonObj.get("picture_face_integrity").isJsonNull()) {
        DocumentBreakdownVisualAuthenticityBreakdownPictureFaceIntegrity.validateJsonElement(jsonObj.get("picture_face_integrity"));
      }
      // validate the optional field `template`
      if (jsonObj.get("template") != null && !jsonObj.get("template").isJsonNull()) {
        DocumentBreakdownVisualAuthenticityBreakdownTemplate.validateJsonElement(jsonObj.get("template"));
      }
      // validate the optional field `security_features`
      if (jsonObj.get("security_features") != null && !jsonObj.get("security_features").isJsonNull()) {
        DocumentBreakdownVisualAuthenticityBreakdownSecurityFeatures.validateJsonElement(jsonObj.get("security_features"));
      }
      // validate the optional field `original_document_present`
      if (jsonObj.get("original_document_present") != null && !jsonObj.get("original_document_present").isJsonNull()) {
        DocumentBreakdownVisualAuthenticityBreakdownOriginalDocumentPresent.validateJsonElement(jsonObj.get("original_document_present"));
      }
      // validate the optional field `digital_tampering`
      if (jsonObj.get("digital_tampering") != null && !jsonObj.get("digital_tampering").isJsonNull()) {
        DocumentBreakdownVisualAuthenticityBreakdownDigitalTampering.validateJsonElement(jsonObj.get("digital_tampering"));
      }
      // validate the optional field `other`
      if (jsonObj.get("other") != null && !jsonObj.get("other").isJsonNull()) {
        DocumentBreakdownVisualAuthenticityBreakdownOther.validateJsonElement(jsonObj.get("other"));
      }
      // validate the optional field `face_detection`
      if (jsonObj.get("face_detection") != null && !jsonObj.get("face_detection").isJsonNull()) {
        DocumentBreakdownVisualAuthenticityBreakdownFaceDetection.validateJsonElement(jsonObj.get("face_detection"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentBreakdownVisualAuthenticityBreakdown.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentBreakdownVisualAuthenticityBreakdown' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentBreakdownVisualAuthenticityBreakdown> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentBreakdownVisualAuthenticityBreakdown.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentBreakdownVisualAuthenticityBreakdown>() {
           @Override
           public void write(JsonWriter out, DocumentBreakdownVisualAuthenticityBreakdown value) throws IOException {
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
           public DocumentBreakdownVisualAuthenticityBreakdown read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DocumentBreakdownVisualAuthenticityBreakdown instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DocumentBreakdownVisualAuthenticityBreakdown given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentBreakdownVisualAuthenticityBreakdown
  * @throws IOException if the JSON string is invalid with respect to DocumentBreakdownVisualAuthenticityBreakdown
  */
  public static DocumentBreakdownVisualAuthenticityBreakdown fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentBreakdownVisualAuthenticityBreakdown.class);
  }

 /**
  * Convert an instance of DocumentBreakdownVisualAuthenticityBreakdown to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

