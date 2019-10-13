package com.fsher.exercise3;

import com.fsher.exercise2.ExerciseTwo;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] arr = ExerciseTwo.generateArray(size);

        int[] bubbleArr = Arrays.copyOf(arr, arr.length);
        int[] bubbleOptArr = Arrays.copyOf(arr, arr.length);
        int[] insertionArr = Arrays.copyOf(arr, arr.length);
        int[] selectionArr = Arrays.copyOf(arr, arr.length);

        System.out.println("Bubble. Unsorted: " + Arrays.toString(bubbleArr));
        Sorter.bubble(bubbleArr);
        System.out.println("Bubble. Sorted: " + Arrays.toString(bubbleArr));

        System.out.println("Bubble Optimized. Unsorted: " + Arrays.toString(bubbleOptArr));
        Sorter.bubbleOptimized(bubbleOptArr);
        System.out.println("Bubble Optimized. Sorted: " + Arrays.toString(bubbleOptArr));

        System.out.println("Insertion. Unsorted: " + Arrays.toString(insertionArr));
        Sorter.insertion(insertionArr);
        System.out.println("Insertion. Sorted: " + Arrays.toString(insertionArr));

        System.out.println("Selection. Unsorted: " + Arrays.toString(selectionArr));
        Sorter.selection(selectionArr);
        System.out.println("Selection. Sorted: " + Arrays.toString(selectionArr));
    }
}
