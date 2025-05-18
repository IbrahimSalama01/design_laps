package com;
public class PremiumBookDecorator extends PhysicalBook {
    private PhysicalBook originalBook;

    public PremiumBookDecorator(PhysicalBook book) {
        super(book.getTitle());
        this.originalBook = book;
    }

    @Override
    public int durationOfBorrowing() {
        return originalBook.durationOfBorrowing() + 10;
    }
}