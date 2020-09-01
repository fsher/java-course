package com.fsher.exercise4;

import com.fsher.exercise4.exceptions.NumberZeroException;
import com.fsher.exercise4.exceptions.TooLargeNumberException;
import com.fsher.exercise4.exceptions.TooLowNumberException;

import java.util.Scanner;

public class Exercise4 {
    private static final int MAX = 466;
    private static final int MIN = -23;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number: ");
        try (scanner) {
            int number = scanner.nextInt();
            System.out.printf("Here is your number: %d \n", Exercise4.checkNumber(number));
        } catch (TooLargeNumberException | TooLowNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int checkNumber(int num) throws TooLargeNumberException, TooLowNumberException {
        if (num > MAX) {
            throw new TooLargeNumberException(MAX);
        }

        if (num < MIN) {
            throw new TooLowNumberException(MIN);
        }

        if (num == 0) {
            throw new NumberZeroException();
        }

        return num;
    }
}
