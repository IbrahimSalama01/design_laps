package com;

public class Book implements BookInterface {
    private String title;

    public Book(String title) {
        this.title = title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getTitle() {
        return title;
    }




}
