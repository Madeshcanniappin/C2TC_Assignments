package com.Madesh.Assignments.three;

public class Assignment3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Inheritance demo
        Book book = new Book(101, "Java Basics", "James Gosling");
        Magazine magazine = new Magazine(201, "Tech Today", 45);

        // Show that Book is-a Item and Magazine is-a Item
        book.displayInfo();
        magazine.displayInfo();

        // Composition demo
        Library library = new Library();
        library.addItem(book);
        library.addItem(magazine);
        library.showAllItems();
	}

}
