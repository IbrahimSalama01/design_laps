package com;

public class BookFactory {

    public Book createBook(String title, String type) {
        if (type == null || title == null) {
            throw new IllegalArgumentException("Title and type must not be null.");
        }

        switch (type.toLowerCase()) {
            case "fictional":
                return new FictionalBook(title);
            case "historical":
                return new HistoricalBook(title);
            case "ebook":
                return new EBook(title);
            default:
                throw new IllegalArgumentException("Unsupported book type: " + type);
        }
    }
}