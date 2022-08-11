package com.gv4.core.models.exceptions;

public class IllegalFieldException extends IllegalStateException{

    public IllegalFieldException() {
    }

    public IllegalFieldException(String s) {
        super(s);
    }

    public IllegalFieldException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalFieldException(Throwable cause) {
        super(cause);
    }
}
