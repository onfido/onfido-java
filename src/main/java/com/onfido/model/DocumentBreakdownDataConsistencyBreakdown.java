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
 * DocumentBreakdownDataConsistencyBreakdown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class DocumentBreakdownDataConsistencyBreakdown {
  public static final String SERIALIZED_NAME_DATE_OF_EXPIRY = "date_of_expiry";
  @SerializedName(SERIALIZED_NAME_DATE_OF_EXPIRY)
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry dateOfExpiry;

  public static final String SERIALIZED_NAME_DOCUMENT_NUMBERS = "document_numbers";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NUMBERS)
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry documentNumbers;

  public static final String SERIALIZED_NAME_ISSUING_COUNTRY = "issuing_country";
  @SerializedName(SERIALIZED_NAME_ISSUING_COUNTRY)
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry issuingCountry;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "document_type";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry documentType;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry dateOfBirth;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry gender;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry firstName;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry nationality;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry lastName;

  public static final String SERIALIZED_NAME_MULTIPLE_DATA_SOURCES_PRESENT = "multiple_data_sources_present";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_DATA_SOURCES_PRESENT)
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry multipleDataSourcesPresent;

  public DocumentBreakdownDataConsistencyBreakdown() {
  }

  public DocumentBreakdownDataConsistencyBreakdown dateOfExpiry(DocumentBreakdownDataComparisonBreakdownIssuingCountry dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
    return this;
  }

  /**
   * Get dateOfExpiry
   * @return dateOfExpiry
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getDateOfExpiry() {
    return dateOfExpiry;
  }

  public void setDateOfExpiry(DocumentBreakdownDataComparisonBreakdownIssuingCountry dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
  }


  public DocumentBreakdownDataConsistencyBreakdown documentNumbers(DocumentBreakdownDataComparisonBreakdownIssuingCountry documentNumbers) {
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

  public void setDocumentNumbers(DocumentBreakdownDataComparisonBreakdownIssuingCountry documentNumbers) {
    this.documentNumbers = documentNumbers;
  }


  public DocumentBreakdownDataConsistencyBreakdown issuingCountry(DocumentBreakdownDataComparisonBreakdownIssuingCountry issuingCountry) {
    this.issuingCountry = issuingCountry;
    return this;
  }

  /**
   * Get issuingCountry
   * @return issuingCountry
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getIssuingCountry() {
    return issuingCountry;
  }

  public void setIssuingCountry(DocumentBreakdownDataComparisonBreakdownIssuingCountry issuingCountry) {
    this.issuingCountry = issuingCountry;
  }


  public DocumentBreakdownDataConsistencyBreakdown documentType(DocumentBreakdownDataComparisonBreakdownIssuingCountry documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * Get documentType
   * @return documentType
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getDocumentType() {
    return documentType;
  }

  public void setDocumentType(DocumentBreakdownDataComparisonBreakdownIssuingCountry documentType) {
    this.documentType = documentType;
  }


  public DocumentBreakdownDataConsistencyBreakdown dateOfBirth(DocumentBreakdownDataComparisonBreakdownIssuingCountry dateOfBirth) {
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

  public void setDateOfBirth(DocumentBreakdownDataComparisonBreakdownIssuingCountry dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public DocumentBreakdownDataConsistencyBreakdown gender(DocumentBreakdownDataComparisonBreakdownIssuingCountry gender) {
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

  public void setGender(DocumentBreakdownDataComparisonBreakdownIssuingCountry gender) {
    this.gender = gender;
  }


  public DocumentBreakdownDataConsistencyBreakdown firstName(DocumentBreakdownDataComparisonBreakdownIssuingCountry firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getFirstName() {
    return firstName;
  }

  public void setFirstName(DocumentBreakdownDataComparisonBreakdownIssuingCountry firstName) {
    this.firstName = firstName;
  }


  public DocumentBreakdownDataConsistencyBreakdown nationality(DocumentBreakdownDataComparisonBreakdownIssuingCountry nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getNationality() {
    return nationality;
  }

  public void setNationality(DocumentBreakdownDataComparisonBreakdownIssuingCountry nationality) {
    this.nationality = nationality;
  }


  public DocumentBreakdownDataConsistencyBreakdown lastName(DocumentBreakdownDataComparisonBreakdownIssuingCountry lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getLastName() {
    return lastName;
  }

  public void setLastName(DocumentBreakdownDataComparisonBreakdownIssuingCountry lastName) {
    this.lastName = lastName;
  }


  public DocumentBreakdownDataConsistencyBreakdown multipleDataSourcesPresent(DocumentBreakdownDataComparisonBreakdownIssuingCountry multipleDataSourcesPresent) {
    this.multipleDataSourcesPresent = multipleDataSourcesPresent;
    return this;
  }

  /**
   * Get multipleDataSourcesPresent
   * @return multipleDataSourcesPresent
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getMultipleDataSourcesPresent() {
    return multipleDataSourcesPresent;
  }

  public void setMultipleDataSourcesPresent(DocumentBreakdownDataComparisonBreakdownIssuingCountry multipleDataSourcesPresent) {
    this.multipleDataSourcesPresent = multipleDataSourcesPresent;
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
   * @return the DocumentBreakdownDataConsistencyBreakdown instance itself
   */
  public DocumentBreakdownDataConsistencyBreakdown putAdditionalProperty(String key, Object value) {
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
    DocumentBreakdownDataConsistencyBreakdown documentBreakdownDataConsistencyBreakdown = (DocumentBreakdownDataConsistencyBreakdown) o;
    return Objects.equals(this.dateOfExpiry, documentBreakdownDataConsistencyBreakdown.dateOfExpiry) &&
        Objects.equals(this.documentNumbers, documentBreakdownDataConsistencyBreakdown.documentNumbers) &&
        Objects.equals(this.issuingCountry, documentBreakdownDataConsistencyBreakdown.issuingCountry) &&
        Objects.equals(this.documentType, documentBreakdownDataConsistencyBreakdown.documentType) &&
        Objects.equals(this.dateOfBirth, documentBreakdownDataConsistencyBreakdown.dateOfBirth) &&
        Objects.equals(this.gender, documentBreakdownDataConsistencyBreakdown.gender) &&
        Objects.equals(this.firstName, documentBreakdownDataConsistencyBreakdown.firstName) &&
        Objects.equals(this.nationality, documentBreakdownDataConsistencyBreakdown.nationality) &&
        Objects.equals(this.lastName, documentBreakdownDataConsistencyBreakdown.lastName) &&
        Objects.equals(this.multipleDataSourcesPresent, documentBreakdownDataConsistencyBreakdown.multipleDataSourcesPresent)&&
        Objects.equals(this.additionalProperties, documentBreakdownDataConsistencyBreakdown.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfExpiry, documentNumbers, issuingCountry, documentType, dateOfBirth, gender, firstName, nationality, lastName, multipleDataSourcesPresent, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBreakdownDataConsistencyBreakdown {\n");
    sb.append("    dateOfExpiry: ").append(toIndentedString(dateOfExpiry)).append("\n");
    sb.append("    documentNumbers: ").append(toIndentedString(documentNumbers)).append("\n");
    sb.append("    issuingCountry: ").append(toIndentedString(issuingCountry)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    multipleDataSourcesPresent: ").append(toIndentedString(multipleDataSourcesPresent)).append("\n");
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
    openapiFields.add("date_of_expiry");
    openapiFields.add("document_numbers");
    openapiFields.add("issuing_country");
    openapiFields.add("document_type");
    openapiFields.add("date_of_birth");
    openapiFields.add("gender");
    openapiFields.add("first_name");
    openapiFields.add("nationality");
    openapiFields.add("last_name");
    openapiFields.add("multiple_data_sources_present");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentBreakdownDataConsistencyBreakdown
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentBreakdownDataConsistencyBreakdown.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentBreakdownDataConsistencyBreakdown is not found in the empty JSON string", DocumentBreakdownDataConsistencyBreakdown.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `date_of_expiry`
      if (jsonObj.get("date_of_expiry") != null && !jsonObj.get("date_of_expiry").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("date_of_expiry"));
      }
      // validate the optional field `document_numbers`
      if (jsonObj.get("document_numbers") != null && !jsonObj.get("document_numbers").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("document_numbers"));
      }
      // validate the optional field `issuing_country`
      if (jsonObj.get("issuing_country") != null && !jsonObj.get("issuing_country").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("issuing_country"));
      }
      // validate the optional field `document_type`
      if (jsonObj.get("document_type") != null && !jsonObj.get("document_type").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("document_type"));
      }
      // validate the optional field `date_of_birth`
      if (jsonObj.get("date_of_birth") != null && !jsonObj.get("date_of_birth").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("date_of_birth"));
      }
      // validate the optional field `gender`
      if (jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("gender"));
      }
      // validate the optional field `first_name`
      if (jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("first_name"));
      }
      // validate the optional field `nationality`
      if (jsonObj.get("nationality") != null && !jsonObj.get("nationality").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("nationality"));
      }
      // validate the optional field `last_name`
      if (jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("last_name"));
      }
      // validate the optional field `multiple_data_sources_present`
      if (jsonObj.get("multiple_data_sources_present") != null && !jsonObj.get("multiple_data_sources_present").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("multiple_data_sources_present"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentBreakdownDataConsistencyBreakdown.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentBreakdownDataConsistencyBreakdown' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentBreakdownDataConsistencyBreakdown> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentBreakdownDataConsistencyBreakdown.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentBreakdownDataConsistencyBreakdown>() {
           @Override
           public void write(JsonWriter out, DocumentBreakdownDataConsistencyBreakdown value) throws IOException {
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
           public DocumentBreakdownDataConsistencyBreakdown read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DocumentBreakdownDataConsistencyBreakdown instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of DocumentBreakdownDataConsistencyBreakdown given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentBreakdownDataConsistencyBreakdown
   * @throws IOException if the JSON string is invalid with respect to DocumentBreakdownDataConsistencyBreakdown
   */
  public static DocumentBreakdownDataConsistencyBreakdown fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentBreakdownDataConsistencyBreakdown.class);
  }

  /**
   * Convert an instance of DocumentBreakdownDataConsistencyBreakdown to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

