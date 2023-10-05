package org.example;

import org.example.adapter.AudioPlayer;
import org.example.adapter.MediaPlayer;
import org.example.async.AnotherClass;
import org.example.async.MyClass;
import org.example.functionalInterface.MyFunctionalInterface;
import org.example.personInvocation.PersonInvocationHandler;
import org.example.polymorphism.FirmManufacturing;
import org.example.singleton.Singleton;
import org.example.singleton.SingletonSynchronized;
import org.example.threads.*;
import there.simple.invocationHandler.Man;
import there.simple.invocationHandler.Person;

import java.lang.reflect.Proxy;

import static org.example.Test.comparStatic;
import static org.example.Test.setStatic;

public class Main {
    public static void main(String[] args) {

        Person sameMan = new Man("Gogi", 34, "Delaver", "USA");

        sameMan.introduce("Urasik");

        //firstCase();
        //secondCase();
        //thirdCase();
        //adapter();
        //threadsParty();
        //twoThreads();
        //funInterfaceTest();
        //(new FirmManufacturing()).createAllSweets();
        //asyncCaseCallback();
        personInvocation();

        //String
        //Boolean

        System.out.println("-----------");
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

    private static void adapter(){
        MediaPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("vlc", "movie.vlc");
        audioPlayer.play("mp4", "video.mp4");
    }

    private static void threadsParty(){
        MyThread myThread = new MyThread(){
            @Override
            public void run() {
                lock();
                System.out.println("поток номер 1");
            }
        };
        myThread.start();

        MyThread myThread2 = new MyThread(){
            @Override
            public void run() {
                unlock();
                System.out.println("поток номер 2");
            }
        };
        myThread2.start();

        /*Thread thread2 = new Thread(new MyRunnable());
        thread2.start();

        Thread thread3 = new Thread(() -> {
            System.out.println("поток номер 3");
        });
        thread3.start();*/
    }

    private static void twoThreads(){
        Counter counter = new Counter();
        CounterVolatile counterVolatile = new CounterVolatile();
        CounterReetrantLock counterReetrantLock = new CounterReetrantLock();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    counterReetrantLock.increment("first");
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    counterReetrantLock.increment("second");
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //System.out.println("Final count: " + counter.getCount());
    }

    private static void funInterfaceTest(){
        MyFunctionalInterface myFunctionalInterface = () -> {
            System.out.println("Выполнение действия");
        };

        myFunctionalInterface.onlyOneMethod();
    }

    private static void useSingleton(){
        Singleton singleton = Singleton.getInstance();
        SingletonSynchronized singletonSynchronized = SingletonSynchronized.getInstance();
    }

    private static void asyncCaseCallback(){
        MyClass myClass = new MyClass();
        AnotherClass anotherClass = new AnotherClass();
        anotherClass.registerCallback(myClass);
    }

    private static void personInvocation(){

        //Создаем оригинальный объект
        Man vasia = new Man("Вася", 30, "Санкт-Петербург", "Россия");

        //Получаем загрузчик класса у оригинального объекта
        ClassLoader vasiaClassLoader = vasia.getClass().getClassLoader();

        //Получаем все интерфейсы, которые реализует оригинальный объект
        Class[] interfaces = vasia.getClass().getInterfaces();

        //Создаем прокси нашего объекта vasia
        Person proxyVasia = (Person) Proxy.newProxyInstance(vasiaClassLoader, interfaces, new PersonInvocationHandler(vasia));

        //Вызываем у прокси объекта один из методов нашего оригинального объекта
        //proxyVasia.introduce(vasia.getName());

        //Вызываем у прокси объекта один из методов нашего оригинального объекта
        //proxyVasia.sayFrom(vasia.getName(), vasia.getName());

    }
}