package com.fsher.exercise4;

class SymbolCounter {
    private static final String SEARCH_STRING = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

    static int count(char symbol) {
        int counter = 0;
        for (int i = 0; i < SEARCH_STRING.length(); i++) {
            if (SEARCH_STRING.charAt(i) == symbol) {
                counter++;
            }
        }

        return counter;
    }
}
