package com.fsher.exercise1;

public class BookDemo {

    public static void main(String[] args) {
	    Author russel = new Author("Russel", "Winderand");
	    Book book = new Book("Developing Java Software", russel, 79.75);

	    book.printBookDetails();
    }
}
