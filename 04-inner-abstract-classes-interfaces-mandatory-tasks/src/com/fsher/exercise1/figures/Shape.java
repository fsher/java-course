package com.fsher.exercise1.figures;

public class Shape {
    private String colour;
    private boolean filled;

    public Shape() {
        colour = "green";
        filled = true;
    }

    public Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return String.format("A Shape with the colour %s and %s", colour, filled ? "filled" : "not filled");
    }
}

