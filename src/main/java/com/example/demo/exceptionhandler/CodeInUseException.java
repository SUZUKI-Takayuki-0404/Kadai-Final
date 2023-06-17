package com.example.demo.exceptionhandler;

public class CodeInUseException extends RuntimeException {
    public CodeInUseException(String message) {
        super(message);
    }
}
