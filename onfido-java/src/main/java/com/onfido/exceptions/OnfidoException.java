package com.onfido.exceptions;

/**
 * An exception thrown by this client library.
 */
public class OnfidoException extends Exception {
  private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new OnfidoException.
     *
     * @param message the message
     * @param cause   the cause
     */
    public OnfidoException(String message, Throwable cause) {
    super(message, cause);
  }

    /**
     * Instantiates a new OnfidoException.
     *
     * @param message the message
     */
    public OnfidoException(String message) {
    super(message);
  }

    /**
     * Throws a new OnfidoException with a network timeout message.
     *
     * @param cause the cause
     * @return the onfido exception
     */
    public static OnfidoException networkError(Throwable cause) {
    return new OnfidoException("Network or timeout error", cause);
  }
}
