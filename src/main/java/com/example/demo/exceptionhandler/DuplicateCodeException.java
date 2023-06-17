package com.example.demo.exceptionhandler;

public class DuplicateCodeException extends RuntimeException {
    public DuplicateCodeException(String message, Throwable cause) {
        super(message, cause);
    }
}
