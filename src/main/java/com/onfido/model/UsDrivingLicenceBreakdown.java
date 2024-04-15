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
import com.onfido.model.UsDrivingLicenceBreakdownAddress;
import com.onfido.model.UsDrivingLicenceBreakdownDocument;
import com.onfido.model.UsDrivingLicenceBreakdownPersonal;
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
 * UsDrivingLicenceBreakdown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class UsDrivingLicenceBreakdown {
  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private UsDrivingLicenceBreakdownDocument document;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private UsDrivingLicenceBreakdownAddress address;

  public static final String SERIALIZED_NAME_PERSONAL = "personal";
  @SerializedName(SERIALIZED_NAME_PERSONAL)
  private UsDrivingLicenceBreakdownPersonal personal;

  public UsDrivingLicenceBreakdown() {
  }

  public UsDrivingLicenceBreakdown document(UsDrivingLicenceBreakdownDocument document) {
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @javax.annotation.Nullable
  public UsDrivingLicenceBreakdownDocument getDocument() {
    return document;
  }

  public void setDocument(UsDrivingLicenceBreakdownDocument document) {
    this.document = document;
  }


  public UsDrivingLicenceBreakdown address(UsDrivingLicenceBreakdownAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  public UsDrivingLicenceBreakdownAddress getAddress() {
    return address;
  }

  public void setAddress(UsDrivingLicenceBreakdownAddress address) {
    this.address = address;
  }


  public UsDrivingLicenceBreakdown personal(UsDrivingLicenceBreakdownPersonal personal) {
    this.personal = personal;
    return this;
  }

   /**
   * Get personal
   * @return personal
  **/
  @javax.annotation.Nullable
  public UsDrivingLicenceBreakdownPersonal getPersonal() {
    return personal;
  }

  public void setPersonal(UsDrivingLicenceBreakdownPersonal personal) {
    this.personal = personal;
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
   * @return the UsDrivingLicenceBreakdown instance itself
   */
  public UsDrivingLicenceBreakdown putAdditionalProperty(String key, Object value) {
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
    UsDrivingLicenceBreakdown usDrivingLicenceBreakdown = (UsDrivingLicenceBreakdown) o;
    return Objects.equals(this.document, usDrivingLicenceBreakdown.document) &&
        Objects.equals(this.address, usDrivingLicenceBreakdown.address) &&
        Objects.equals(this.personal, usDrivingLicenceBreakdown.personal)&&
        Objects.equals(this.additionalProperties, usDrivingLicenceBreakdown.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, address, personal, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsDrivingLicenceBreakdown {\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    personal: ").append(toIndentedString(personal)).append("\n");
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
    openapiFields.add("document");
    openapiFields.add("address");
    openapiFields.add("personal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UsDrivingLicenceBreakdown
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UsDrivingLicenceBreakdown.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsDrivingLicenceBreakdown is not found in the empty JSON string", UsDrivingLicenceBreakdown.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `document`
      if (jsonObj.get("document") != null && !jsonObj.get("document").isJsonNull()) {
        UsDrivingLicenceBreakdownDocument.validateJsonElement(jsonObj.get("document"));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        UsDrivingLicenceBreakdownAddress.validateJsonElement(jsonObj.get("address"));
      }
      // validate the optional field `personal`
      if (jsonObj.get("personal") != null && !jsonObj.get("personal").isJsonNull()) {
        UsDrivingLicenceBreakdownPersonal.validateJsonElement(jsonObj.get("personal"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsDrivingLicenceBreakdown.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsDrivingLicenceBreakdown' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsDrivingLicenceBreakdown> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsDrivingLicenceBreakdown.class));

       return (TypeAdapter<T>) new TypeAdapter<UsDrivingLicenceBreakdown>() {
           @Override
           public void write(JsonWriter out, UsDrivingLicenceBreakdown value) throws IOException {
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
           public UsDrivingLicenceBreakdown read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UsDrivingLicenceBreakdown instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UsDrivingLicenceBreakdown given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsDrivingLicenceBreakdown
  * @throws IOException if the JSON string is invalid with respect to UsDrivingLicenceBreakdown
  */
  public static UsDrivingLicenceBreakdown fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsDrivingLicenceBreakdown.class);
  }

 /**
  * Convert an instance of UsDrivingLicenceBreakdown to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

