package org.example;

public class TestInside {
    static void doSomething(){
        System.out.println("doSomething works");
    };

    public static void main(String[] args){
        TestInside x = new TestInside();
        x.doSomething();
    }
}
