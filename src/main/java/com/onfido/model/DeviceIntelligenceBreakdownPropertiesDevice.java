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
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * DeviceIntelligenceBreakdownPropertiesDevice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class DeviceIntelligenceBreakdownPropertiesDevice {
  public static final String SERIALIZED_NAME_SDK_VERSION = "sdk_version";
  @SerializedName(SERIALIZED_NAME_SDK_VERSION)
  private String sdkVersion;

  /**
   * The SDK used to upload the media.
   */
  @JsonAdapter(SdkSourceEnum.Adapter.class)
  public enum SdkSourceEnum {
    ANDROID_SDK("onfido-android-sdk"),
    
    IOS_SDK("onfido-ios-sdk"),
    
    WEB_SDK("onfido-web-sdk"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    SdkSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SdkSourceEnum fromValue(String value) {
      for (SdkSourceEnum b : SdkSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<SdkSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SdkSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SdkSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SdkSourceEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SdkSourceEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SDK_SOURCE = "sdk_source";
  @SerializedName(SERIALIZED_NAME_SDK_SOURCE)
  private SdkSourceEnum sdkSource;

  /**
   * The token used to authenticate the request.
   */
  @JsonAdapter(AuthenticationTypeEnum.Adapter.class)
  public enum AuthenticationTypeEnum {
    SDK_TOKEN("sdk_token"),
    
    MOBILE_TOKEN("mobile_token"),
    
    API_TOKEN("api_token"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    AuthenticationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthenticationTypeEnum fromValue(String value) {
      for (AuthenticationTypeEnum b : AuthenticationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<AuthenticationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthenticationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthenticationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthenticationTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AuthenticationTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_AUTHENTICATION_TYPE = "authentication_type";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_TYPE)
  private AuthenticationTypeEnum authenticationType;

  public static final String SERIALIZED_NAME_RAW_MODEL = "raw_model";
  @SerializedName(SERIALIZED_NAME_RAW_MODEL)
  private String rawModel;

  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private String os;

  public static final String SERIALIZED_NAME_BROWSER = "browser";
  @SerializedName(SERIALIZED_NAME_BROWSER)
  private String browser;

  public static final String SERIALIZED_NAME_EMULATOR = "emulator";
  @SerializedName(SERIALIZED_NAME_EMULATOR)
  private Boolean emulator;

  public static final String SERIALIZED_NAME_RANDOMIZED_DEVICE = "randomized_device";
  @SerializedName(SERIALIZED_NAME_RANDOMIZED_DEVICE)
  private Boolean randomizedDevice;

  public static final String SERIALIZED_NAME_FAKE_NETWORK_REQUEST = "fake_network_request";
  @SerializedName(SERIALIZED_NAME_FAKE_NETWORK_REQUEST)
  private Boolean fakeNetworkRequest;

  public static final String SERIALIZED_NAME_TRUE_OS = "true_os";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_TRUE_OS)
  private String trueOs;

  public static final String SERIALIZED_NAME_OS_ANOMALY = "os_anomaly";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_OS_ANOMALY)
  private String osAnomaly;

  public static final String SERIALIZED_NAME_ROOTED = "rooted";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_ROOTED)
  private Boolean rooted;

  public static final String SERIALIZED_NAME_REMOTE_SOFTWARE = "remote_software";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_REMOTE_SOFTWARE)
  private Boolean remoteSoftware;

  /**
   * Whether there is highly suspicious traffic related to the IP address. The risk depends on the overall ratio of clear checks on a given IP.
   */
  @JsonAdapter(IpReputationEnum.Adapter.class)
  public enum IpReputationEnum {
    NOT_ENOUGH_DATA("NOT_ENOUGH_DATA"),
    
    HIGH_RISK("HIGH_RISK"),
    
    LOW_RISK("LOW_RISK"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    IpReputationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IpReputationEnum fromValue(String value) {
      for (IpReputationEnum b : IpReputationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<IpReputationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IpReputationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IpReputationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IpReputationEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      IpReputationEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_IP_REPUTATION = "ip_reputation";
  @SerializedName(SERIALIZED_NAME_IP_REPUTATION)
  private IpReputationEnum ipReputation;

  public static final String SERIALIZED_NAME_DEVICE_FINGERPRINT_REUSE = "device_fingerprint_reuse";
  @SerializedName(SERIALIZED_NAME_DEVICE_FINGERPRINT_REUSE)
  private Integer deviceFingerprintReuse;

  public static final String SERIALIZED_NAME_SINGLE_DEVICE_USED = "single_device_used";
  @SerializedName(SERIALIZED_NAME_SINGLE_DEVICE_USED)
  private Boolean singleDeviceUsed;

  /**
   * Whether the document media were live captured from the device camera.
   */
  @JsonAdapter(DocumentCaptureEnum.Adapter.class)
  public enum DocumentCaptureEnum {
    LIVE("live"),
    
    UNKNOWN_METHOD("unknown_method"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    DocumentCaptureEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocumentCaptureEnum fromValue(String value) {
      for (DocumentCaptureEnum b : DocumentCaptureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<DocumentCaptureEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocumentCaptureEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocumentCaptureEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DocumentCaptureEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DocumentCaptureEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DOCUMENT_CAPTURE = "document_capture";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_CAPTURE)
  private DocumentCaptureEnum documentCapture;

  /**
   * Whether the biometric media were live captured from the device camera.
   */
  @JsonAdapter(BiometricCaptureEnum.Adapter.class)
  public enum BiometricCaptureEnum {
    LIVE("live"),
    
    UNKNOWN_METHOD("unknown_method"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    BiometricCaptureEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BiometricCaptureEnum fromValue(String value) {
      for (BiometricCaptureEnum b : BiometricCaptureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<BiometricCaptureEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BiometricCaptureEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BiometricCaptureEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BiometricCaptureEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      BiometricCaptureEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_BIOMETRIC_CAPTURE = "biometric_capture";
  @SerializedName(SERIALIZED_NAME_BIOMETRIC_CAPTURE)
  private BiometricCaptureEnum biometricCapture;

  public DeviceIntelligenceBreakdownPropertiesDevice() {
  }

  public DeviceIntelligenceBreakdownPropertiesDevice sdkVersion(String sdkVersion) {
    this.sdkVersion = sdkVersion;
    return this;
  }

   /**
   * The SDK version that was used.
   * @return sdkVersion
  **/
  @javax.annotation.Nullable
  public String getSdkVersion() {
    return sdkVersion;
  }

  public void setSdkVersion(String sdkVersion) {
    this.sdkVersion = sdkVersion;
  }


  public DeviceIntelligenceBreakdownPropertiesDevice sdkSource(SdkSourceEnum sdkSource) {
    this.sdkSource = sdkSource;
    return this;
  }

   /**
   * The SDK used to upload the media.
   * @return sdkSource
  **/
  @javax.annotation.Nullable
  public SdkSourceEnum getSdkSource() {
    return sdkSource;
  }

  public void setSdkSource(SdkSourceEnum sdkSource) {
    this.sdkSource = sdkSource;
  }


  public DeviceIntelligenceBreakdownPropertiesDevice authenticationType(AuthenticationTypeEnum authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

   /**
   * The token used to authenticate the request.
   * @return authenticationType
  **/
  @javax.annotation.Nullable
  public AuthenticationTypeEnum getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(AuthenticationTypeEnum authenticationType) {
    this.authenticationType = authenticationType;
  }


  public DeviceIntelligenceBreakdownPropertiesDevice rawModel(String rawModel) {
    this.rawModel = rawModel;
    return this;
  }

   /**
   * The model as set by the phone manufacturer (for Android and iOS) or the browser manufacturer (for Web). The model can be presented in name or number form depending on each manufacturer implementation.
   * @return rawModel
  **/
  @javax.annotation.Nullable
  public String getRawModel() {
    return rawModel;
  }

  public void setRawModel(String rawModel) {
    this.rawModel = rawModel;
  }


  public DeviceIntelligenceBreakdownPropertiesDevice os(String os) {
    this.os = os;
    return this;
  }

   /**
   * The operating system of the device. The value came from manufacturer implementation (for Android and iOS) or browser&#39;s user agent (for Web).
   * @return os
  **/
  @javax.annotation.Nullable
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }


  public DeviceIntelligenceBreakdownPropertiesDevice browser(String browser) {
    this.browser = browser;
    return this;
  }

   /**
   * The browser name reported by the browser&#39;s user agent.
   * @return browser
  **/
  @javax.annotation.Nullable
  public String getBrowser() {
    return browser;
  }

  public void setBrowser(String browser) {
    this.browser = browser;
  }


  public DeviceIntelligenceBreakdownPropertiesDevice emulator(Boolean emulator) {
    this.emulator = emulator;
    return this;
  }

   /**
   * Whether the device is an emulator.
   * @return emulator
  **/
  @javax.annotation.Nullable
  public Boolean getEmulator() {
    return emulator;
  }

  public void setEmulator(Boolean emulator) {
    this.emulator = emulator;
  }


  public DeviceIntelligenceBreakdownPropertiesDevice randomizedDevice(Boolean randomizedDevice) {
    this.randomizedDevice = randomizedDevice;
    return this;
  }

   /**
   * Whether the device is providing false randomized device and network information.
   * @return randomizedDevice
  **/
  @javax.annotation.Nullable
  public Boolean getRandomizedDevice() {
    return randomizedDevice;
  }

  public void setRandomizedDevice(Boolean randomizedDevice) {
    this.randomizedDevice = randomizedDevice;
  }


  public DeviceIntelligenceBreakdownPropertiesDevice fakeNetworkRequest(Boolean fakeNetworkRequest) {
    this.fakeNetworkRequest = fakeNetworkRequest;
    return this;
  }

   /**
   * Whether device is using stolen security tokens to send the network information.
   * @return fakeNetworkRequest
  **/
  @javax.annotation.Nullable
  public Boolean getFakeNetworkRequest() {
    return fakeNetworkRequest;
  }

  public void setFakeNetworkRequest(Boolean fakeNetworkRequest) {
    this.fakeNetworkRequest = fakeNetworkRequest;
  }


  @Deprecated
  public DeviceIntelligenceBreakdownPropertiesDevice trueOs(String trueOs) {
    this.trueOs = trueOs;
    return this;
  }

   /**
   * The true operating system of the device.
   * @return trueOs
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public String getTrueOs() {
    return trueOs;
  }

  @Deprecated
  public void setTrueOs(String trueOs) {
    this.trueOs = trueOs;
  }


  @Deprecated
  public DeviceIntelligenceBreakdownPropertiesDevice osAnomaly(String osAnomaly) {
    this.osAnomaly = osAnomaly;
    return this;
  }

   /**
   * The likelihood of an operating system anomaly between the true OS and the OS sent by the device.
   * @return osAnomaly
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public String getOsAnomaly() {
    return osAnomaly;
  }

  @Deprecated
  public void setOsAnomaly(String osAnomaly) {
    this.osAnomaly = osAnomaly;
  }


  @Deprecated
  public DeviceIntelligenceBreakdownPropertiesDevice rooted(Boolean rooted) {
    this.rooted = rooted;
    return this;
  }

   /**
   * Whether the device is rooted.
   * @return rooted
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public Boolean getRooted() {
    return rooted;
  }

  @Deprecated
  public void setRooted(Boolean rooted) {
    this.rooted = rooted;
  }


  @Deprecated
  public DeviceIntelligenceBreakdownPropertiesDevice remoteSoftware(Boolean remoteSoftware) {
    this.remoteSoftware = remoteSoftware;
    return this;
  }

   /**
   * Whether the device is controlled via remote software.
   * @return remoteSoftware
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public Boolean getRemoteSoftware() {
    return remoteSoftware;
  }

  @Deprecated
  public void setRemoteSoftware(Boolean remoteSoftware) {
    this.remoteSoftware = remoteSoftware;
  }


  public DeviceIntelligenceBreakdownPropertiesDevice ipReputation(IpReputationEnum ipReputation) {
    this.ipReputation = ipReputation;
    return this;
  }

   /**
   * Whether there is highly suspicious traffic related to the IP address. The risk depends on the overall ratio of clear checks on a given IP.
   * @return ipReputation
  **/
  @javax.annotation.Nullable
  public IpReputationEnum getIpReputation() {
    return ipReputation;
  }

  public void setIpReputation(IpReputationEnum ipReputation) {
    this.ipReputation = ipReputation;
  }


  public DeviceIntelligenceBreakdownPropertiesDevice deviceFingerprintReuse(Integer deviceFingerprintReuse) {
    this.deviceFingerprintReuse = deviceFingerprintReuse;
    return this;
  }

   /**
   * The number of times the device was used to create a report for a new applicant. A value greater than 1 indicates potential device reuse.
   * @return deviceFingerprintReuse
  **/
  @javax.annotation.Nullable
  public Integer getDeviceFingerprintReuse() {
    return deviceFingerprintReuse;
  }

  public void setDeviceFingerprintReuse(Integer deviceFingerprintReuse) {
    this.deviceFingerprintReuse = deviceFingerprintReuse;
  }


  public DeviceIntelligenceBreakdownPropertiesDevice singleDeviceUsed(Boolean singleDeviceUsed) {
    this.singleDeviceUsed = singleDeviceUsed;
    return this;
  }

   /**
   * Whether the document or biometric media were uploaded from a single device.
   * @return singleDeviceUsed
  **/
  @javax.annotation.Nullable
  public Boolean getSingleDeviceUsed() {
    return singleDeviceUsed;
  }

  public void setSingleDeviceUsed(Boolean singleDeviceUsed) {
    this.singleDeviceUsed = singleDeviceUsed;
  }


  public DeviceIntelligenceBreakdownPropertiesDevice documentCapture(DocumentCaptureEnum documentCapture) {
    this.documentCapture = documentCapture;
    return this;
  }

   /**
   * Whether the document media were live captured from the device camera.
   * @return documentCapture
  **/
  @javax.annotation.Nullable
  public DocumentCaptureEnum getDocumentCapture() {
    return documentCapture;
  }

  public void setDocumentCapture(DocumentCaptureEnum documentCapture) {
    this.documentCapture = documentCapture;
  }


  public DeviceIntelligenceBreakdownPropertiesDevice biometricCapture(BiometricCaptureEnum biometricCapture) {
    this.biometricCapture = biometricCapture;
    return this;
  }

   /**
   * Whether the biometric media were live captured from the device camera.
   * @return biometricCapture
  **/
  @javax.annotation.Nullable
  public BiometricCaptureEnum getBiometricCapture() {
    return biometricCapture;
  }

  public void setBiometricCapture(BiometricCaptureEnum biometricCapture) {
    this.biometricCapture = biometricCapture;
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
   * @return the DeviceIntelligenceBreakdownPropertiesDevice instance itself
   */
  public DeviceIntelligenceBreakdownPropertiesDevice putAdditionalProperty(String key, Object value) {
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
    DeviceIntelligenceBreakdownPropertiesDevice deviceIntelligenceBreakdownPropertiesDevice = (DeviceIntelligenceBreakdownPropertiesDevice) o;
    return Objects.equals(this.sdkVersion, deviceIntelligenceBreakdownPropertiesDevice.sdkVersion) &&
        Objects.equals(this.sdkSource, deviceIntelligenceBreakdownPropertiesDevice.sdkSource) &&
        Objects.equals(this.authenticationType, deviceIntelligenceBreakdownPropertiesDevice.authenticationType) &&
        Objects.equals(this.rawModel, deviceIntelligenceBreakdownPropertiesDevice.rawModel) &&
        Objects.equals(this.os, deviceIntelligenceBreakdownPropertiesDevice.os) &&
        Objects.equals(this.browser, deviceIntelligenceBreakdownPropertiesDevice.browser) &&
        Objects.equals(this.emulator, deviceIntelligenceBreakdownPropertiesDevice.emulator) &&
        Objects.equals(this.randomizedDevice, deviceIntelligenceBreakdownPropertiesDevice.randomizedDevice) &&
        Objects.equals(this.fakeNetworkRequest, deviceIntelligenceBreakdownPropertiesDevice.fakeNetworkRequest) &&
        Objects.equals(this.trueOs, deviceIntelligenceBreakdownPropertiesDevice.trueOs) &&
        Objects.equals(this.osAnomaly, deviceIntelligenceBreakdownPropertiesDevice.osAnomaly) &&
        Objects.equals(this.rooted, deviceIntelligenceBreakdownPropertiesDevice.rooted) &&
        Objects.equals(this.remoteSoftware, deviceIntelligenceBreakdownPropertiesDevice.remoteSoftware) &&
        Objects.equals(this.ipReputation, deviceIntelligenceBreakdownPropertiesDevice.ipReputation) &&
        Objects.equals(this.deviceFingerprintReuse, deviceIntelligenceBreakdownPropertiesDevice.deviceFingerprintReuse) &&
        Objects.equals(this.singleDeviceUsed, deviceIntelligenceBreakdownPropertiesDevice.singleDeviceUsed) &&
        Objects.equals(this.documentCapture, deviceIntelligenceBreakdownPropertiesDevice.documentCapture) &&
        Objects.equals(this.biometricCapture, deviceIntelligenceBreakdownPropertiesDevice.biometricCapture)&&
        Objects.equals(this.additionalProperties, deviceIntelligenceBreakdownPropertiesDevice.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sdkVersion, sdkSource, authenticationType, rawModel, os, browser, emulator, randomizedDevice, fakeNetworkRequest, trueOs, osAnomaly, rooted, remoteSoftware, ipReputation, deviceFingerprintReuse, singleDeviceUsed, documentCapture, biometricCapture, additionalProperties);
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
    sb.append("class DeviceIntelligenceBreakdownPropertiesDevice {\n");
    sb.append("    sdkVersion: ").append(toIndentedString(sdkVersion)).append("\n");
    sb.append("    sdkSource: ").append(toIndentedString(sdkSource)).append("\n");
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    rawModel: ").append(toIndentedString(rawModel)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    emulator: ").append(toIndentedString(emulator)).append("\n");
    sb.append("    randomizedDevice: ").append(toIndentedString(randomizedDevice)).append("\n");
    sb.append("    fakeNetworkRequest: ").append(toIndentedString(fakeNetworkRequest)).append("\n");
    sb.append("    trueOs: ").append(toIndentedString(trueOs)).append("\n");
    sb.append("    osAnomaly: ").append(toIndentedString(osAnomaly)).append("\n");
    sb.append("    rooted: ").append(toIndentedString(rooted)).append("\n");
    sb.append("    remoteSoftware: ").append(toIndentedString(remoteSoftware)).append("\n");
    sb.append("    ipReputation: ").append(toIndentedString(ipReputation)).append("\n");
    sb.append("    deviceFingerprintReuse: ").append(toIndentedString(deviceFingerprintReuse)).append("\n");
    sb.append("    singleDeviceUsed: ").append(toIndentedString(singleDeviceUsed)).append("\n");
    sb.append("    documentCapture: ").append(toIndentedString(documentCapture)).append("\n");
    sb.append("    biometricCapture: ").append(toIndentedString(biometricCapture)).append("\n");
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
    openapiFields.add("sdk_version");
    openapiFields.add("sdk_source");
    openapiFields.add("authentication_type");
    openapiFields.add("raw_model");
    openapiFields.add("os");
    openapiFields.add("browser");
    openapiFields.add("emulator");
    openapiFields.add("randomized_device");
    openapiFields.add("fake_network_request");
    openapiFields.add("true_os");
    openapiFields.add("os_anomaly");
    openapiFields.add("rooted");
    openapiFields.add("remote_software");
    openapiFields.add("ip_reputation");
    openapiFields.add("device_fingerprint_reuse");
    openapiFields.add("single_device_used");
    openapiFields.add("document_capture");
    openapiFields.add("biometric_capture");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DeviceIntelligenceBreakdownPropertiesDevice
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeviceIntelligenceBreakdownPropertiesDevice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeviceIntelligenceBreakdownPropertiesDevice is not found in the empty JSON string", DeviceIntelligenceBreakdownPropertiesDevice.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("sdk_version") != null && !jsonObj.get("sdk_version").isJsonNull()) && !jsonObj.get("sdk_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sdk_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sdk_version").toString()));
      }
      if ((jsonObj.get("sdk_source") != null && !jsonObj.get("sdk_source").isJsonNull()) && !jsonObj.get("sdk_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sdk_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sdk_source").toString()));
      }
      // validate the optional field `sdk_source`
      if (jsonObj.get("sdk_source") != null && !jsonObj.get("sdk_source").isJsonNull()) {
        SdkSourceEnum.validateJsonElement(jsonObj.get("sdk_source"));
      }
      if ((jsonObj.get("authentication_type") != null && !jsonObj.get("authentication_type").isJsonNull()) && !jsonObj.get("authentication_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authentication_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authentication_type").toString()));
      }
      // validate the optional field `authentication_type`
      if (jsonObj.get("authentication_type") != null && !jsonObj.get("authentication_type").isJsonNull()) {
        AuthenticationTypeEnum.validateJsonElement(jsonObj.get("authentication_type"));
      }
      if ((jsonObj.get("raw_model") != null && !jsonObj.get("raw_model").isJsonNull()) && !jsonObj.get("raw_model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `raw_model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("raw_model").toString()));
      }
      if ((jsonObj.get("os") != null && !jsonObj.get("os").isJsonNull()) && !jsonObj.get("os").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os").toString()));
      }
      if ((jsonObj.get("browser") != null && !jsonObj.get("browser").isJsonNull()) && !jsonObj.get("browser").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `browser` to be a primitive type in the JSON string but got `%s`", jsonObj.get("browser").toString()));
      }
      if ((jsonObj.get("true_os") != null && !jsonObj.get("true_os").isJsonNull()) && !jsonObj.get("true_os").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `true_os` to be a primitive type in the JSON string but got `%s`", jsonObj.get("true_os").toString()));
      }
      if ((jsonObj.get("os_anomaly") != null && !jsonObj.get("os_anomaly").isJsonNull()) && !jsonObj.get("os_anomaly").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os_anomaly` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os_anomaly").toString()));
      }
      if ((jsonObj.get("ip_reputation") != null && !jsonObj.get("ip_reputation").isJsonNull()) && !jsonObj.get("ip_reputation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip_reputation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip_reputation").toString()));
      }
      // validate the optional field `ip_reputation`
      if (jsonObj.get("ip_reputation") != null && !jsonObj.get("ip_reputation").isJsonNull()) {
        IpReputationEnum.validateJsonElement(jsonObj.get("ip_reputation"));
      }
      if ((jsonObj.get("document_capture") != null && !jsonObj.get("document_capture").isJsonNull()) && !jsonObj.get("document_capture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_capture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_capture").toString()));
      }
      // validate the optional field `document_capture`
      if (jsonObj.get("document_capture") != null && !jsonObj.get("document_capture").isJsonNull()) {
        DocumentCaptureEnum.validateJsonElement(jsonObj.get("document_capture"));
      }
      if ((jsonObj.get("biometric_capture") != null && !jsonObj.get("biometric_capture").isJsonNull()) && !jsonObj.get("biometric_capture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biometric_capture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biometric_capture").toString()));
      }
      // validate the optional field `biometric_capture`
      if (jsonObj.get("biometric_capture") != null && !jsonObj.get("biometric_capture").isJsonNull()) {
        BiometricCaptureEnum.validateJsonElement(jsonObj.get("biometric_capture"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeviceIntelligenceBreakdownPropertiesDevice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeviceIntelligenceBreakdownPropertiesDevice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeviceIntelligenceBreakdownPropertiesDevice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeviceIntelligenceBreakdownPropertiesDevice.class));

       return (TypeAdapter<T>) new TypeAdapter<DeviceIntelligenceBreakdownPropertiesDevice>() {
           @Override
           public void write(JsonWriter out, DeviceIntelligenceBreakdownPropertiesDevice value) throws IOException {
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
           public DeviceIntelligenceBreakdownPropertiesDevice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DeviceIntelligenceBreakdownPropertiesDevice instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DeviceIntelligenceBreakdownPropertiesDevice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeviceIntelligenceBreakdownPropertiesDevice
  * @throws IOException if the JSON string is invalid with respect to DeviceIntelligenceBreakdownPropertiesDevice
  */
  public static DeviceIntelligenceBreakdownPropertiesDevice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeviceIntelligenceBreakdownPropertiesDevice.class);
  }

 /**
  * Convert an instance of DeviceIntelligenceBreakdownPropertiesDevice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

