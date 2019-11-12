package com.fsher.exercise1;

public class Book {
    private String title;
    private Author author;
    private double price;

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printBookDetails() {
        // Print title
        System.out.println("Book: " + title);

        // Print author's full name
        System.out.print("By: ");
        author.printFullName();

        // Print price
        System.out.println("Price: " + price);

    }
}
