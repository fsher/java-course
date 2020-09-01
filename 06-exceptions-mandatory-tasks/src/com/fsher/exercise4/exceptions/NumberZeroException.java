package com.fsher.exercise4.exceptions;

public class NumberZeroException extends RuntimeException {
    public NumberZeroException() {
        super("Number should not be equal to zero");
    }
}
