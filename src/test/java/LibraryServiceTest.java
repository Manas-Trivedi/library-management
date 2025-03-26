import org.example.models.Book;
import org.example.services.LibraryService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryServiceTest {

    @Test
    void testAddBook() {
        LibraryService service = new LibraryService();
        Book book = new Book("1", "Java Programming", "John Doe", "Tech", "Available");

        service.addBook(book);

        assertNotNull(service.searchBook("1"));
        assertEquals("Java Programming", service.searchBook("1").getTitle());
    }

    @Test
    void testUpdateBook() {
        LibraryService service = new LibraryService();
        Book book = new Book("1", "Java Programming", "John Doe", "Tech", "Available");
        service.addBook(book);

        service.updateBook("1", "Java 17", "John Smith", "Programming", "Checked Out");

        Book updatedBook = service.searchBook("1");
        assertEquals("Java 17", updatedBook.getTitle());
        assertEquals("John Smith", updatedBook.getAuthor());
    }

    @Test
    void testDeleteBook() {
        LibraryService service = new LibraryService();
        Book book = new Book("1", "Python Programming", "Alice", "Tech", "Available");
        service.addBook(book);

        service.deleteBook("1");

        assertNull(service.searchBook("1"));
    }
}