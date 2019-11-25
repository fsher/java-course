package com.fsher.exercise1;

import com.fsher.exercise1.figures.Circle;
import com.fsher.exercise1.figures.Rectangle;
import com.fsher.exercise1.figures.Square;

public class Exercise1 {

    public static void main(String[] args) {
        Circle circle = new Circle(5);

        System.out.println("-- Circle --");
        // Circle's isInside test
        System.out.println(circle.isInside(-3, 3)); // true
        System.out.println(circle.isInside(4, 5)); // false
        System.out.println(circle.isInside(0, 0)); // true
        System.out.println(circle.isInside(3, 4)); // false

        System.out.printf("Area: %f\n", circle.getArea());
        System.out.printf("Perimeter: %f\n", circle.getPerimeter());

        System.out.println("\n-- Rectangle --");
        Rectangle rectangle = new Rectangle(5, 8);

        System.out.println(rectangle.isInside(-3, 2)); // true
        System.out.println(rectangle.isInside(6, 2)); // false
        System.out.println(rectangle.isInside(0, 0)); // true
        System.out.println(rectangle.isInside(5, 4)); // false

        System.out.printf("Area: %f\n", rectangle.getArea());
        System.out.printf("Perimeter: %f\n", rectangle.getPerimeter());

        System.out.println("\n-- Square --");
        Square square = new Square(4);

        System.out.println(square.isInside(1, -1.5)); // true
        System.out.println(square.isInside(6, 2)); // false
        System.out.println(square.isInside(0, 0)); // true
        System.out.println(square.isInside(2, 2)); // false

        System.out.printf("Area: %f\n", square.getArea());
        System.out.printf("Perimeter: %f\n", square.getPerimeter());
    }
}
