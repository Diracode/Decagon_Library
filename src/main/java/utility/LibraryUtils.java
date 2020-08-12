package utility;
import com.decagon.*;

/**
 * houses Library methods.
 */
public class LibraryUtils {
    private Library library;

    public LibraryUtils(Library library) {
        this.library = library;
    }

    /**
     * Method creates an instance of a book when called
     * then calls the "addBook" method
     * to add the book to a map containing the total books in the Library.
     * @param book
     */
    public void createBook(Book book) {
        addBook(book);
    }

    /**
     * Method adds book to the library's book map when book is instantiated
     * and updates the number of books in the booklog when book is returned.
     * @param book
     */
    public void addBook(Book book) {
        if (!library.getBooks().containsKey(book.getName())) {
            BookLog bookLog = new BookLog();
            bookLog.setBook(book);
            bookLog.addAvailableBooks(book.getQuantity());
            library.getBooks().put(book.getName(), bookLog);
        } else {
            library.getBooks().get(book.getName()).increaseAvailableBooks();
        }
    }

    /**
     * Method creates a new book request
     * by calling the "createBookRequest" when a library user comes to borrow books
     * and adds the request to a Queue of other users' requests while waiting to be processed.
     * throws exception if library does not have such book requested
     * @param person
     * @param bookName
     * @return
     * @throws Exception
     */
    public BookRequest addBookRequest(Person person, String bookName) throws Exception {
        BookRequest request = createBookRequest(person, bookName);
        library.getBookRequestList().offer(request);
        return request;
    }

    private BookRequest createBookRequest(Person person, String bookName) throws Exception {
        if (library.getBooks().containsKey(bookName)) {
            return new BookRequest(person, bookName);
        } else {
            throw new Exception("Book not available in the library");
        }
    }

    /**
     * Method to use when library is lending out books to users on the queue
     * it calls the "retrieveBook" method to check availability of book
     * and return book to user if available.
     */
    public void processPriorityList() {
        while(library.getBookRequestList().size() > 0) {
            retrieveBook(library.getBookRequestList().poll().getBookName());
        }
    }

    private Book retrieveBook(String bookName) {
        BookLog bookLog = library.getBooks().get(bookName);
        if(bookLog == null || bookLog.getAvailableBooks() < 1) {
            System.out.println("Book Taken");
            return null;
        }
        bookLog.decreaseAvailableBooks();
        return bookLog.getBook();
    }
}
