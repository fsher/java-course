package com.fsher.exercise5;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of disks: ");
        int n = scanner.nextInt();

        if (n < 1) {
            throw new Error("Number of disks can't be less than 1");
        }

        System.out.printf("Number of moves for %d disks: %d\n\n", n, HanoiTowers.hanoi(n,'A', 'C', 'B'));
        System.out.printf("Number of moves for %d disks: %d\n\n", n, HanoiTowers.hanoi(n,'A', 'C', 'B'));

        System.out.printf("Number of moves for %d disks: %d\n\n", n + 1, HanoiTowers.hanoi(n + 1,'A', 'C', 'B'));
        System.out.printf("Number of moves for %d disks: %d\n\n", n + 2, HanoiTowers.hanoi(n + 2, 'A', 'C', 'B'));
    }
}
