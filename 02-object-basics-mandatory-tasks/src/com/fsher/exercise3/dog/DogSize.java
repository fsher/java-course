package com.fsher.exercise3.dog;

public enum DogSize {
    SMALL,
    MEDIUM,
    BIG;

    public static final char[] CHAR_SIZES = {'s', 'm', 'l'};

    public static DogSize mapCharToSize(char size) {
        switch (size) {
            case 's': return DogSize.SMALL;
            case 'm': return DogSize.MEDIUM;
            case 'l': return DogSize.BIG;
            default:
                throw new Error("Size has to be either 's', 'm' or 'l'.");
        }
    }
}
