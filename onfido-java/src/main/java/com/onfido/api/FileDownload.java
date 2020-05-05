package com.onfido.api;

/**
 * A wrapper class for any file downloaded from the API. Stores an content as an InputStream and
 * file type as a String.
 */
public class FileDownload {
  /** The content of the downloaded file. */
  public final byte[] content;
  /** The file type of the associated content. */
  public final String contentType;

  /**
   * Instantiates a new File download object.
   *
   * @param content the content of the file
   * @param contentType the file type of the associated content
   */
  public FileDownload(byte[] content, String contentType) {
    this.content = content;
    this.contentType = contentType;
  }
}
