package org.example.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterReetrantLock {
    private int count;
    private Lock lock = new ReentrantLock();

    public void increment(String threadName) {
        lock.lock();
        try {
            count++;
            System.out.println(threadName + " : " + count);
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}
