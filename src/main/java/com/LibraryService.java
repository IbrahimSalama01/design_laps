package com;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private static LibraryService instance;

    private List<Book> books = new ArrayList<>();

    private LibraryService() {
    }

    public static synchronized LibraryService getInstance() {
        if (instance == null) {
            instance = new LibraryService();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public PhysicalBook findPhysicalBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book instanceof PhysicalBook) {
                return (PhysicalBook) book;
            }
        }
        return null;
    }

    public void borrowBook(String title, User user) {
        PhysicalBook book = findPhysicalBook(title);

        if (book == null) {
            System.out.println(title + " is not found in the library.");
        } else if (!book.isAvailable()) {
            System.out.println(title + " is not available.");
        } else {
            book.borrowBook(user);
        }
    }

    public void returnBook(String title) {
        PhysicalBook book = findPhysicalBook(title);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println(title + " is not found in the library.");
        }
    }
}
