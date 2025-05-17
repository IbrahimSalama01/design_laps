package com;

public class Main {
    public static void main(String[] args) {
        LibraryService library = LibraryService.getInstance();
        BookFactory bookFactory = new BookFactory();
        Book book = bookFactory.createBook("Harry Potter", "fictional");

        Book physicalBook = bookFactory.createBook("Lord of the Rings", "fictional");
        Book historicalBook = bookFactory.createBook("Outlander", "historical");
        library.addBook(book);
        library.addBook(physicalBook);

        // Create users
        User john = new User("John", false);
        User Alice = new User("Alice", true);

        library.borrowBook("Harry Potter", john );
        System.out.printf("\n"+"=============================");
        library.returnBook("Harry Potter");
        System.out.println("=============================");
        library.borrowBook("Lord of the Rings",  john);
        System.out.println("=============================");
       // library.returnBook("Lord of the Rings")
        library.borrowBook("math", john );
        library.returnBook("math");
        System.out.println("=============================");
        library.borrowBook("Lord of the Rings", Alice);
        System.out.println("=============================");
        library.borrowBook("Outlander", Alice);
        System.out.println("=============================");
        library.addBook(historicalBook);
        library.borrowBook("Outlander", Alice);


    }
}
