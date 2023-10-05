package org.example.threads;

public class MyThread extends Thread {

    private Object lock = new Object();

    public void lock() {
        System.out.println("lock1");
        synchronized (lock) {
            System.out.println("lock2");
            try {
                System.out.println("lock3");
                lock.wait();
                System.out.println("1");
            } catch (InterruptedException e) {
                System.out.println("lock4");
            }
            System.out.println("lock5");
        }
        System.out.println("lock6");
    }

    public void unlock() {
        System.out.println("unlock1");
        synchronized (lock) {
            System.out.println("unlock2");
            lock.notify();
            System.out.println("2");
        }
        System.out.println("unlock3");
    }

    /*@Override
    public void run() {
        lock();
        System.out.println("поток номер 1");
    }*/
}
