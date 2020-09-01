package com.fsher.exercise2;

public class Exercise2 {
    private static final String REGEXP_STRING = "     Removing     Extra Spaces    Between Words in    the text      ";

    public static void main(String[] args) {
        System.out.println(
                REGEXP_STRING
                        .replaceAll("(^\\s+)|(\\s+$)", "")
                        .replaceAll("(\\s{2,})", " ")
        );
    }
}
