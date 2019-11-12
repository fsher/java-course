package com.fsher.exercise2.figures;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String colour, boolean filled) {
        super(side, side, colour, filled);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        this.setWidth(side);
    }

    @Override
    public String toString() {
        return String.format("A Square with side=%f, which is a subclass of %s", getWidth(), super.toString());
    }
}
