/*
 * Onfido API v3.6
 * The Onfido API (v3.6)
 *
 * The version of the OpenAPI document: v3.6
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
import com.onfido.model.DocumentBreakdownDataComparisonBreakdownIssuingCountry;
import com.onfido.model.DocumentBreakdownDataValidationBreakdownDocumentExpiration;
import com.onfido.model.DocumentBreakdownDataValidationBreakdownExpiryDate;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.onfido.JSON;

/**
 * DocumentBreakdownDataValidationBreakdown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class DocumentBreakdownDataValidationBreakdown {
  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  @javax.annotation.Nullable
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry gender;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  @javax.annotation.Nullable
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry dateOfBirth;

  public static final String SERIALIZED_NAME_DOCUMENT_NUMBERS = "document_numbers";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NUMBERS)
  @javax.annotation.Nullable
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry documentNumbers;

  public static final String SERIALIZED_NAME_DOCUMENT_EXPIRATION = "document_expiration";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_EXPIRATION)
  @javax.annotation.Nullable
  private DocumentBreakdownDataValidationBreakdownDocumentExpiration documentExpiration;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiry_date";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  @javax.annotation.Nullable
  private DocumentBreakdownDataValidationBreakdownExpiryDate expiryDate;

  public static final String SERIALIZED_NAME_MRZ = "mrz";
  @SerializedName(SERIALIZED_NAME_MRZ)
  @javax.annotation.Nullable
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry mrz;

  public static final String SERIALIZED_NAME_BARCODE = "barcode";
  @SerializedName(SERIALIZED_NAME_BARCODE)
  @javax.annotation.Nullable
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry barcode;

  public DocumentBreakdownDataValidationBreakdown() {
  }

  public DocumentBreakdownDataValidationBreakdown gender(@javax.annotation.Nullable DocumentBreakdownDataComparisonBreakdownIssuingCountry gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getGender() {
    return gender;
  }

  public void setGender(@javax.annotation.Nullable DocumentBreakdownDataComparisonBreakdownIssuingCountry gender) {
    this.gender = gender;
  }


  public DocumentBreakdownDataValidationBreakdown dateOfBirth(@javax.annotation.Nullable DocumentBreakdownDataComparisonBreakdownIssuingCountry dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(@javax.annotation.Nullable DocumentBreakdownDataComparisonBreakdownIssuingCountry dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public DocumentBreakdownDataValidationBreakdown documentNumbers(@javax.annotation.Nullable DocumentBreakdownDataComparisonBreakdownIssuingCountry documentNumbers) {
    this.documentNumbers = documentNumbers;
    return this;
  }

  /**
   * Get documentNumbers
   * @return documentNumbers
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getDocumentNumbers() {
    return documentNumbers;
  }

  public void setDocumentNumbers(@javax.annotation.Nullable DocumentBreakdownDataComparisonBreakdownIssuingCountry documentNumbers) {
    this.documentNumbers = documentNumbers;
  }


  public DocumentBreakdownDataValidationBreakdown documentExpiration(@javax.annotation.Nullable DocumentBreakdownDataValidationBreakdownDocumentExpiration documentExpiration) {
    this.documentExpiration = documentExpiration;
    return this;
  }

  /**
   * Get documentExpiration
   * @return documentExpiration
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataValidationBreakdownDocumentExpiration getDocumentExpiration() {
    return documentExpiration;
  }

  public void setDocumentExpiration(@javax.annotation.Nullable DocumentBreakdownDataValidationBreakdownDocumentExpiration documentExpiration) {
    this.documentExpiration = documentExpiration;
  }


  public DocumentBreakdownDataValidationBreakdown expiryDate(@javax.annotation.Nullable DocumentBreakdownDataValidationBreakdownExpiryDate expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * Get expiryDate
   * @return expiryDate
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataValidationBreakdownExpiryDate getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(@javax.annotation.Nullable DocumentBreakdownDataValidationBreakdownExpiryDate expiryDate) {
    this.expiryDate = expiryDate;
  }


  public DocumentBreakdownDataValidationBreakdown mrz(@javax.annotation.Nullable DocumentBreakdownDataComparisonBreakdownIssuingCountry mrz) {
    this.mrz = mrz;
    return this;
  }

  /**
   * Get mrz
   * @return mrz
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getMrz() {
    return mrz;
  }

  public void setMrz(@javax.annotation.Nullable DocumentBreakdownDataComparisonBreakdownIssuingCountry mrz) {
    this.mrz = mrz;
  }


  public DocumentBreakdownDataValidationBreakdown barcode(@javax.annotation.Nullable DocumentBreakdownDataComparisonBreakdownIssuingCountry barcode) {
    this.barcode = barcode;
    return this;
  }

  /**
   * Get barcode
   * @return barcode
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getBarcode() {
    return barcode;
  }

  public void setBarcode(@javax.annotation.Nullable DocumentBreakdownDataComparisonBreakdownIssuingCountry barcode) {
    this.barcode = barcode;
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
   * @return the DocumentBreakdownDataValidationBreakdown instance itself
   */
  public DocumentBreakdownDataValidationBreakdown putAdditionalProperty(String key, Object value) {
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
    DocumentBreakdownDataValidationBreakdown documentBreakdownDataValidationBreakdown = (DocumentBreakdownDataValidationBreakdown) o;
    return Objects.equals(this.gender, documentBreakdownDataValidationBreakdown.gender) &&
        Objects.equals(this.dateOfBirth, documentBreakdownDataValidationBreakdown.dateOfBirth) &&
        Objects.equals(this.documentNumbers, documentBreakdownDataValidationBreakdown.documentNumbers) &&
        Objects.equals(this.documentExpiration, documentBreakdownDataValidationBreakdown.documentExpiration) &&
        Objects.equals(this.expiryDate, documentBreakdownDataValidationBreakdown.expiryDate) &&
        Objects.equals(this.mrz, documentBreakdownDataValidationBreakdown.mrz) &&
        Objects.equals(this.barcode, documentBreakdownDataValidationBreakdown.barcode)&&
        Objects.equals(this.additionalProperties, documentBreakdownDataValidationBreakdown.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender, dateOfBirth, documentNumbers, documentExpiration, expiryDate, mrz, barcode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBreakdownDataValidationBreakdown {\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    documentNumbers: ").append(toIndentedString(documentNumbers)).append("\n");
    sb.append("    documentExpiration: ").append(toIndentedString(documentExpiration)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    mrz: ").append(toIndentedString(mrz)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
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
    openapiFields.add("gender");
    openapiFields.add("date_of_birth");
    openapiFields.add("document_numbers");
    openapiFields.add("document_expiration");
    openapiFields.add("expiry_date");
    openapiFields.add("mrz");
    openapiFields.add("barcode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentBreakdownDataValidationBreakdown
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentBreakdownDataValidationBreakdown.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentBreakdownDataValidationBreakdown is not found in the empty JSON string", DocumentBreakdownDataValidationBreakdown.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `gender`
      if (jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("gender"));
      }
      // validate the optional field `date_of_birth`
      if (jsonObj.get("date_of_birth") != null && !jsonObj.get("date_of_birth").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("date_of_birth"));
      }
      // validate the optional field `document_numbers`
      if (jsonObj.get("document_numbers") != null && !jsonObj.get("document_numbers").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("document_numbers"));
      }
      // validate the optional field `document_expiration`
      if (jsonObj.get("document_expiration") != null && !jsonObj.get("document_expiration").isJsonNull()) {
        DocumentBreakdownDataValidationBreakdownDocumentExpiration.validateJsonElement(jsonObj.get("document_expiration"));
      }
      // validate the optional field `expiry_date`
      if (jsonObj.get("expiry_date") != null && !jsonObj.get("expiry_date").isJsonNull()) {
        DocumentBreakdownDataValidationBreakdownExpiryDate.validateJsonElement(jsonObj.get("expiry_date"));
      }
      // validate the optional field `mrz`
      if (jsonObj.get("mrz") != null && !jsonObj.get("mrz").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("mrz"));
      }
      // validate the optional field `barcode`
      if (jsonObj.get("barcode") != null && !jsonObj.get("barcode").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("barcode"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentBreakdownDataValidationBreakdown.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentBreakdownDataValidationBreakdown' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentBreakdownDataValidationBreakdown> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentBreakdownDataValidationBreakdown.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentBreakdownDataValidationBreakdown>() {
           @Override
           public void write(JsonWriter out, DocumentBreakdownDataValidationBreakdown value) throws IOException {
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
                   } else if (jsonElement.isJsonObject()) { 
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentBreakdownDataValidationBreakdown read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DocumentBreakdownDataValidationBreakdown instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of DocumentBreakdownDataValidationBreakdown given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentBreakdownDataValidationBreakdown
   * @throws IOException if the JSON string is invalid with respect to DocumentBreakdownDataValidationBreakdown
   */
  public static DocumentBreakdownDataValidationBreakdown fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentBreakdownDataValidationBreakdown.class);
  }

  /**
   * Convert an instance of DocumentBreakdownDataValidationBreakdown to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

