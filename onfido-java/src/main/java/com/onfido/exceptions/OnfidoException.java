package com.onfido.exceptions;

public class OnfidoException extends Exception {
  private static final long serialVersionUID = 1L;

  public OnfidoException(String message, Throwable cause) {
    super(message, cause);
  }

  public static OnfidoException networkError(Throwable cause) {
    return new OnfidoException("Network or timeout error", cause);
  }
}
