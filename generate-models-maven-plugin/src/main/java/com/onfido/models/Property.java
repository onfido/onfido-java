package com.onfido.models;

import com.onfido.Utils;

public final class Property {
  public final String originalName;
  public final String camelCaseName;
  public final String titleCaseName;

  public final String description;

  public final String type;
  public final String boxedType;
  public final String requestType;
  public final String notSetValue;
  public final String nonListRequestType;

  public final boolean isSentInRequests;
  public final boolean isSentInResponses;

  protected Property(String originalName, PropertyJson json) {
    this.originalName = originalName;
    titleCaseName = Utils.toTitleCase(originalName);
    camelCaseName = Utils.toCamelCase(originalName);

    description = json.description;

    TypeInfo typeInfo = typeInfoFor(json);
    type = typeInfo.type;
    boxedType = typeInfo.boxedType;
    requestType = typeInfo.requestType;
    notSetValue = typeInfo.notSetValue;
    nonListRequestType = typeInfo.nonListRequestType;

    isSentInRequests = !json.readOnly;
    isSentInResponses = !json.writeOnly;
  }

  private static final class TypeInfo {
    public final String type;
    public final String boxedType;
    public final String requestType;
    public final String notSetValue;
    public final String nonListRequestType;

    private TypeInfo(
        String type,
        String boxedType,
        String requestType,
        String notSetValue,
        String nonListRequestType) {
      this.type = type;
      this.boxedType = boxedType;
      this.requestType = requestType;
      this.notSetValue = notSetValue;
      this.nonListRequestType = nonListRequestType;
    }

    public static TypeInfo objectType(String type) {
      return new TypeInfo(type, type, type, "null", null);
    }

    public static TypeInfo customType(String type) {
      return new TypeInfo(type, type, type + ".Request", "null", null);
    }

    public static TypeInfo primitiveType(String type, String boxedType, String notSetValue) {
      return new TypeInfo(type, boxedType, boxedType, notSetValue, null);
    }

    public static TypeInfo listOf(TypeInfo typeInfo) {
      String listType = "List<" + typeInfo.type + ">";
      String listRequestType = typeInfo.requestType + "[]";
      return new TypeInfo(listType, listType, listRequestType, "null", typeInfo.requestType);
    }
  }

  private static TypeInfo typeInfoFor(PropertyJson propertyJson) {
    if (propertyJson.type.length() == 0) {
      String javaType = Utils.toTitleCase(Utils.fileName(propertyJson.ref));
      return TypeInfo.customType(javaType);
    }

    switch (propertyJson.type) {
      case "boolean":
        return TypeInfo.primitiveType("boolean", "Boolean", "false");
      case "integer":
        return TypeInfo.primitiveType("int", "Integer", "0");
      case "object":
        return TypeInfo.objectType("Map<String, Object>");
      case "array":
        return TypeInfo.listOf(typeInfoFor(propertyJson.items));
      case "string":
        switch (propertyJson.format) {
          case "date":
            return TypeInfo.objectType("LocalDate");
          case "date-time":
            return TypeInfo.objectType("OffsetDateTime");
          case "binary":
            return TypeInfo.objectType("FileParam");
          default:
            return TypeInfo.objectType("String");
        }
    }

    throw new RuntimeException("Unknown type " + propertyJson.type);
  }
}
