package org.example;

public class MyThreadSecond extends Thread {
    private Calculator calculator;

    public MyThreadSecond(Calculator calculator) {
        this.calculator = calculator;
    }

    public void run() {
        int result = calculator.sum(2, 3);
        System.out.println("Sum: " + result);
    }
}
