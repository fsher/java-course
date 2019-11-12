package com.fsher.exercise1.figures;

public class Circle {
    double radius;
    String colour;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle: radius: " + radius + ", colour: " + colour;
    }
}
