package com.fsher.exercise3.dog;

import java.util.Random;

public class Dog {
    public static final int MAX_AGE = 20;
    public static final int MIN_AGE = 1;
    public static final String[] DOG_NAMES = {"Fred", "Barky", "Tail", "Samson", "Mr.Goodboi", "Lassy", "Kristi"};

    private String name;
    private int age;
    private DogSize size;

    public Dog(String name, int age, DogSize size) {
        this.name = name.length() > 0 ? name : generateName();
        this.size = size;

        setAge(age);
    }

    public Dog(String name, int age) {
        this.name = name.length() > 0 ? name : generateName();
        this.size = generateSize();

        setAge(age);
    }

    public Dog(String name) {
        this.name = name.length() > 0 ? name : generateName();
        this.age = generateAge();
        this.size = generateSize();
    }

    public Dog() {
        this.name = generateName();
        this.age = generateAge();
        this.size = generateSize();
    }

    private void setAge(int age) {
        if (age > MAX_AGE) {
            this.age = MAX_AGE;
        } else this.age = Math.max(age, MIN_AGE);
    }

    private static String generateName() {
        return DOG_NAMES[new Random().nextInt(DOG_NAMES.length)];
    }

    private static int generateAge() {
        return new Random().nextInt(MAX_AGE) + MIN_AGE;
    }

    private static DogSize generateSize() {
        return DogSize.mapCharToSize(DogSize.CHAR_SIZES[new Random().nextInt(DogSize.CHAR_SIZES.length)]);
    }

    public DogSize getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age + " (" + this.size + ")";
    }
}
