package com.example.demomaven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoMavenApplication {

    public static void main(String[] args) {

        Person newObject = new Person();
        newObject.setName("Bob");

        Class objClass = Person.class;

        System.out.println(newObject.getName());

        List animals = new ArrayList();
        animals.add("wewew");
        animals.add(123);

        String an = (String) animals.get(0);

        System.out.println(an);

        List<String> newArr = new ArrayList<>();
        newArr.add("wewew");
        newArr.add("123");

        try {
            loadFile();
        } catch (NullPointerException | FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("обработка искл");
        }

        Cars kjk = Cars.FERRY;


        System.out.println("I am instance of enum");
        System.out.println(Cars.FERRY instanceof Enum);

        System.out.println(kjk.model);

    }

    public static void loadFile() throws NullPointerException, FileNotFoundException {

        File newFile = new File("dss");
        Scanner sc =  new Scanner(newFile);
    }
}
