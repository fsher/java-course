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

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean isInside(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) < radius;
    }

    @Override
    public String toString() {
        return String.format("A Circle with radius=%f, which is a subclass of %s", radius, super.toString());
    }
}
