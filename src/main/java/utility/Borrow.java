package utility;

import com.decagon.Book;
import com.decagon.Person;

/**
 * holds methods for borrowing and returning books
 */
public interface Borrow {
    void borrowBook(Person person, String bookName) throws Exception;
    void returnBook(Book book);
}
