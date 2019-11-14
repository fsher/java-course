package com.fsher.exercise2;

import com.fsher.exercise2.figures.Circle;
import com.fsher.exercise2.figures.Rectangle;
import com.fsher.exercise2.figures.Shape;
import com.fsher.exercise2.figures.Square;

public class ExerciseTwo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(2, "orange", false),
                new Rectangle(),
                new Square(4, "red", true)};

        for (Shape shape : shapes) {
            System.out.println(shape);

            if (shape instanceof Circle) {
                System.out.printf("Area: %f\n", ((Circle) shape).getArea());
                continue;
            }

            if (shape instanceof Rectangle) {
                System.out.printf("Perimeter: %f\n", ((Rectangle) shape).getPerimeter());
            }
        }
    }
}
