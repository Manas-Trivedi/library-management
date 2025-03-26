package org.example.services;

import org.example.models.Book;
import java.util.HashMap;
import java.util.Map;

public class LibraryService {

    // ✅ Store books in a HashMap with ID as the key
    private final Map<String, Book> books = new HashMap<>();

    // ✅ Add a book
    public void addBook(Book book) {
        if (books.containsKey(book.getId())) {
            System.out.println("Book ID already exists. Use a unique ID.");
        } else {
            books.put(book.getId(), book);
            System.out.println("Book added successfully.");
        }
    }

    // ✅ Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            books.values().forEach(System.out::println);
        }
    }

    // ✅ Search for a book by ID or Title
    public Book searchBook(String query) {
        for (Book book : books.values()) {
            if (book.getId().equalsIgnoreCase(query) ||
                    book.getTitle().equalsIgnoreCase(query)) {
                return book;
            }
        }
        return null;
    }

    // ✅ Update book details
    public void updateBook(String id, String title, String author, String genre, String availability) {
        Book book = books.get(id);
        if (book != null) {
            book.setTitle(title);
            book.setAuthor(author);
            book.setGenre(genre);
            book.setAvailability(availability);
            System.out.println("Book details updated.");
        } else {
            System.out.println("Book not found.");
        }
    }

    // ✅ Delete a book by ID
    public void deleteBook(String id) {
        if (books.remove(id) != null) {
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }
}