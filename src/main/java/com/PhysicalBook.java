package com;

public abstract class PhysicalBook extends Book implements borrowableInterface {

    private boolean isAvailable;
    private int durationOfBorrowing;

    public PhysicalBook(String title) {
        super(title);
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public void borrowBook(User user) {
        if (isAvailable) {
            isAvailable = false;
            System.out.printf(user.getName() + " successfully borrowed " + getTitle());
        } else {
            System.out.println(getTitle() + " is not available.");
        }
    }
    public void returnBook() {
        isAvailable = true;
        System.out.println("\n"+ getTitle() + " has been returned.");
    }
      @Override
    public int durationOfBorrowing() {
        return durationOfBorrowing;
    }

}
