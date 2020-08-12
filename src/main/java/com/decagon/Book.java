package com.decagon;

import utility.Category;

public class Book {
    //FIELDS
    private final String name;
    private final String author;
    private final String isbn;
    private final Category category;
    private final int quantity;

    //Constructors
    public Book(String name, String author, String isbn, Category category, int quantity) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.category = category;
        this.quantity = quantity;
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public Category getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }
}
