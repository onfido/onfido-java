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
import com.onfido.model.FacialSimilarityPhotoBreakdownFaceComparison;
import com.onfido.model.FacialSimilarityPhotoBreakdownImageIntegrity;
import com.onfido.model.FacialSimilarityPhotoBreakdownVisualAuthenticity;
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
 * FacialSimilarityPhotoBreakdown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class FacialSimilarityPhotoBreakdown {
  public static final String SERIALIZED_NAME_FACE_COMPARISON = "face_comparison";
  @SerializedName(SERIALIZED_NAME_FACE_COMPARISON)
  private FacialSimilarityPhotoBreakdownFaceComparison faceComparison;

  public static final String SERIALIZED_NAME_IMAGE_INTEGRITY = "image_integrity";
  @SerializedName(SERIALIZED_NAME_IMAGE_INTEGRITY)
  private FacialSimilarityPhotoBreakdownImageIntegrity imageIntegrity;

  public static final String SERIALIZED_NAME_VISUAL_AUTHENTICITY = "visual_authenticity";
  @SerializedName(SERIALIZED_NAME_VISUAL_AUTHENTICITY)
  private FacialSimilarityPhotoBreakdownVisualAuthenticity visualAuthenticity;

  public FacialSimilarityPhotoBreakdown() {
  }

  public FacialSimilarityPhotoBreakdown faceComparison(FacialSimilarityPhotoBreakdownFaceComparison faceComparison) {
    this.faceComparison = faceComparison;
    return this;
  }

   /**
   * Get faceComparison
   * @return faceComparison
  **/
  @javax.annotation.Nullable
  public FacialSimilarityPhotoBreakdownFaceComparison getFaceComparison() {
    return faceComparison;
  }

  public void setFaceComparison(FacialSimilarityPhotoBreakdownFaceComparison faceComparison) {
    this.faceComparison = faceComparison;
  }


  public FacialSimilarityPhotoBreakdown imageIntegrity(FacialSimilarityPhotoBreakdownImageIntegrity imageIntegrity) {
    this.imageIntegrity = imageIntegrity;
    return this;
  }

   /**
   * Get imageIntegrity
   * @return imageIntegrity
  **/
  @javax.annotation.Nullable
  public FacialSimilarityPhotoBreakdownImageIntegrity getImageIntegrity() {
    return imageIntegrity;
  }

  public void setImageIntegrity(FacialSimilarityPhotoBreakdownImageIntegrity imageIntegrity) {
    this.imageIntegrity = imageIntegrity;
  }


  public FacialSimilarityPhotoBreakdown visualAuthenticity(FacialSimilarityPhotoBreakdownVisualAuthenticity visualAuthenticity) {
    this.visualAuthenticity = visualAuthenticity;
    return this;
  }

   /**
   * Get visualAuthenticity
   * @return visualAuthenticity
  **/
  @javax.annotation.Nullable
  public FacialSimilarityPhotoBreakdownVisualAuthenticity getVisualAuthenticity() {
    return visualAuthenticity;
  }

  public void setVisualAuthenticity(FacialSimilarityPhotoBreakdownVisualAuthenticity visualAuthenticity) {
    this.visualAuthenticity = visualAuthenticity;
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
   * @return the FacialSimilarityPhotoBreakdown instance itself
   */
  public FacialSimilarityPhotoBreakdown putAdditionalProperty(String key, Object value) {
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
    FacialSimilarityPhotoBreakdown facialSimilarityPhotoBreakdown = (FacialSimilarityPhotoBreakdown) o;
    return Objects.equals(this.faceComparison, facialSimilarityPhotoBreakdown.faceComparison) &&
        Objects.equals(this.imageIntegrity, facialSimilarityPhotoBreakdown.imageIntegrity) &&
        Objects.equals(this.visualAuthenticity, facialSimilarityPhotoBreakdown.visualAuthenticity)&&
        Objects.equals(this.additionalProperties, facialSimilarityPhotoBreakdown.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faceComparison, imageIntegrity, visualAuthenticity, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacialSimilarityPhotoBreakdown {\n");
    sb.append("    faceComparison: ").append(toIndentedString(faceComparison)).append("\n");
    sb.append("    imageIntegrity: ").append(toIndentedString(imageIntegrity)).append("\n");
    sb.append("    visualAuthenticity: ").append(toIndentedString(visualAuthenticity)).append("\n");
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
    openapiFields.add("face_comparison");
    openapiFields.add("image_integrity");
    openapiFields.add("visual_authenticity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FacialSimilarityPhotoBreakdown
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FacialSimilarityPhotoBreakdown.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FacialSimilarityPhotoBreakdown is not found in the empty JSON string", FacialSimilarityPhotoBreakdown.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `face_comparison`
      if (jsonObj.get("face_comparison") != null && !jsonObj.get("face_comparison").isJsonNull()) {
        FacialSimilarityPhotoBreakdownFaceComparison.validateJsonElement(jsonObj.get("face_comparison"));
      }
      // validate the optional field `image_integrity`
      if (jsonObj.get("image_integrity") != null && !jsonObj.get("image_integrity").isJsonNull()) {
        FacialSimilarityPhotoBreakdownImageIntegrity.validateJsonElement(jsonObj.get("image_integrity"));
      }
      // validate the optional field `visual_authenticity`
      if (jsonObj.get("visual_authenticity") != null && !jsonObj.get("visual_authenticity").isJsonNull()) {
        FacialSimilarityPhotoBreakdownVisualAuthenticity.validateJsonElement(jsonObj.get("visual_authenticity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FacialSimilarityPhotoBreakdown.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FacialSimilarityPhotoBreakdown' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FacialSimilarityPhotoBreakdown> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FacialSimilarityPhotoBreakdown.class));

       return (TypeAdapter<T>) new TypeAdapter<FacialSimilarityPhotoBreakdown>() {
           @Override
           public void write(JsonWriter out, FacialSimilarityPhotoBreakdown value) throws IOException {
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
           public FacialSimilarityPhotoBreakdown read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             FacialSimilarityPhotoBreakdown instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FacialSimilarityPhotoBreakdown given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FacialSimilarityPhotoBreakdown
  * @throws IOException if the JSON string is invalid with respect to FacialSimilarityPhotoBreakdown
  */
  public static FacialSimilarityPhotoBreakdown fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FacialSimilarityPhotoBreakdown.class);
  }

 /**
  * Convert an instance of FacialSimilarityPhotoBreakdown to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

