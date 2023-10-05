package org.example.polymorphism;

public class CandySweet implements BaseTypeSweet {

    Object obj = new Object();

    @Override
    public void createSomeSwetty() {
        System.out.println("CandySweet is ready!)))");
    }
}
