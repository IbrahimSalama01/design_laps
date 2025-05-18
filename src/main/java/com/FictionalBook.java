package com;

public class FictionalBook extends PhysicalBook {


    public FictionalBook(String title) {
        super(title);
    }

    @Override
    public void borrowBook(User user) {
        super.borrowBook(user);
        System.out.println(" historical book");
    }
}
