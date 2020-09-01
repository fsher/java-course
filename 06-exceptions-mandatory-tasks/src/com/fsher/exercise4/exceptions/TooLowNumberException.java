package com.fsher.exercise4.exceptions;

public class TooLowNumberException extends Exception {
    public TooLowNumberException(int min) {
        super(String.format("Number too small, should be more than: %d", min));
    }
}
