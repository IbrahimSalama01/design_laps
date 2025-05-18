package com;
abstract class ApprovalHandler {
    protected ApprovalHandler next;

    public void setNext(ApprovalHandler next) {
        this.next = next;
    }

    public final void handleRequest(Book book, User user) {
        if (approve(book, user)) {
            System.out.println(book.getTitle() + " approved.");
            if (next != null) {
                next.handleRequest(book, user);
            } else {
                System.out.println("Final approval granted.");
            }
        } else {
            System.out.println(user.getName() + " rejected the request. Process stopped.");
        }
    }

    protected abstract boolean approve(Book book, User user);
}
class Librarian extends ApprovalHandler {
    @Override
    protected boolean approve(Book book, User user) {
        return user.getName().equals("Ibrahim Salama");
    }
}

class Manager extends ApprovalHandler {
    @Override
    protected boolean approve(Book book, User user) {
        return true;
    }
}
