package org.example.functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.time.LocalDate;
import java.util.function.Supplier;
public class FunctionalInterfaces {

    public void FI (){

        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(4));

        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello");

        Function<Integer, String> convertToString = num -> "Number: " + num;
        System.out.println(convertToString.apply(5));

        Supplier<LocalDate> currentDate = LocalDate::now;
        System.out.println(currentDate.get());

    }
}
