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
import com.onfido.model.FacialSimilarityMotionBreakdownFaceComparison;
import com.onfido.model.FacialSimilarityMotionBreakdownImageIntegrity;
import com.onfido.model.FacialSimilarityMotionBreakdownVisualAuthenticity;
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
 * FacialSimilarityMotionBreakdown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class FacialSimilarityMotionBreakdown {
  public static final String SERIALIZED_NAME_FACE_COMPARISON = "face_comparison";
  @SerializedName(SERIALIZED_NAME_FACE_COMPARISON)
  @javax.annotation.Nullable
  private FacialSimilarityMotionBreakdownFaceComparison faceComparison;

  public static final String SERIALIZED_NAME_IMAGE_INTEGRITY = "image_integrity";
  @SerializedName(SERIALIZED_NAME_IMAGE_INTEGRITY)
  @javax.annotation.Nullable
  private FacialSimilarityMotionBreakdownImageIntegrity imageIntegrity;

  public static final String SERIALIZED_NAME_VISUAL_AUTHENTICITY = "visual_authenticity";
  @SerializedName(SERIALIZED_NAME_VISUAL_AUTHENTICITY)
  @javax.annotation.Nullable
  private FacialSimilarityMotionBreakdownVisualAuthenticity visualAuthenticity;

  public FacialSimilarityMotionBreakdown() {
  }

  public FacialSimilarityMotionBreakdown faceComparison(@javax.annotation.Nullable FacialSimilarityMotionBreakdownFaceComparison faceComparison) {
    this.faceComparison = faceComparison;
    return this;
  }

  /**
   * Get faceComparison
   * @return faceComparison
   */
  @javax.annotation.Nullable
  public FacialSimilarityMotionBreakdownFaceComparison getFaceComparison() {
    return faceComparison;
  }

  public void setFaceComparison(@javax.annotation.Nullable FacialSimilarityMotionBreakdownFaceComparison faceComparison) {
    this.faceComparison = faceComparison;
  }


  public FacialSimilarityMotionBreakdown imageIntegrity(@javax.annotation.Nullable FacialSimilarityMotionBreakdownImageIntegrity imageIntegrity) {
    this.imageIntegrity = imageIntegrity;
    return this;
  }

  /**
   * Get imageIntegrity
   * @return imageIntegrity
   */
  @javax.annotation.Nullable
  public FacialSimilarityMotionBreakdownImageIntegrity getImageIntegrity() {
    return imageIntegrity;
  }

  public void setImageIntegrity(@javax.annotation.Nullable FacialSimilarityMotionBreakdownImageIntegrity imageIntegrity) {
    this.imageIntegrity = imageIntegrity;
  }


  public FacialSimilarityMotionBreakdown visualAuthenticity(@javax.annotation.Nullable FacialSimilarityMotionBreakdownVisualAuthenticity visualAuthenticity) {
    this.visualAuthenticity = visualAuthenticity;
    return this;
  }

  /**
   * Get visualAuthenticity
   * @return visualAuthenticity
   */
  @javax.annotation.Nullable
  public FacialSimilarityMotionBreakdownVisualAuthenticity getVisualAuthenticity() {
    return visualAuthenticity;
  }

  public void setVisualAuthenticity(@javax.annotation.Nullable FacialSimilarityMotionBreakdownVisualAuthenticity visualAuthenticity) {
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
   * @return the FacialSimilarityMotionBreakdown instance itself
   */
  public FacialSimilarityMotionBreakdown putAdditionalProperty(String key, Object value) {
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
    FacialSimilarityMotionBreakdown facialSimilarityMotionBreakdown = (FacialSimilarityMotionBreakdown) o;
    return Objects.equals(this.faceComparison, facialSimilarityMotionBreakdown.faceComparison) &&
        Objects.equals(this.imageIntegrity, facialSimilarityMotionBreakdown.imageIntegrity) &&
        Objects.equals(this.visualAuthenticity, facialSimilarityMotionBreakdown.visualAuthenticity)&&
        Objects.equals(this.additionalProperties, facialSimilarityMotionBreakdown.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faceComparison, imageIntegrity, visualAuthenticity, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacialSimilarityMotionBreakdown {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to FacialSimilarityMotionBreakdown
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FacialSimilarityMotionBreakdown.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FacialSimilarityMotionBreakdown is not found in the empty JSON string", FacialSimilarityMotionBreakdown.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `face_comparison`
      if (jsonObj.get("face_comparison") != null && !jsonObj.get("face_comparison").isJsonNull()) {
        FacialSimilarityMotionBreakdownFaceComparison.validateJsonElement(jsonObj.get("face_comparison"));
      }
      // validate the optional field `image_integrity`
      if (jsonObj.get("image_integrity") != null && !jsonObj.get("image_integrity").isJsonNull()) {
        FacialSimilarityMotionBreakdownImageIntegrity.validateJsonElement(jsonObj.get("image_integrity"));
      }
      // validate the optional field `visual_authenticity`
      if (jsonObj.get("visual_authenticity") != null && !jsonObj.get("visual_authenticity").isJsonNull()) {
        FacialSimilarityMotionBreakdownVisualAuthenticity.validateJsonElement(jsonObj.get("visual_authenticity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FacialSimilarityMotionBreakdown.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FacialSimilarityMotionBreakdown' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FacialSimilarityMotionBreakdown> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FacialSimilarityMotionBreakdown.class));

       return (TypeAdapter<T>) new TypeAdapter<FacialSimilarityMotionBreakdown>() {
           @Override
           public void write(JsonWriter out, FacialSimilarityMotionBreakdown value) throws IOException {
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
           public FacialSimilarityMotionBreakdown read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             FacialSimilarityMotionBreakdown instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of FacialSimilarityMotionBreakdown given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FacialSimilarityMotionBreakdown
   * @throws IOException if the JSON string is invalid with respect to FacialSimilarityMotionBreakdown
   */
  public static FacialSimilarityMotionBreakdown fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FacialSimilarityMotionBreakdown.class);
  }

  /**
   * Convert an instance of FacialSimilarityMotionBreakdown to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

