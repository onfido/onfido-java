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
import com.onfido.model.WatchlistAmlBreakdownAdverseMedia;
import com.onfido.model.WatchlistAmlBreakdownLegalAndRegulatoryWarnings;
import com.onfido.model.WatchlistAmlBreakdownPoliticallyExposedPerson;
import com.onfido.model.WatchlistAmlBreakdownSanction;
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
 * WatchlistAmlBreakdown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class WatchlistAmlBreakdown {
  public static final String SERIALIZED_NAME_SANCTION = "sanction";
  @SerializedName(SERIALIZED_NAME_SANCTION)
  private WatchlistAmlBreakdownSanction sanction;

  public static final String SERIALIZED_NAME_POLITICALLY_EXPOSED_PERSON = "politically_exposed_person";
  @SerializedName(SERIALIZED_NAME_POLITICALLY_EXPOSED_PERSON)
  private WatchlistAmlBreakdownPoliticallyExposedPerson politicallyExposedPerson;

  public static final String SERIALIZED_NAME_LEGAL_AND_REGULATORY_WARNINGS = "legal_and_regulatory_warnings";
  @SerializedName(SERIALIZED_NAME_LEGAL_AND_REGULATORY_WARNINGS)
  private WatchlistAmlBreakdownLegalAndRegulatoryWarnings legalAndRegulatoryWarnings;

  public static final String SERIALIZED_NAME_ADVERSE_MEDIA = "adverse_media";
  @SerializedName(SERIALIZED_NAME_ADVERSE_MEDIA)
  private WatchlistAmlBreakdownAdverseMedia adverseMedia;

  public WatchlistAmlBreakdown() {
  }

  public WatchlistAmlBreakdown sanction(WatchlistAmlBreakdownSanction sanction) {
    this.sanction = sanction;
    return this;
  }

   /**
   * Get sanction
   * @return sanction
  **/
  @javax.annotation.Nullable
  public WatchlistAmlBreakdownSanction getSanction() {
    return sanction;
  }

  public void setSanction(WatchlistAmlBreakdownSanction sanction) {
    this.sanction = sanction;
  }


  public WatchlistAmlBreakdown politicallyExposedPerson(WatchlistAmlBreakdownPoliticallyExposedPerson politicallyExposedPerson) {
    this.politicallyExposedPerson = politicallyExposedPerson;
    return this;
  }

   /**
   * Get politicallyExposedPerson
   * @return politicallyExposedPerson
  **/
  @javax.annotation.Nullable
  public WatchlistAmlBreakdownPoliticallyExposedPerson getPoliticallyExposedPerson() {
    return politicallyExposedPerson;
  }

  public void setPoliticallyExposedPerson(WatchlistAmlBreakdownPoliticallyExposedPerson politicallyExposedPerson) {
    this.politicallyExposedPerson = politicallyExposedPerson;
  }


  public WatchlistAmlBreakdown legalAndRegulatoryWarnings(WatchlistAmlBreakdownLegalAndRegulatoryWarnings legalAndRegulatoryWarnings) {
    this.legalAndRegulatoryWarnings = legalAndRegulatoryWarnings;
    return this;
  }

   /**
   * Get legalAndRegulatoryWarnings
   * @return legalAndRegulatoryWarnings
  **/
  @javax.annotation.Nullable
  public WatchlistAmlBreakdownLegalAndRegulatoryWarnings getLegalAndRegulatoryWarnings() {
    return legalAndRegulatoryWarnings;
  }

  public void setLegalAndRegulatoryWarnings(WatchlistAmlBreakdownLegalAndRegulatoryWarnings legalAndRegulatoryWarnings) {
    this.legalAndRegulatoryWarnings = legalAndRegulatoryWarnings;
  }


  public WatchlistAmlBreakdown adverseMedia(WatchlistAmlBreakdownAdverseMedia adverseMedia) {
    this.adverseMedia = adverseMedia;
    return this;
  }

   /**
   * Get adverseMedia
   * @return adverseMedia
  **/
  @javax.annotation.Nullable
  public WatchlistAmlBreakdownAdverseMedia getAdverseMedia() {
    return adverseMedia;
  }

  public void setAdverseMedia(WatchlistAmlBreakdownAdverseMedia adverseMedia) {
    this.adverseMedia = adverseMedia;
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
   * @return the WatchlistAmlBreakdown instance itself
   */
  public WatchlistAmlBreakdown putAdditionalProperty(String key, Object value) {
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
    WatchlistAmlBreakdown watchlistAmlBreakdown = (WatchlistAmlBreakdown) o;
    return Objects.equals(this.sanction, watchlistAmlBreakdown.sanction) &&
        Objects.equals(this.politicallyExposedPerson, watchlistAmlBreakdown.politicallyExposedPerson) &&
        Objects.equals(this.legalAndRegulatoryWarnings, watchlistAmlBreakdown.legalAndRegulatoryWarnings) &&
        Objects.equals(this.adverseMedia, watchlistAmlBreakdown.adverseMedia)&&
        Objects.equals(this.additionalProperties, watchlistAmlBreakdown.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sanction, politicallyExposedPerson, legalAndRegulatoryWarnings, adverseMedia, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchlistAmlBreakdown {\n");
    sb.append("    sanction: ").append(toIndentedString(sanction)).append("\n");
    sb.append("    politicallyExposedPerson: ").append(toIndentedString(politicallyExposedPerson)).append("\n");
    sb.append("    legalAndRegulatoryWarnings: ").append(toIndentedString(legalAndRegulatoryWarnings)).append("\n");
    sb.append("    adverseMedia: ").append(toIndentedString(adverseMedia)).append("\n");
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
    openapiFields.add("sanction");
    openapiFields.add("politically_exposed_person");
    openapiFields.add("legal_and_regulatory_warnings");
    openapiFields.add("adverse_media");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WatchlistAmlBreakdown
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WatchlistAmlBreakdown.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WatchlistAmlBreakdown is not found in the empty JSON string", WatchlistAmlBreakdown.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `sanction`
      if (jsonObj.get("sanction") != null && !jsonObj.get("sanction").isJsonNull()) {
        WatchlistAmlBreakdownSanction.validateJsonElement(jsonObj.get("sanction"));
      }
      // validate the optional field `politically_exposed_person`
      if (jsonObj.get("politically_exposed_person") != null && !jsonObj.get("politically_exposed_person").isJsonNull()) {
        WatchlistAmlBreakdownPoliticallyExposedPerson.validateJsonElement(jsonObj.get("politically_exposed_person"));
      }
      // validate the optional field `legal_and_regulatory_warnings`
      if (jsonObj.get("legal_and_regulatory_warnings") != null && !jsonObj.get("legal_and_regulatory_warnings").isJsonNull()) {
        WatchlistAmlBreakdownLegalAndRegulatoryWarnings.validateJsonElement(jsonObj.get("legal_and_regulatory_warnings"));
      }
      // validate the optional field `adverse_media`
      if (jsonObj.get("adverse_media") != null && !jsonObj.get("adverse_media").isJsonNull()) {
        WatchlistAmlBreakdownAdverseMedia.validateJsonElement(jsonObj.get("adverse_media"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WatchlistAmlBreakdown.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WatchlistAmlBreakdown' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WatchlistAmlBreakdown> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WatchlistAmlBreakdown.class));

       return (TypeAdapter<T>) new TypeAdapter<WatchlistAmlBreakdown>() {
           @Override
           public void write(JsonWriter out, WatchlistAmlBreakdown value) throws IOException {
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
           public WatchlistAmlBreakdown read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             WatchlistAmlBreakdown instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WatchlistAmlBreakdown given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WatchlistAmlBreakdown
  * @throws IOException if the JSON string is invalid with respect to WatchlistAmlBreakdown
  */
  public static WatchlistAmlBreakdown fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WatchlistAmlBreakdown.class);
  }

 /**
  * Convert an instance of WatchlistAmlBreakdown to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

