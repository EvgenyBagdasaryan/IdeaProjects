package org.example.threads;

public class Counter {
    private int count = 0;

    public synchronized void increment(String threadName) {
        count++;
        System.out.println(threadName + " : " + count);
    }

    public synchronized int getCount() {
        return count;
    }
}