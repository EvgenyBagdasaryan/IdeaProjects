package org.example.threads;

import org.example.SharedResource;

public class MyThreadFirst extends Thread{
    private SharedResource sharedResource;

    public MyThreadFirst(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        sharedResource.increment();
        System.out.println("Thread " + Thread.currentThread().getId() + " incremented count: " + sharedResource.getCount());

        sharedResource.decrement();
        System.out.println("Thread " + Thread.currentThread().getId() + " decremented count: " + sharedResource.getCount());
    }
}
