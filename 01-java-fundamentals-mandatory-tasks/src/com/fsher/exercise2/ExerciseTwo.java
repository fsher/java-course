package com.fsher.exercise2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        System.out.print("What number should I find: ");
        int number = scanner.nextInt();

        int[] arr = generateArray(size);
        Arrays.sort(arr);
        System.out.println("Generated and sorted array: " + Arrays.toString(arr));

        long start, end;
        boolean result;

        start = System.nanoTime();
        result = ElementFinder.simple(number, arr);
        end = System.nanoTime();
        System.out.printf("Simple Search. %d: %s. It took: %d nano-seconds.\n", number, result, end - start);

        start = System.nanoTime();
        result = ElementFinder.binarySearch(number, arr);
        end = System.nanoTime();
        System.out.printf("Binary Search. %d: %s. It took: %d nano-seconds.\n", number, result, end - start);
    }

    public static int[] generateArray(int size) {
        int[] array = new int[size];
        int min = -size;

        for (int i = 0; i < size; i++) {
            array[i] = new Random().nextInt(size - min + 1) + min;
        }

        return array;
    }
}
