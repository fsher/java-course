package com.fsher.exercise1.figures;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {}

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String colour) {
        super(radius, colour);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.getArea() * height;
    }

    @Override
    public double getArea() {
        return Math.PI * 2 * getRadius() * height + 2 * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder: radius: " + getRadius() + ", height: " + height + ", colour: " + getColour();
    }
}
