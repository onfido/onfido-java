package com.onfido.api;

import com.onfido.exceptions.ApiException;
import com.onfido.exceptions.OnfidoException;
import okhttp3.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ResourceManager {

  private final Config config;
  private final String basePath;

  private static final OkHttpClient CLIENT = new OkHttpClient();
  private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

  public ResourceManager(String basePath, Config config) {
    this.basePath = basePath;
    this.config = config;
  }

  public static void shutdown() {
    CLIENT.dispatcher().executorService().shutdown();
    CLIENT.connectionPool().evictAll();
  }

  protected String post(String path, String body) throws OnfidoException {
    Request request = requestBuilder(path)
      .post(RequestBody.create(body, JSON))
      .build();

    return performRequest(request);
  }

  protected String get(String path) throws OnfidoException {
    Request request = requestBuilder(path).build();

    return performRequest(request);
  }

  protected String put(String path, String body) throws OnfidoException {
    Request request = requestBuilder(path)
            .put(RequestBody.create(body, JSON))
            .build();

    return performRequest(request);
  }

  protected String deleteRequest(String path) throws OnfidoException {
    Request request = requestBuilder(path)
            .delete()
            .build();

    return performRequest(request);
  }

  protected void upload(String path, RequestBody requestBody) throws OnfidoException {
    Request request = requestBuilder(path)
            .post(requestBody)
            .build();

    performRequest(request);
  }

  protected InputStream download(String path) throws IOException {
    Request request = requestBuilder(path)
            .get()
            .build();

    Response response = CLIENT.newCall(request).execute();
    return response.body().byteStream();
  }

  protected byte[] readInputStream(InputStream inputStream) throws IOException {
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    int nRead;
    byte[] data = new byte[1024];
    while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
      buffer.write(data, 0, nRead);
    }

    buffer.flush();
    return buffer.toByteArray();
  }

  private Request.Builder requestBuilder(String path) {

    return new Request.Builder()
      .url(config.getApiUrl() + basePath + path)
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
