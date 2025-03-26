package org.example;

import org.example.models.Book;
import org.example.services.LibraryService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LibraryService libraryService = new LibraryService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID or Title");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter Availability (Available / Checked Out): ");
                    String availability = scanner.nextLine();

                    Book book = new Book(id, title, author, genre, availability);
                    libraryService.addBook(book);
                    break;

                case 2:
                    libraryService.displayBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID or Title: ");
                    String query = scanner.nextLine();
                    Book foundBook = libraryService.searchBook(query);
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("New Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("New Author: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("New Genre: ");
                    String newGenre = scanner.nextLine();
                    System.out.print("New Availability: ");
                    String newAvailability = scanner.nextLine();

                    libraryService.updateBook(updateId, newTitle, newAuthor, newGenre, newAvailability);
                    break;

                case 5:
                    System.out.print("Enter Book ID to delete: ");
                    String deleteId = scanner.nextLine();
                    libraryService.deleteBook(deleteId);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}