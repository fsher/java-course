package com.fsher.exercise4;

import java.util.Scanner;

class ExerciseFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter symbol: ");
        char symbol = scanner.next().charAt(0);

        System.out.printf("Amount of '%s': %d", symbol, SymbolCounter.count(symbol));
    }
}
