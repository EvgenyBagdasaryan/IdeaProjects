package org.example;

import static org.example.Test.comparStatic;
import static org.example.Test.setStatic;

public class Main {
    public static void main(String[] args) {

        //firstCase();
        //secondCase();
        thirdCase();

        //String
        //Boolean

        System.out.println("Hello code!");
    }

    private static void firstCase(){

        SharedResource sharedResource = new SharedResource();

        MyThreadFirst thread1 = new MyThreadFirst(sharedResource);
        MyThreadFirst thread2 = new MyThreadFirst(sharedResource);

        thread1.start();
        thread2.start();
    }

    private static void secondCase(){
        Calculator calculator = new Calculator();

        MyThreadSecond thread1 = new MyThreadSecond(calculator);
        MyThreadSecond thread2 = new MyThreadSecond(calculator);

        thread1.start();
        thread2.start();
    }

    private static void thirdCase(){

        var testObj = Test.builder().id(12).build();
        boolean comaparNativeRez = testObj.comaparNative(12);
        System.out.println("comaparNativeRez: " + comaparNativeRez);

        setStatic(testObj, 14);
        boolean comaparStaticRez = comparStatic(testObj, 14);
        System.out.println("comaparStaticRez: " + comaparStaticRez);
    }
}