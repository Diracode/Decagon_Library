package com.decagon;
import utility.PriorityList;

import java.util.*;

public class Library {
    private final String name;
    private Map<String, BookLog> books = new HashMap<>(); //store books of the library
    private PriorityList<BookRequest> bookRequestList = new PriorityList<>(); //list of book requests

    public Library(String name) {
        this.name = name;
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public Map<String, BookLog> getBooks() {
        return books;
    }

    public PriorityList<BookRequest> getBookRequestList() {
        return bookRequestList;
    }

}
