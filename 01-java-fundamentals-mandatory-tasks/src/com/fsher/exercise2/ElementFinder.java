package com.fsher.exercise2;

class ElementFinder {
    static boolean simple(int number, int[] arr) {
        for (int value : arr) {
            if (number == value) {
                return true;
            }
        }

        return false;
    }

    static boolean binarySearch(int number, int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] < number) {
                low++;
                continue;
            }

            if (arr[mid] > number) {
                high--;
                continue;
            }

            return true;
        }

        return false;
    }
}
