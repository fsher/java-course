package com.fsher.exercise3;

import com.fsher.exercise3.dog.Dog;
import com.fsher.exercise3.dog.DogSize;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class DogsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of dogs: ");
        int n = Integer.parseInt(scanner.nextLine());
        Dog[] dogs = new Dog[n];

        System.out.println("Enter dogs' names, ages and sizes ('s', 'm', 'l') divided by space.");
        for (int i = 0; i < n; i++) {
            String dogInfo = scanner.nextLine();
            dogs[i] = dogInfoToDog(dogInfo);
        }

        Dog[] byName = Arrays.copyOf(dogs, dogs.length);
        Dog[] byAge = Arrays.copyOf(dogs, dogs.length);
        Dog[] bySize = Arrays.copyOf(dogs, dogs.length);

        sorter(byName, DogsDemo::nameCondition);
        System.out.println("Sorted by name (asc): " + Arrays.toString(byName));

        sorter(byAge, DogsDemo::ageCondition);
        System.out.println("Sorted by age (asc): " + Arrays.toString(byAge));

        sorter(bySize, DogsDemo::sizeCondition);
        System.out.println("Sorted by size (asc): " + Arrays.toString(bySize));
    }

    private static Dog dogInfoToDog(String dogInfo) {
        String[] dogArgs = dogInfo.split(" ");

        String name;
        int age;
        DogSize size;

        if (dogArgs.length >= 3) {
            name = dogArgs[0];
            age = Integer.parseInt(dogArgs[1]);
            size = DogSize.mapCharToSize(dogArgs[2].charAt(0));
            return new Dog(name, age, size);
        }

        if (dogArgs.length == 2) {
            name = dogArgs[0];
            age = Integer.parseInt(dogArgs[1]);
            return new Dog(name, age);
        }

        if (dogArgs.length == 1) {
            name = dogArgs[0];
            return new Dog(name);
        }

        return new Dog();
    }

    private static boolean nameCondition(Dog dogA, Dog dogB) {
        return dogA.getName().compareToIgnoreCase(dogB.getName()) > 0;
    }

    private static boolean ageCondition(Dog dogA, Dog dogB) {
        return dogA.getAge() > dogB.getAge();
    }

    private static boolean sizeCondition(Dog dogA, Dog dogB) {
        return dogA.getSize().compareTo(dogB.getSize()) > 0;
    }

    private static void sorter(Dog[] dogs, BiFunction<Dog, Dog, Boolean> condition) {
        for (int i = 0; i < dogs.length - 1; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (condition.apply(dogs[i], dogs[j])) {
                    Dog temp = dogs[i];
                    dogs[i] = dogs[j];
                    dogs[j] = temp;
                }
            }
        }
    }
}
