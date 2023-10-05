package org.example.threads;

public class CounterVolatile {

    private volatile int count;

    public void increment(String threadName){
        count++;
        System.out.println(threadName + " : " + count);
    }

    public int getCount(){
        return count;
    }
}