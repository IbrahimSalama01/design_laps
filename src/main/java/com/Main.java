package com;

public class Main {
    public static void main(String[] args) {
        LibraryService library = LibraryService.getInstance();
        FictionalBook book = new FictionalBook("Harry Potter");

        FictionalBook physicalBook = new FictionalBook("Lord of the Rings");
        Book historicalBook = new HistoricalBook("Outlander");
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
