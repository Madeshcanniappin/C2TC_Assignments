package com.Madesh.Assignments.three;

public class Book extends Item{
	private final String author;

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    public String getAuthor() { return author; }

    @Override
    public void displayInfo() {
        System.out.println("Book: [ID: " + getId() + ", Title: " + getTitle() + ", Author: " + author + "]");
    }
}