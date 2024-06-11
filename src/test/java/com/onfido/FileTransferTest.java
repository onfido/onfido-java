package com.onfido;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileTransferTest {

  private static File VALID_FILE = new File("media/sample_photo.png");

  private static byte[] byteArray;

  @BeforeEach
  void init() throws IOException {
    byteArray = Files.readAllBytes(VALID_FILE.toPath());
  }

  @Test
  public void createFromByteArray() throws ApiException {
    FileTransfer fileTransfer = new FileTransfer(byteArray, "test-file.jpg");

    Assertions.assertEquals(byteArray, fileTransfer.getByteArray());
    Assertions.assertEquals("image/jpeg", fileTransfer.getContentType());
    Assertions.assertEquals("test-file.jpg", fileTransfer.getFilename());
  }

  @Test
  public void createFromFile() throws ApiException {
    FileTransfer fileTransfer = new FileTransfer(VALID_FILE);

    Assertions.assertSame(VALID_FILE, fileTransfer.getInputFile());
    Assertions.assertEquals("image/png", fileTransfer.getContentType());
    Assertions.assertEquals("sample_photo.png", fileTransfer.getFilename());
  }

  @Test
  public void createFromInputStream() throws ApiException, FileNotFoundException {
    FileTransfer fileTransfer = new FileTransfer(new FileInputStream(VALID_FILE), "test-file.pdf");

    Assertions.assertArrayEquals(byteArray, fileTransfer.getByteArray());
    Assertions.assertEquals("application/pdf", fileTransfer.getContentType());
    Assertions.assertEquals("test-file.pdf", fileTransfer.getFilename());
  }
}
