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

        HanoiTowers ht1 = new HanoiTowers(n);
        HanoiTowers ht2 = new HanoiTowers(n + 1);
        HanoiTowers ht3 = new HanoiTowers(n + 2);

        System.out.printf("Number of moves for %d disks: %d\n\n", n, ht1.hanoi('A', 'C', 'B'));
        System.out.printf("Number of moves for %d disks: %d\n\n", n, ht1.hanoi('A', 'C', 'B'));

        System.out.printf("Number of moves for %d disks: %d\n\n", n + 1, ht2.hanoi('A', 'C', 'B'));
        System.out.printf("Number of moves for %d disks: %d\n\n", n + 2, ht3.hanoi('A', 'C', 'B'));
    }
}
