package org.example.models;

public class Book {
    private String id;
    private String title;
    private String author;
    private String genre;
    private String availability;

    // Constructor
    public Book(String id, String title, String author, String genre, String availability) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availability = availability;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    // ✅ To display book information
    @Override
    public String toString() {
        return "\nBook ID: " + id +
                "\nTitle: " + title +
                "\nAuthor: " + author +
                "\nGenre: " + genre +
                "\nAvailability: " + availability;
    }
}