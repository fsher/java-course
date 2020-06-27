package com.fsher.exercise3;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise3 {
    private static final String REGEX_STRING = "password wwwword word Helllloooooooo";

    public static void main(String[] args) {
        final Predicate<String> match = str -> str.matches("[\\S]*(\\S)\\1[\\S]*");

        final String result = Arrays.stream(REGEX_STRING.split(" "))
                .filter(match.negate())
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
