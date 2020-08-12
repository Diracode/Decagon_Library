package com.decagon;

import utility.Category;
import utility.LibraryUtils;
import utility.PersonUtils;
import utility.Role;

public class Main {
    // TODO
    // 0) Create a book request list --(you'll change it to a priority queue later)
    // 1) create a method called addtorequestQueue it takea a user and the name of the book
    // 2) it checks if the book exists in the library, if it exists, create a new bookrequest object
    // and add to the queue
    // 6) create a book data object
    // 7) substitute that book in your hashmap to a bookdata
    public static void main(String[] args) throws Exception {
        Person user1 = new Person("Kene Tito", "male", Role.TEACHER);
        Person user2 = new Person("Adekan Sola", "male", Role.SENIOR_STUDENT);
        Person user3 = new Person("Ose Okoduwa", "male", Role.JUNIOR_STUDENT);
        Person user4 = new Person("Fred Chinazor", "male", Role.JUNIOR_STUDENT);
        Person user5 = new Person("Omolade Lolu", "male", Role.TEACHER);


        Book maths = new Book("Mathematics","Chimezie","99098ED", Category.MATHEMATICS, quantity);
        Book english = new Book("English", "Tobby", "89089DC", Category.ENGLISH, quantity);
        Book physics = new Book("Physics", "Achebe", "12123DC", Category.SCIENCES, quantity);
        Book literature = new Book("Literature", "Ozioma", "78789OZ", Category.LITERATURE, quantity);

        Library library = new Library("ujus library");
        LibraryUtils libraryUtils = new LibraryUtils(library);
        PersonUtils personUtils = new PersonUtils(libraryUtils);

        libraryUtils.createBook(maths.getName(), maths.getAuthor(), maths.getIsbn(), maths.getCategory(), 3);
        libraryUtils.createBook(english.getName(), english.getAuthor(), english.getIsbn(), english.getCategory(), 3);
        libraryUtils.createBook(physics.getName(), physics.getAuthor(), physics.getIsbn(), physics.getCategory(), 3);
        libraryUtils.createBook(literature.getName(), literature.getAuthor(), literature.getIsbn(), literature.getCategory(), 3);



        personUtils.borrowBook(user2, physics.getName());
        personUtils.borrowBook(user1, literature.getName());
        personUtils.borrowBook(user2, maths.getName());
        personUtils.borrowBook(user4, literature.getName());
        personUtils.borrowBook(user3, maths.getName());
        personUtils.borrowBook(user5, english.getName());
        personUtils.borrowBook(user1, maths.getName());
        personUtils.borrowBook(user1, english.getName());

        System.out.println(library.getBookRequestList());
//        BookRequest rq1 = library.getBookRequestList().poll();
//        BookRequest rq2 = library.getBookRequestList().poll();
//        BookRequest rq3 = library.getBookRequestList().poll();
//        BookRequest rq4 = library.getBookRequestList().poll();
//        BookRequest rq5 = library.getBookRequestList().poll();
//        BookRequest rq6 = library.getBookRequestList().poll();
//        BookRequest rq7 = library.getBookRequestList().poll();
//        BookRequest rq8 = library.getBookRequestList().poll();
//
//        System.out.println(rq1.getPerson().getRole() + " " + rq1.getBookName());
//        System.out.println(rq2.getPerson().getRole() + " " + rq2.getBookName());
//        System.out.println(rq3.getPerson().getRole() + " " + rq3.getBookName());
//        System.out.println(rq4.getPerson().getRole() + " " + rq4.getBookName());
//        System.out.println(rq5.getPerson().getRole() + " " + rq5.getBookName());
//        System.out.println(rq6.getPerson().getRole() + " " + rq6.getBookName());
//        System.out.println(rq7.getPerson().getRole() + " " + rq7.getBookName());
//        System.out.println(rq8.getPerson().getRole() + " " + rq8.getBookName());






    }



}
