package com.onfido;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;

public class FileTransfer {

  private File inputFile = null;
  private byte[] byteArray = null;
  private String filename = null;
  private String contentType = null;

  /**
   * Create a new file transfer from a byte array
   *
   * @param byteArray Byte array to include in file transfer
   * @param filename Filename to send together with the transfer
   * @throws ApiException
   */
  public FileTransfer(byte[] byteArray, String filename) {
    this.byteArray = byteArray;

    updateMetadata(filename);
  }

  /**
   * Create a new file transfer from a File
   *
   * @param inputFile File to include in transfer
   * @throws ApiException
   */
  public FileTransfer(File inputFile) {
    this.inputFile = inputFile;

    updateMetadata(inputFile.getName());
  }

  /**
   * Create a new file transfer from an InputStream
   *
   * @param inputStream InputStream to read data from
   * @param filename Filename to send together with the transfer
   * @throws ApiException
   */
  public FileTransfer(InputStream inputStream, String filename) throws ApiException {
    try {
      this.byteArray = new byte[inputStream.available()];
      inputStream.read(byteArray);
    } catch (IOException e) {
      throw new ApiException(e);
    }

    updateMetadata(filename);
  }

  /**
   * Return the array of bytes used for this file transfer.
   *
   * @return array of bytes
   */
  public byte[] getByteArray() {
    return byteArray;
  }

  /**
   * Return the input stream used for this file transfer
   *
   * @return the provided input file
   */
  public File getInputFile() {
    return inputFile;
  }

  /**
   * @return the filename associated with this transfer
   */
  public String getFilename() {
    return filename;
  }

  /**
   * @return the content-type associated with this transfer
   */
  public String getContentType() {
    return contentType;
  }

  private void updateMetadata(String filename) {
    this.contentType = URLConnection.guessContentTypeFromName(filename);
    this.filename = filename;
  }
}
