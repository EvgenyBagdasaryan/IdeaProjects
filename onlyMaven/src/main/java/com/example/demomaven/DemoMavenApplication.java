package com.example.demomaven;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.MappedByteBuffer;
import java.util.*;

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

        Map<String, String> map = new HashMap<>();

        int[] massiv = new int[10];

        List<String> ll = new LinkedList<>();

        for (int i = 0; i < 1000; i++){

        }


    }

    public static void loadFile() throws NullPointerException, FileNotFoundException {

        File newFile = new File("dss");
        Scanner sc =  new Scanner(newFile);
    }
}

class Season {
    int number;
    String name;

    public Season(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Season{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Season season = (Season) o;
        return number == season.number && Objects.equals(name, season.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }
}
