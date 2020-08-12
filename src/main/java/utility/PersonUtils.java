package utility;

import com.decagon.Book;
import com.decagon.Person;

/**
 * houses methods to be carried out by the Person class model
 */
public class PersonUtils implements Borrow{
    private LibraryUtils libraryutils;

    public PersonUtils(LibraryUtils libraryutils) {
        this.libraryutils = libraryutils;
    }

    /**
     * method called when user comes to borrow book
     * it creates a new book request.
     * @param person
     * @param bookName
     * @throws Exception
     */
    @Override
    public void borrowBook(Person person, String bookName) throws Exception {
        libraryutils.addBookRequest(person, bookName);
    }

    /**
     * method called when user returns borrowed book
     * it updates the available book in book log
     * @param book
     */
    @Override
    public void returnBook(Book book) {
        libraryutils.addBook(book);
    }
}
