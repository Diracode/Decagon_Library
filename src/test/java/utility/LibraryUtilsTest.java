package utility;

import com.decagon.Book;
import com.decagon.BookLog;
import com.decagon.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryUtilsTest {
    LibraryUtils libraryUtils;
    Library library;

    @BeforeEach
    void setUp() {
        library = new Library("Library");
        libraryUtils = new LibraryUtils(library);
    }

    @Test
    void createBook() {
        Book book1 = new Book("Mathematics", "Mandy", "99098ED", Category.MATHEMATICS, 3);
        libraryUtils.createBook(book1);
        int actual = library.getBooks().get(book1.getName()).getAvailableBooks();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void addBook() {
        Book book2 = new Book("English", "Mordy", "11118ED", Category.ENGLISH, 4);
        libraryUtils.addBook(book2);
    }

    @Test
    void addBookRequest() {
    }

    @Test
    void processPriorityList() {
    }
}