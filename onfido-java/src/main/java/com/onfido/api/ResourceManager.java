package com.onfido.api;

import com.onfido.exceptions.ApiException;
import com.onfido.exceptions.OnfidoException;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/**
 * Manager class for all resource types. Contains methods for interacting with the API.
 */
public class ResourceManager {

  private final Config config;
  private final String basePath;

  private static final OkHttpClient CLIENT = new OkHttpClient();
  private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    /**
     * Instantiates a new ResourceManager object.
     *
     * @param basePath the base path for the resource endpoints
     * @param config   the configuration for the Onfido object
     */
    public ResourceManager(String basePath, Config config) {
    this.basePath = basePath;
    this.config = config;
  }

    /**
     * Shuts down the client
     */
    public static void shutdown() {
    CLIENT.dispatcher().executorService().shutdown();
    CLIENT.connectionPool().evictAll();
  }

    /**
     * Makes a POST http call to the specified path and request body.
     *
     * @param path the path to the desired endpoint
     * @param body the request body for the http call
     * @return the response as a json string
     * @throws OnfidoException the onfido exception
     */
    protected String post(String path, String body) throws OnfidoException {
    Request request = requestBuilder(path)
      .post(RequestBody.create(body, JSON))
      .build();

    return performRequest(request);
  }

    /**
     * Makes a GET http call to the specified path
     *
     * @param path the path to the desired endpoint
     * @return the response as a json string
     * @throws OnfidoException the onfido exception
     */
    protected String get(String path) throws OnfidoException {
    Request request = requestBuilder(path).build();

    return performRequest(request);
  }

    /**
     * Makes a PUT http call to the specified path and request body.
     *
     * @param path the path to the desired endpoint
     * @param body the request body for the http call
     * @return the response as a json string
     * @throws OnfidoException the onfido exception
     */
    protected String put(String path, String body) throws OnfidoException {
    Request request = requestBuilder(path)
            .put(RequestBody.create(body, JSON))
            .build();

    return performRequest(request);
  }

    /**
     * Makes a DELETE http call to the specified path
     *
     * @param path the path to the desired endpoint
     * @return the response as a json string
     * @throws OnfidoException the onfido exception
     */
    protected String deleteRequest(String path) throws OnfidoException {
    Request request = requestBuilder(path)
            .delete()
            .build();

    return performRequest(request);
  }

    /**
     * Makes a POST http call to the specified path and multipart request body.
     *
     * @param path the path to the desired endpoint
     * @param body the request body for the http call
     * @return the response as a json string
     * @throws OnfidoException the onfido exception
     */
    protected String uploadRequest(String path, RequestBody body) throws OnfidoException {
    Request request = requestBuilder(path)
            .post(body)
            .build();

    return performRequest(request);
  }

    /**
     * Makes a GET http call to the specified path
     *
     * @param path the path to the desired endpoint
     * @return the file content and type in the form of a FileDownload object
     * @throws OnfidoException the onfido exception
     */
    protected FileDownload downloadRequest(String path) throws OnfidoException {
    Request request = requestBuilder(path)
            .get()
            .build();

    return performDownload(request);
  }

    /**
     * Converts an InputStream to a byte[] to be sent as part of a multipart request body
     *
     * @param inputStream the InputStream
     * @return the byte[] made from the InputStream
     * @throws IOException the io exception
     */
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

  protected void addFormDataParam(MultipartBody.Builder builder, String key, Object value) {
    if (value != null) {
      builder.addFormDataPart(key, value.toString());
    }
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

  private static FileDownload performDownload(Request request) throws OnfidoException {
    try (Response response = CLIENT.newCall(request).execute()) {
      if (response.isSuccessful()) {
        return new FileDownload(response.body().byteStream(), response.header("content-type"));
      } else {
        throw ApiException.fromResponseBody(response.body().string(), response.code());
      }
    } catch (IOException e) {
      throw OnfidoException.networkError(e);
    }
  }
}
