package com.border.exceptions;

/**
 * Created by Anastasia on 19.03.2017.
 */
public class TroopsRepositoryException extends Exception {
    public TroopsRepositoryException(String message) {
        super(message);
    }

    public TroopsRepositoryException(String message, Throwable cause) {
        super(message, cause);
    }
}
