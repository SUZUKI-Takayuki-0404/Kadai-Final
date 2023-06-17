package com.example.demo.exceptionhandler;

public class NoResourceException extends RuntimeException {
    public NoResourceException(String message) {
        super(message);
    }
}
