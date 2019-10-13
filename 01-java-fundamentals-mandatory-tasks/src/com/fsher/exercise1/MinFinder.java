package com.fsher.exercise1;

class MinFinder {
    public static int find(int a, int b) {
        return Math.min(a, b);
    }

    public static int find(int a, int b, int c) {
        return Math.min(find(a, b), c);
    }

    public static int find(int a, int b, int c, int d) {
        return Math.min(find(a, b, c), d);
    }
}
