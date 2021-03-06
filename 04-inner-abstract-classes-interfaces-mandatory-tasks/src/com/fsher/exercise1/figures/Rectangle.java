package com.fsher.exercise1.figures;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        super();
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String colour, boolean filled) {
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public boolean isInside(double x, double y) {
        return Math.abs(x) < length / 2 && Math.abs(y) < width / 2;
    }

    @Override
    public String toString() {
        return String.format("A Rectangle with width=%f and length=%f, which is a subclass of %s", width, length, super.toString());
    }
}
