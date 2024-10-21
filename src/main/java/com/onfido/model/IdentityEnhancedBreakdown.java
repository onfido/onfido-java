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
import com.onfido.model.IdentityEnhancedBreakdownAddress;
import com.onfido.model.IdentityEnhancedBreakdownDateOfBirth;
import com.onfido.model.IdentityEnhancedBreakdownMortality;
import com.onfido.model.IdentityEnhancedBreakdownSources;
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
 * IdentityEnhancedBreakdown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class IdentityEnhancedBreakdown {
  public static final String SERIALIZED_NAME_SOURCES = "sources";
  @SerializedName(SERIALIZED_NAME_SOURCES)
  private IdentityEnhancedBreakdownSources sources;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private IdentityEnhancedBreakdownAddress address;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private IdentityEnhancedBreakdownDateOfBirth dateOfBirth;

  public static final String SERIALIZED_NAME_MORTALITY = "mortality";
  @SerializedName(SERIALIZED_NAME_MORTALITY)
  private IdentityEnhancedBreakdownMortality mortality;

  public IdentityEnhancedBreakdown() {
  }

  public IdentityEnhancedBreakdown sources(IdentityEnhancedBreakdownSources sources) {
    this.sources = sources;
    return this;
  }

   /**
   * Get sources
   * @return sources
  **/
  @javax.annotation.Nullable
  public IdentityEnhancedBreakdownSources getSources() {
    return sources;
  }

  public void setSources(IdentityEnhancedBreakdownSources sources) {
    this.sources = sources;
  }


  public IdentityEnhancedBreakdown address(IdentityEnhancedBreakdownAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  public IdentityEnhancedBreakdownAddress getAddress() {
    return address;
  }

  public void setAddress(IdentityEnhancedBreakdownAddress address) {
    this.address = address;
  }


  public IdentityEnhancedBreakdown dateOfBirth(IdentityEnhancedBreakdownDateOfBirth dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  public IdentityEnhancedBreakdownDateOfBirth getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(IdentityEnhancedBreakdownDateOfBirth dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public IdentityEnhancedBreakdown mortality(IdentityEnhancedBreakdownMortality mortality) {
    this.mortality = mortality;
    return this;
  }

   /**
   * Get mortality
   * @return mortality
  **/
  @javax.annotation.Nullable
  public IdentityEnhancedBreakdownMortality getMortality() {
    return mortality;
  }

  public void setMortality(IdentityEnhancedBreakdownMortality mortality) {
    this.mortality = mortality;
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
   * @return the IdentityEnhancedBreakdown instance itself
   */
  public IdentityEnhancedBreakdown putAdditionalProperty(String key, Object value) {
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
    IdentityEnhancedBreakdown identityEnhancedBreakdown = (IdentityEnhancedBreakdown) o;
    return Objects.equals(this.sources, identityEnhancedBreakdown.sources) &&
        Objects.equals(this.address, identityEnhancedBreakdown.address) &&
        Objects.equals(this.dateOfBirth, identityEnhancedBreakdown.dateOfBirth) &&
        Objects.equals(this.mortality, identityEnhancedBreakdown.mortality)&&
        Objects.equals(this.additionalProperties, identityEnhancedBreakdown.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sources, address, dateOfBirth, mortality, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityEnhancedBreakdown {\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    mortality: ").append(toIndentedString(mortality)).append("\n");
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
    openapiFields.add("sources");
    openapiFields.add("address");
    openapiFields.add("date_of_birth");
    openapiFields.add("mortality");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IdentityEnhancedBreakdown
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IdentityEnhancedBreakdown.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdentityEnhancedBreakdown is not found in the empty JSON string", IdentityEnhancedBreakdown.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `sources`
      if (jsonObj.get("sources") != null && !jsonObj.get("sources").isJsonNull()) {
        IdentityEnhancedBreakdownSources.validateJsonElement(jsonObj.get("sources"));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        IdentityEnhancedBreakdownAddress.validateJsonElement(jsonObj.get("address"));
      }
      // validate the optional field `date_of_birth`
      if (jsonObj.get("date_of_birth") != null && !jsonObj.get("date_of_birth").isJsonNull()) {
        IdentityEnhancedBreakdownDateOfBirth.validateJsonElement(jsonObj.get("date_of_birth"));
      }
      // validate the optional field `mortality`
      if (jsonObj.get("mortality") != null && !jsonObj.get("mortality").isJsonNull()) {
        IdentityEnhancedBreakdownMortality.validateJsonElement(jsonObj.get("mortality"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdentityEnhancedBreakdown.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdentityEnhancedBreakdown' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdentityEnhancedBreakdown> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdentityEnhancedBreakdown.class));

       return (TypeAdapter<T>) new TypeAdapter<IdentityEnhancedBreakdown>() {
           @Override
           public void write(JsonWriter out, IdentityEnhancedBreakdown value) throws IOException {
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
           public IdentityEnhancedBreakdown read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             IdentityEnhancedBreakdown instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IdentityEnhancedBreakdown given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdentityEnhancedBreakdown
  * @throws IOException if the JSON string is invalid with respect to IdentityEnhancedBreakdown
  */
  public static IdentityEnhancedBreakdown fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdentityEnhancedBreakdown.class);
  }

 /**
  * Convert an instance of IdentityEnhancedBreakdown to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

