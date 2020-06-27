package com.fsher.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1 {
    private static final String REGEXP_STRING = "Word cAT DATA A site Java tExt";

    public static void main(String[] args) {
        Pattern uppercasedWords = Pattern.compile("(\\b[A-Z].*?\\b)");
        Matcher matcher = uppercasedWords.matcher(REGEXP_STRING);

        List<String> matches = new ArrayList<>();
        while (matcher.find()) {
            matches.add(REGEXP_STRING.substring(matcher.start(), matcher.end()));
        }

        System.out.println(String.join(", ", matches));
    }
}
