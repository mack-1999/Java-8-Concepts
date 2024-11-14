package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> isGreaterThanFive = number -> number > 5;

        // Filter numbers that are even and greater than 5
        numbers.stream()
                .filter(isEven.and(isGreaterThanFive))
                .forEach(System.out::println);
    }
}

//! Predicate is a functional interface in the java.util.function package that represents a condition or a filter which returns a boolean value (true or false) based on some input. Predicates are often used in functional programming with lambdas, particularly in streams, to filter or evaluate conditions on collections of data.