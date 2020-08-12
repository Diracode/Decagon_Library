package com.decagon;

/**
 * Log card to record details of a book and the quantity available.
 */
public class BookLog {
    //FIELDS
    private int availableBooks = 0;
    private Book book;


    public int getAvailableBooks() {
        return availableBooks;
    }

    //increases number of books available for Book instances
    public void addAvailableBooks(int quantity) {
        this.availableBooks += quantity;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    //updates quantity of available books when returned
    public void increaseAvailableBooks() {
        availableBooks++;
    }

    //updates quantity of available books when borrowed
    public void decreaseAvailableBooks() {
        availableBooks--;
    }
}
