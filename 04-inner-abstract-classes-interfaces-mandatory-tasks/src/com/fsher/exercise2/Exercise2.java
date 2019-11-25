package com.fsher.exercise2;

public class Exercise2 {

    public static void main(String[] args) {
        MovableRectangle rect = new MovableRectangle(0, 0, 3, 4);

        System.out.println(rect);
        rect.moveUp();
        System.out.printf("Moved up: %s\n", rect);

        rect.moveLeft();
        System.out.printf("Moved left: %s\n", rect);

        rect.moveDown();
        System.out.printf("Moved down: %s\n", rect);

        rect.moveRight();
        System.out.printf("Moved right: %s\n", rect); // should be topLeft: (0, 0) and bottomRight: (3, 4)
    }
}
