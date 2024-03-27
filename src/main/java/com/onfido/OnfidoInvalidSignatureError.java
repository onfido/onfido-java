package com.onfido;

public class OnfidoInvalidSignatureError extends Exception {
  public OnfidoInvalidSignatureError(String message, Throwable cause) {
    super(message, cause);
  }

  public OnfidoInvalidSignatureError(String message) {
    super(message);
  }

  public OnfidoInvalidSignatureError(Throwable throwable) {
    super(throwable);
  }
}
