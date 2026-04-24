package com.zrakesh.webapp.shared.exception;

/**
 * Base exception class for all application exceptions.
 * Enables consistent error handling and standardized error responses.
 */
public class ApplicationException extends RuntimeException {
    private final String errorCode;
    private final String message;

    public ApplicationException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
        this.message = message;
    }

    public ApplicationException(String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return message;
    }
}