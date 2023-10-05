package org.example;

import java.util.Arrays;
import java.util.List;

public class StringBuilderMain {

    public static void main(String[] args) {
        List<StringBuilder> list = Arrays.asList(new StringBuilder("Java "),  new StringBuilder("Hello "));
        list.stream()
                .map((x) -> x.append("World  ")).forEach(System.out::print);
        //list.forEach(System.out::print);
    }
}
