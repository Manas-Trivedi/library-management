package org.example.services;

import org.example.utils.Validator;
import org.example.models.Book;
import java.util.HashMap;
import java.util.Map;

public class LibraryService {

    // ✅ Store books in a HashMap with ID as the key
    private final Map<String, Book> books = new HashMap<>();

    // ✅ Add a book
    public void addBook(Book book) {
        if (!Validator.isValidId(book.getId())) {
            System.out.println("Invalid ID. ID cannot be empty.");
            return;
        }

        if (!Validator.isValidString(book.getTitle()) ||
                !Validator.isValidString(book.getAuthor())) {
            System.out.println("Title and Author cannot be empty.");
            return;
        }

        if (!Validator.isValidAvailability(book.getAvailability())) {
            System.out.println("Invalid availability status. Use 'Available' or 'Checked Out'.");
            return;
        }

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
        if (!Validator.isValidString(query)) {
            System.out.println("Invalid search query.");
            return null;
        }

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
        if (!books.containsKey(id)) {
            System.out.println("Book not found.");
            return;
        }

        if (!Validator.isValidString(title) ||
                !Validator.isValidString(author)) {
            System.out.println("Title and Author cannot be empty.");
            return;
        }

        if (!Validator.isValidAvailability(availability)) {
            System.out.println("Invalid availability status.");
            return;
        }

        Book book = books.get(id);
        book.setTitle(title);
        book.setAuthor(author);
        book.setGenre(genre);
        book.setAvailability(availability);
        System.out.println("Book details updated.");
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