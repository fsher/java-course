package com.fsher.exercise4.exceptions;

public class TooLargeNumberException extends Exception {
    public TooLargeNumberException(int max) {
        super(String.format("Number too large, should be less than: %d", max));
    }
}
