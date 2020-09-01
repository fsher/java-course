package com.fsher.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        try {
            Exercise2.throwingMethod();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I was here");
        }
    }

    public static void throwingMethod() throws Exception {
        throw new Exception("Hello there");
    }
}
