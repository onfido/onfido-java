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
import com.onfido.model.IdentityEnhancedBreakdownDateOfBirthBreakdownCreditAgencies;
import com.onfido.model.IdentityEnhancedBreakdownDateOfBirthBreakdownVotingRegister;
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
 * IdentityEnhancedBreakdownDateOfBirthBreakdown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class IdentityEnhancedBreakdownDateOfBirthBreakdown {
  public static final String SERIALIZED_NAME_CREDIT_AGENCIES = "credit_agencies";
  @SerializedName(SERIALIZED_NAME_CREDIT_AGENCIES)
  private IdentityEnhancedBreakdownDateOfBirthBreakdownCreditAgencies creditAgencies;

  public static final String SERIALIZED_NAME_VOTING_REGISTER = "voting_register";
  @SerializedName(SERIALIZED_NAME_VOTING_REGISTER)
  private IdentityEnhancedBreakdownDateOfBirthBreakdownVotingRegister votingRegister;

  public IdentityEnhancedBreakdownDateOfBirthBreakdown() {
  }

  public IdentityEnhancedBreakdownDateOfBirthBreakdown creditAgencies(IdentityEnhancedBreakdownDateOfBirthBreakdownCreditAgencies creditAgencies) {
    this.creditAgencies = creditAgencies;
    return this;
  }

   /**
   * Get creditAgencies
   * @return creditAgencies
  **/
  @javax.annotation.Nullable
  public IdentityEnhancedBreakdownDateOfBirthBreakdownCreditAgencies getCreditAgencies() {
    return creditAgencies;
  }

  public void setCreditAgencies(IdentityEnhancedBreakdownDateOfBirthBreakdownCreditAgencies creditAgencies) {
    this.creditAgencies = creditAgencies;
  }


  public IdentityEnhancedBreakdownDateOfBirthBreakdown votingRegister(IdentityEnhancedBreakdownDateOfBirthBreakdownVotingRegister votingRegister) {
    this.votingRegister = votingRegister;
    return this;
  }

   /**
   * Get votingRegister
   * @return votingRegister
  **/
  @javax.annotation.Nullable
  public IdentityEnhancedBreakdownDateOfBirthBreakdownVotingRegister getVotingRegister() {
    return votingRegister;
  }

  public void setVotingRegister(IdentityEnhancedBreakdownDateOfBirthBreakdownVotingRegister votingRegister) {
    this.votingRegister = votingRegister;
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
   * @return the IdentityEnhancedBreakdownDateOfBirthBreakdown instance itself
   */
  public IdentityEnhancedBreakdownDateOfBirthBreakdown putAdditionalProperty(String key, Object value) {
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
    IdentityEnhancedBreakdownDateOfBirthBreakdown identityEnhancedBreakdownDateOfBirthBreakdown = (IdentityEnhancedBreakdownDateOfBirthBreakdown) o;
    return Objects.equals(this.creditAgencies, identityEnhancedBreakdownDateOfBirthBreakdown.creditAgencies) &&
        Objects.equals(this.votingRegister, identityEnhancedBreakdownDateOfBirthBreakdown.votingRegister)&&
        Objects.equals(this.additionalProperties, identityEnhancedBreakdownDateOfBirthBreakdown.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditAgencies, votingRegister, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityEnhancedBreakdownDateOfBirthBreakdown {\n");
    sb.append("    creditAgencies: ").append(toIndentedString(creditAgencies)).append("\n");
    sb.append("    votingRegister: ").append(toIndentedString(votingRegister)).append("\n");
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
    openapiFields.add("credit_agencies");
    openapiFields.add("voting_register");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IdentityEnhancedBreakdownDateOfBirthBreakdown
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IdentityEnhancedBreakdownDateOfBirthBreakdown.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdentityEnhancedBreakdownDateOfBirthBreakdown is not found in the empty JSON string", IdentityEnhancedBreakdownDateOfBirthBreakdown.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `credit_agencies`
      if (jsonObj.get("credit_agencies") != null && !jsonObj.get("credit_agencies").isJsonNull()) {
        IdentityEnhancedBreakdownDateOfBirthBreakdownCreditAgencies.validateJsonElement(jsonObj.get("credit_agencies"));
      }
      // validate the optional field `voting_register`
      if (jsonObj.get("voting_register") != null && !jsonObj.get("voting_register").isJsonNull()) {
        IdentityEnhancedBreakdownDateOfBirthBreakdownVotingRegister.validateJsonElement(jsonObj.get("voting_register"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdentityEnhancedBreakdownDateOfBirthBreakdown.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdentityEnhancedBreakdownDateOfBirthBreakdown' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdentityEnhancedBreakdownDateOfBirthBreakdown> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdentityEnhancedBreakdownDateOfBirthBreakdown.class));

       return (TypeAdapter<T>) new TypeAdapter<IdentityEnhancedBreakdownDateOfBirthBreakdown>() {
           @Override
           public void write(JsonWriter out, IdentityEnhancedBreakdownDateOfBirthBreakdown value) throws IOException {
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
           public IdentityEnhancedBreakdownDateOfBirthBreakdown read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             IdentityEnhancedBreakdownDateOfBirthBreakdown instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IdentityEnhancedBreakdownDateOfBirthBreakdown given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdentityEnhancedBreakdownDateOfBirthBreakdown
  * @throws IOException if the JSON string is invalid with respect to IdentityEnhancedBreakdownDateOfBirthBreakdown
  */
  public static IdentityEnhancedBreakdownDateOfBirthBreakdown fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdentityEnhancedBreakdownDateOfBirthBreakdown.class);
  }

 /**
  * Convert an instance of IdentityEnhancedBreakdownDateOfBirthBreakdown to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

