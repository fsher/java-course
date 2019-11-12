package com.fsher.exercise1;

import com.fsher.exercise1.figures.Circle;
import com.fsher.exercise1.figures.Cylinder;

public class ExerciseOne {

    public static void main(String[] args) {
        Circle circle = new Circle(4.0, "green");
        System.out.println(circle);
        System.out.printf("Area: %f\n", circle.getArea());

        Cylinder cylinder = new Cylinder(4.0, 5.0, "blue");
        System.out.println(cylinder);
        System.out.printf("Area: %f\n", cylinder.getArea());
        System.out.printf("Volume: %f\n", cylinder.getVolume());
    }
}
