package org.example;

public class Calculator {
    public synchronized int sum(int a, int b) {
        return a + b;
    }
}
