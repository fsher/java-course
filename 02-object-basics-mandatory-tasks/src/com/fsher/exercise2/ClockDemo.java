package com.fsher.exercise2;

import java.util.Scanner;

public class ClockDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize first clock with the amount of seconds from midnight
        System.out.print("Enter amount of seconds since midnight for the first clock: ");
        Clock firstClock = new Clock(scanner.nextInt());

        // Tick 10 times
        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            System.out.println("Tick: " + firstClock);
        }

        // Initialize second clock with h, m, s.
        System.out.println("Enter hours, minutes and seconds for the second clock.");
        System.out.print("h: ");
        int h = scanner.nextInt();

        System.out.print("m: ");
        int m = scanner.nextInt();

        System.out.print("s: ");
        int s = scanner.nextInt();

        Clock secondClock = new Clock(h, m, s);

        // Tick 10 times
        for (int i = 0; i < 10; i++) {
            secondClock.tick();
            System.out.println("Tick: " + secondClock);
        }

        // Add secondClock to firstClock
        System.out.println("Adding secondClock to the firstClock.");
        firstClock.addClock(secondClock);
        System.out.println("1: " + firstClock + " 2: " + secondClock);

        // Get difference of the firstClock and the secondClock
        System.out.println("Getting difference between firstClock and secondClock");
        System.out.println(firstClock.subtractClock(secondClock));
    }
}
