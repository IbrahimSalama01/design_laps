package com;

interface AccessStrategy {
    void access(User user);
}

class PremiumAccess implements AccessStrategy {
    public void access(User user) {
        System.out.println("Premium access granted.");
    }
}

public class EBook extends Book{
    private AccessStrategy accessStrategy;
    public EBook(String title) {
        super(title);
    }

    public void setAccessStrategy(AccessStrategy strategy) {
        accessStrategy = strategy;
    }

    public void access(User user) {
        accessStrategy.access(user);
    }

}
