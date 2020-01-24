package com.onfido.exceptions;

/**
 * The type Onfido exception.
 */
public class OnfidoException extends Exception {
  private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Onfido exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public OnfidoException(String message, Throwable cause) {
    super(message, cause);
  }

    /**
     * Instantiates a new Onfido exception.
     *
     * @param message the message
     */
    public OnfidoException(String message) {
    super(message);
  }

    /**
     * Network error onfido exception.
     *
     * @param cause the cause
     * @return the onfido exception
     */
    public static OnfidoException networkError(Throwable cause) {
    return new OnfidoException("Network or timeout error", cause);
  }
}
