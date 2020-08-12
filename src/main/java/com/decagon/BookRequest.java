package com.decagon;
import utility.LibraryUtils;

/**
 * a record for each user intending to borrow books and name of books to be borrowed.
 */
public class BookRequest {
    private final Person person;
    private final String bookName;


    public BookRequest(Person person, String bookName) {
        this.person = person;
        this.bookName = bookName;
    }

    public Person getPerson() {
        return person;
    }

    public String  getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "BookRequest{" +
                "person=" + person.getName() +
                ", bookName='" + bookName + "}";
    }
}
