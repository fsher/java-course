package com.fsher.exercise2;

import com.fsher.exercise2.figures.Circle;
import com.fsher.exercise2.figures.Rectangle;
import com.fsher.exercise2.figures.Shape;
import com.fsher.exercise2.figures.Square;

public class ExerciseTwo {
    public static void main(String[] args) {
        Shape shape = new Shape("orange", false);
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);
        System.out.printf("Area: %f\n", circle.getArea());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        System.out.printf("Perimeter: %f\n", rectangle.getPerimeter());

        Square square = new Square(4, "red", true);
        System.out.println(square);
        System.out.printf("Perimeter: %f\n", square.getPerimeter());
    }
}
