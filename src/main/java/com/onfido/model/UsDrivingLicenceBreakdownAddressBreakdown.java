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
 * UsDrivingLicenceBreakdownAddressBreakdown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class UsDrivingLicenceBreakdownAddressBreakdown {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry city;

  public static final String SERIALIZED_NAME_LINE1 = "line_1";
  @SerializedName(SERIALIZED_NAME_LINE1)
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry line1;

  public static final String SERIALIZED_NAME_LINE2 = "line_2";
  @SerializedName(SERIALIZED_NAME_LINE2)
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry line2;

  public static final String SERIALIZED_NAME_STATE_CODE = "state_code";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry stateCode;

  public static final String SERIALIZED_NAME_ZIP4 = "zip4";
  @SerializedName(SERIALIZED_NAME_ZIP4)
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry zip4;

  public static final String SERIALIZED_NAME_ZIP5 = "zip5";
  @SerializedName(SERIALIZED_NAME_ZIP5)
  private DocumentBreakdownDataComparisonBreakdownIssuingCountry zip5;

  public UsDrivingLicenceBreakdownAddressBreakdown() {
  }

  public UsDrivingLicenceBreakdownAddressBreakdown city(DocumentBreakdownDataComparisonBreakdownIssuingCountry city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getCity() {
    return city;
  }

  public void setCity(DocumentBreakdownDataComparisonBreakdownIssuingCountry city) {
    this.city = city;
  }


  public UsDrivingLicenceBreakdownAddressBreakdown line1(DocumentBreakdownDataComparisonBreakdownIssuingCountry line1) {
    this.line1 = line1;
    return this;
  }

  /**
   * Get line1
   * @return line1
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getLine1() {
    return line1;
  }

  public void setLine1(DocumentBreakdownDataComparisonBreakdownIssuingCountry line1) {
    this.line1 = line1;
  }


  public UsDrivingLicenceBreakdownAddressBreakdown line2(DocumentBreakdownDataComparisonBreakdownIssuingCountry line2) {
    this.line2 = line2;
    return this;
  }

  /**
   * Get line2
   * @return line2
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getLine2() {
    return line2;
  }

  public void setLine2(DocumentBreakdownDataComparisonBreakdownIssuingCountry line2) {
    this.line2 = line2;
  }


  public UsDrivingLicenceBreakdownAddressBreakdown stateCode(DocumentBreakdownDataComparisonBreakdownIssuingCountry stateCode) {
    this.stateCode = stateCode;
    return this;
  }

  /**
   * Get stateCode
   * @return stateCode
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getStateCode() {
    return stateCode;
  }

  public void setStateCode(DocumentBreakdownDataComparisonBreakdownIssuingCountry stateCode) {
    this.stateCode = stateCode;
  }


  public UsDrivingLicenceBreakdownAddressBreakdown zip4(DocumentBreakdownDataComparisonBreakdownIssuingCountry zip4) {
    this.zip4 = zip4;
    return this;
  }

  /**
   * Get zip4
   * @return zip4
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getZip4() {
    return zip4;
  }

  public void setZip4(DocumentBreakdownDataComparisonBreakdownIssuingCountry zip4) {
    this.zip4 = zip4;
  }


  public UsDrivingLicenceBreakdownAddressBreakdown zip5(DocumentBreakdownDataComparisonBreakdownIssuingCountry zip5) {
    this.zip5 = zip5;
    return this;
  }

  /**
   * Get zip5
   * @return zip5
   */
  @javax.annotation.Nullable
  public DocumentBreakdownDataComparisonBreakdownIssuingCountry getZip5() {
    return zip5;
  }

  public void setZip5(DocumentBreakdownDataComparisonBreakdownIssuingCountry zip5) {
    this.zip5 = zip5;
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
   * @return the UsDrivingLicenceBreakdownAddressBreakdown instance itself
   */
  public UsDrivingLicenceBreakdownAddressBreakdown putAdditionalProperty(String key, Object value) {
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
    UsDrivingLicenceBreakdownAddressBreakdown usDrivingLicenceBreakdownAddressBreakdown = (UsDrivingLicenceBreakdownAddressBreakdown) o;
    return Objects.equals(this.city, usDrivingLicenceBreakdownAddressBreakdown.city) &&
        Objects.equals(this.line1, usDrivingLicenceBreakdownAddressBreakdown.line1) &&
        Objects.equals(this.line2, usDrivingLicenceBreakdownAddressBreakdown.line2) &&
        Objects.equals(this.stateCode, usDrivingLicenceBreakdownAddressBreakdown.stateCode) &&
        Objects.equals(this.zip4, usDrivingLicenceBreakdownAddressBreakdown.zip4) &&
        Objects.equals(this.zip5, usDrivingLicenceBreakdownAddressBreakdown.zip5)&&
        Objects.equals(this.additionalProperties, usDrivingLicenceBreakdownAddressBreakdown.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, line1, line2, stateCode, zip4, zip5, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsDrivingLicenceBreakdownAddressBreakdown {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    zip4: ").append(toIndentedString(zip4)).append("\n");
    sb.append("    zip5: ").append(toIndentedString(zip5)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("line_1");
    openapiFields.add("line_2");
    openapiFields.add("state_code");
    openapiFields.add("zip4");
    openapiFields.add("zip5");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UsDrivingLicenceBreakdownAddressBreakdown
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UsDrivingLicenceBreakdownAddressBreakdown.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsDrivingLicenceBreakdownAddressBreakdown is not found in the empty JSON string", UsDrivingLicenceBreakdownAddressBreakdown.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `city`
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("city"));
      }
      // validate the optional field `line_1`
      if (jsonObj.get("line_1") != null && !jsonObj.get("line_1").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("line_1"));
      }
      // validate the optional field `line_2`
      if (jsonObj.get("line_2") != null && !jsonObj.get("line_2").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("line_2"));
      }
      // validate the optional field `state_code`
      if (jsonObj.get("state_code") != null && !jsonObj.get("state_code").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("state_code"));
      }
      // validate the optional field `zip4`
      if (jsonObj.get("zip4") != null && !jsonObj.get("zip4").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("zip4"));
      }
      // validate the optional field `zip5`
      if (jsonObj.get("zip5") != null && !jsonObj.get("zip5").isJsonNull()) {
        DocumentBreakdownDataComparisonBreakdownIssuingCountry.validateJsonElement(jsonObj.get("zip5"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsDrivingLicenceBreakdownAddressBreakdown.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsDrivingLicenceBreakdownAddressBreakdown' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsDrivingLicenceBreakdownAddressBreakdown> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsDrivingLicenceBreakdownAddressBreakdown.class));

       return (TypeAdapter<T>) new TypeAdapter<UsDrivingLicenceBreakdownAddressBreakdown>() {
           @Override
           public void write(JsonWriter out, UsDrivingLicenceBreakdownAddressBreakdown value) throws IOException {
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
           public UsDrivingLicenceBreakdownAddressBreakdown read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UsDrivingLicenceBreakdownAddressBreakdown instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of UsDrivingLicenceBreakdownAddressBreakdown given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UsDrivingLicenceBreakdownAddressBreakdown
   * @throws IOException if the JSON string is invalid with respect to UsDrivingLicenceBreakdownAddressBreakdown
   */
  public static UsDrivingLicenceBreakdownAddressBreakdown fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsDrivingLicenceBreakdownAddressBreakdown.class);
  }

  /**
   * Convert an instance of UsDrivingLicenceBreakdownAddressBreakdown to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

