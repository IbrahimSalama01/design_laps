package com;

public class HistoricalBook extends PhysicalBook {


    public HistoricalBook(String title) {
        super(title);
    }

    @Override
    public void borrowBook(User user) {
        super.borrowBook(user);
        System.out.println(" historical book");
    }

  
 }
