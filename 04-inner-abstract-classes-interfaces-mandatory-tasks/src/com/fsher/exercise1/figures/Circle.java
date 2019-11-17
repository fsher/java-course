package com.fsher.exercise1.figures;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return String.format("A Circle with radius=%f, which is a subclass of %s", radius, super.toString());
    }
}
