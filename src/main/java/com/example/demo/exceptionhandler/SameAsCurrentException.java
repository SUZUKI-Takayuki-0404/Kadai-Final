package com.example.demo.exceptionhandler;

public class SameAsCurrentException extends RuntimeException {
    public SameAsCurrentException(String message) {
        super(message);
    }
}
