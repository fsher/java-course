package com.fsher.exercise3;

public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return String.format("This is an override: %s", super.getMessage());
    }
}
