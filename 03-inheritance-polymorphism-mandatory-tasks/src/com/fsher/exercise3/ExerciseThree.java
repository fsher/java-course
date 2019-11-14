package com.fsher.exercise3;

public class ExerciseThree {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 3, 2, 3, 4, 5};
        double[] array2 = {2.3, 5.2, 5.1, 4.21, 10.2, 5.3, 3.33, 20.05, 20.06};

        System.out.println(Math.max(array1));
        System.out.println(Math.max(array2));

        System.out.println(Math.min(array1));
        System.out.println(Math.min(array2));

        System.out.println(Math.nextAfter(array1, 2));
        System.out.println(Math.nextAfter(array2, 14.5));

        System.out.println(Math.pow(2, 4));
        System.out.println(Math.pow(4.3, 2));
    }
}
