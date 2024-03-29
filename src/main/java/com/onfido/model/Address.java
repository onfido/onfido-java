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

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.onfido.model.CountryCodes;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * Address
 */
@JsonPropertyOrder({
  Address.JSON_PROPERTY_FLAT_NUMBER,
  Address.JSON_PROPERTY_BUILDING_NUMBER,
  Address.JSON_PROPERTY_BUILDING_NAME,
  Address.JSON_PROPERTY_STREET,
  Address.JSON_PROPERTY_SUB_STREET,
  Address.JSON_PROPERTY_TOWN,
  Address.JSON_PROPERTY_POSTCODE,
  Address.JSON_PROPERTY_COUNTRY,
  Address.JSON_PROPERTY_STATE,
  Address.JSON_PROPERTY_LINE1,
  Address.JSON_PROPERTY_LINE2,
  Address.JSON_PROPERTY_LINE3
})
@JsonTypeName("address")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Address {
  public static final String JSON_PROPERTY_FLAT_NUMBER = "flat_number";
  private String flatNumber;

  public static final String JSON_PROPERTY_BUILDING_NUMBER = "building_number";
  private String buildingNumber;

  public static final String JSON_PROPERTY_BUILDING_NAME = "building_name";
  private String buildingName;

  public static final String JSON_PROPERTY_STREET = "street";
  private String street;

  public static final String JSON_PROPERTY_SUB_STREET = "sub_street";
  private String subStreet;

  public static final String JSON_PROPERTY_TOWN = "town";
  private String town;

  public static final String JSON_PROPERTY_POSTCODE = "postcode";
  private String postcode;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private CountryCodes country;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_LINE1 = "line1";
  private JsonNullable<String> line1 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LINE2 = "line2";
  private JsonNullable<String> line2 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LINE3 = "line3";
  private JsonNullable<String> line3 = JsonNullable.<String>undefined();

  public Address() { 
  }

  public Address flatNumber(String flatNumber) {
    this.flatNumber = flatNumber;
    return this;
  }

   /**
   * The flat number of this address
   * @return flatNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLAT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFlatNumber() {
    return flatNumber;
  }


  @JsonProperty(JSON_PROPERTY_FLAT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlatNumber(String flatNumber) {
    this.flatNumber = flatNumber;
  }


  public Address buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

   /**
   * The building number of this address
   * @return buildingNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILDING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuildingNumber() {
    return buildingNumber;
  }


  @JsonProperty(JSON_PROPERTY_BUILDING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }


  public Address buildingName(String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

   /**
   * The building name of this address
   * @return buildingName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILDING_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuildingName() {
    return buildingName;
  }


  @JsonProperty(JSON_PROPERTY_BUILDING_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }


  public Address street(String street) {
    this.street = street;
    return this;
  }

   /**
   * The street of the applicant&#39;s address
   * @return street
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreet() {
    return street;
  }


  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreet(String street) {
    this.street = street;
  }


  public Address subStreet(String subStreet) {
    this.subStreet = subStreet;
    return this;
  }

   /**
   * The sub-street of the applicant&#39;s address
   * @return subStreet
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubStreet() {
    return subStreet;
  }


  @JsonProperty(JSON_PROPERTY_SUB_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubStreet(String subStreet) {
    this.subStreet = subStreet;
  }


  public Address town(String town) {
    this.town = town;
    return this;
  }

   /**
   * The town of the applicant&#39;s address
   * @return town
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTown() {
    return town;
  }


  @JsonProperty(JSON_PROPERTY_TOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTown(String town) {
    this.town = town;
  }


  public Address postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * The postcode or ZIP of the applicant&#39;s address
   * @return postcode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_POSTCODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPostcode() {
    return postcode;
  }


  @JsonProperty(JSON_PROPERTY_POSTCODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public Address country(CountryCodes country) {
    this.country = country;
    return this;
  }

   /**
   * The 3 character ISO country code of this address. For example, GBR is the country code for the United Kingdom
   * @return country
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CountryCodes getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountry(CountryCodes country) {
    this.country = country;
  }


  public Address state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The address state. US states must use the USPS abbreviation (see also ISO 3166-2:US), for example AK, CA, or TX.
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public Address line1(String line1) {
    this.line1 = JsonNullable.<String>of(line1);
    return this;
  }

   /**
   * Line 1 of the applicant&#39;s address
   * @return line1
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLine1() {
        return line1.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLine1_JsonNullable() {
    return line1;
  }
  
  @JsonProperty(JSON_PROPERTY_LINE1)
  public void setLine1_JsonNullable(JsonNullable<String> line1) {
    this.line1 = line1;
  }

  public void setLine1(String line1) {
    this.line1 = JsonNullable.<String>of(line1);
  }


  public Address line2(String line2) {
    this.line2 = JsonNullable.<String>of(line2);
    return this;
  }

   /**
   * Line 2 of the applicant&#39;s address
   * @return line2
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLine2() {
        return line2.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLine2_JsonNullable() {
    return line2;
  }
  
  @JsonProperty(JSON_PROPERTY_LINE2)
  public void setLine2_JsonNullable(JsonNullable<String> line2) {
    this.line2 = line2;
  }

  public void setLine2(String line2) {
    this.line2 = JsonNullable.<String>of(line2);
  }


  public Address line3(String line3) {
    this.line3 = JsonNullable.<String>of(line3);
    return this;
  }

   /**
   * Line 3 of the applicant&#39;s address
   * @return line3
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLine3() {
        return line3.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLine3_JsonNullable() {
    return line3;
  }
  
  @JsonProperty(JSON_PROPERTY_LINE3)
  public void setLine3_JsonNullable(JsonNullable<String> line3) {
    this.line3 = line3;
  }

  public void setLine3(String line3) {
    this.line3 = JsonNullable.<String>of(line3);
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
   */
  @JsonAnySetter
  public Address putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this address object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.flatNumber, address.flatNumber) &&
        Objects.equals(this.buildingNumber, address.buildingNumber) &&
        Objects.equals(this.buildingName, address.buildingName) &&
        Objects.equals(this.street, address.street) &&
        Objects.equals(this.subStreet, address.subStreet) &&
        Objects.equals(this.town, address.town) &&
        Objects.equals(this.postcode, address.postcode) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.state, address.state) &&
        equalsNullable(this.line1, address.line1) &&
        equalsNullable(this.line2, address.line2) &&
        equalsNullable(this.line3, address.line3)&&
        Objects.equals(this.additionalProperties, address.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(flatNumber, buildingNumber, buildingName, street, subStreet, town, postcode, country, state, hashCodeNullable(line1), hashCodeNullable(line2), hashCodeNullable(line3), additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    flatNumber: ").append(toIndentedString(flatNumber)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    subStreet: ").append(toIndentedString(subStreet)).append("\n");
    sb.append("    town: ").append(toIndentedString(town)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
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

}
