package com.fsher.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        final int[] arr = {1, 2, 3};

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}
