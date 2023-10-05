package org.example.threads;
                        
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("поток номер 2");
    }
}
