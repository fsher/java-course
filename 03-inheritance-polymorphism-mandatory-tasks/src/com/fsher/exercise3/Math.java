package com.fsher.exercise3;

public class Math {
    public static int min(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    public static double min(double[] array) {
        if (array.length == 0) {
            return 0;
        }

        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    public static int max(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    public static double max(double[] array) {
        if (array.length == 0) {
            return 0;
        }

        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    public static int nextAfter(int[] array, int number) {
        if (array.length == 0) {
            return 0;
        }

        for (int i = 0; i < array.length; i++) {
            if (number < array[i]) {
                return array[i];
            }
        }

        return 0;
    }

    public static double nextAfter(double[] array, double number) {
        if (array.length == 0) {
            return 0;
        }

        for (int i = 0; i < array.length; i++) {
            if (number < array[i]) {
                return array[i];
            }
        }

        return 0;
    }

    public static int pow(int number, int power) {
        switch (power) {
            case 0:
                return 1;
            case 1:
                return number;
            default:
                return number * pow(number, power - 1);
        }
    }

    public static double pow(double number, int power) {
        switch (power) {
            case 0:
                return 1;
            case 1:
                return number;
            default:
                return number * pow(number, power - 1);
        }
    }
}
