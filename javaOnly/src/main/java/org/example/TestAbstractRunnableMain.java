package org.example;

public abstract class TestAbstractRunnableMain implements Runnable {
    private Object lock = new Object();

    public void lock() {
        synchronized (lock) {
            try {
                lock.wait();
                System.out.println("1");
            } catch (InterruptedException e) {
            }
        }
    }

    public void unlock() {
        synchronized (lock) {
            lock.notify();
            System.out.println("2");
        }
    }

    public static void main(String[] s) {
        new Thread(new TestAbstractRunnableMain() {
            public void run() {
                lock();
            }
        }).start();
        new Thread(new TestAbstractRunnableMain() {
            public void run() {
                unlock();
            }
        }).start();
    }
}