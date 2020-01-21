package com.onfido.api;

import java.io.IOException;
import java.util.Map;

import com.onfido.Config;
import com.onfido.exceptions.ApiException;
import com.onfido.exceptions.OnfidoException;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;

public class ResourceManager {

  private final Config config;

  private static final OkHttpClient CLIENT = new OkHttpClient();
  private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

  public ResourceManager(Config config) {
    this.config = config;
  }

  public static void shutdown() {
    CLIENT.dispatcher().executorService().shutdown();
    CLIENT.connectionPool().evictAll();
  }

  public String post(String path, String body) throws OnfidoException {
    Request request = requestBuilder(path)
      .post(RequestBody.create(body, JSON))
      .build();

    return performRequest(request);
  }

  public String get(String path) throws OnfidoException {
    Request request = requestBuilder(path).build();

    return performRequest(request);
  }

  public String put(String path, String body) throws OnfidoException {
    Request request = requestBuilder(path)
            .put(RequestBody.create(body, JSON))
            .build();

    return performRequest(request);
  }

  public String delete(String path) throws OnfidoException {
    Request request = requestBuilder(path)
            .delete()
            .build();

    return performRequest(request);
  }

  public FileParam download(String path) throws OnfidoException {
    throw OnfidoException.networkError(null);
  }

  public String postUpload(String path, Map<String, Object> params) throws OnfidoException {
    MultipartBody.Builder builder = new MultipartBody.Builder().setType(MultipartBody.FORM);

    for (Map.Entry<String, Object> entry : params.entrySet()) {
      Object value = entry.getValue();
      if (value instanceof FileParam) {
        FileParam fileParam = (FileParam) value;
        builder.addFormDataPart(entry.getKey(), fileParam.getFileName(), createFileBody(fileParam));
      } else if (value != null) {
        builder.addFormDataPart(entry.getKey(), value.toString());
      }
    }

    Request request = requestBuilder(path)
      .post(builder.build())
      .build();

    return performRequest(request);
  }

  private static RequestBody createFileBody(FileParam fileParam) {
    return new RequestBody() {
      @Override
      public MediaType contentType() {
        return MediaType.parse(fileParam.getContentType());
      }

      @Override
      public void writeTo(BufferedSink sink) throws IOException {
        try (Source source = Okio.source(fileParam.getInputStream())) {
          sink.writeAll(source);
        }
      }
    };
  }

  private Request.Builder requestBuilder(String path) {

    return new Request.Builder()
      .url(config.getApiUrl() + path)
      .header("Authorization", "Token token=" + config.getApiToken())
      .header("User-Agent", "OnfidoJava")
      .header("Accept", "application/json");
  }

  private static String performRequest(Request request) throws OnfidoException {
    try (Response response = CLIENT.newCall(request).execute()) {
      if (response.isSuccessful()) {
        return response.body().string();
      } else {
        throw ApiException.fromResponseBody(response.body().string(), response.code());
      }
    } catch (IOException e) {
      throw OnfidoException.networkError(e);
    }
  }
}
