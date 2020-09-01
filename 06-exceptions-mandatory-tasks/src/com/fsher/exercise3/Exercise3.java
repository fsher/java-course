package com.fsher.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        try {
            Exercise3.throwingMethod();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void throwingMethod() throws CustomException {
        throw new CustomException("Testing 123");
    }
}
