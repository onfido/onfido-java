package com.onfido.models;

import com.squareup.moshi.FromJson;
import java.util.List;
import java.util.stream.Collectors;

public class ModelJsonAdapter {
  @FromJson
  Model modelFromJson(ModelJson modelJson) {
    List<Property> properties =
        modelJson.properties.entrySet().stream()
            .map(entry -> new Property(entry.getKey(), entry.getValue()))
            .collect(Collectors.toList());

    return new Model(modelJson, properties);
  }
}
