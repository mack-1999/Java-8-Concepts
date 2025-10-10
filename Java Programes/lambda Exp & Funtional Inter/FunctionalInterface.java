import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {       
        //! Predicate: A functional interface that takes an input and returns a boolean value.
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(5)); // false

        Predicate<String> isLongerThan5 = (s) -> s.length() > 5;
        System.out.println(isLongerThan5.test("Hello")); // false
        System.out.println(isLongerThan5.test("Hello, World!")); // true

        //! BiPredicate: A functional interface that takes two inputs and returns a boolean value.
        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
        System.out.println("BiPredicate Interface: "+isGreater.test(10, 5));

        //! Function: A functional interface that takes an input and produces an output.
        Function<Integer, Integer> doubleIt = n -> n * 2;
        Function<Integer, Integer> tripleIt = s -> s * 3;

        System.out.println("Double of 5: " + doubleIt.apply(5)); // 10
        System.out.println("andThen() Method: "+doubleIt.andThen(tripleIt).apply(20)); // (20 * 2) * 3 = 120
        System.out.println("Compose() Method: "+doubleIt.compose(tripleIt).apply(20)); // (20 * 3) * 2 = 120

        Function<Integer, Integer> response = Function.identity();
        System.out.println("Identity Function: "+response.apply(10)); // 10

        //! BiFunction: A functional interface that takes two inputs and produces an output.
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("BiFunction Interface: "+add.apply(5, 10)); // 15

        //! Consumer: A functional interface that takes an input and performs an action without returning a result.
        Consumer<Integer> printSquare = n -> System.out.println("Consumer Interface: "+n * n);
        printSquare.accept(5); // 25

        //! BiConsumer: A functional interface that takes two inputs and performs an action without returning a result.
        BiConsumer<String, Integer> printNameAndAge = (name, age) -> 
            System.out.println("BiConsumer Interface: Name: " + name + ", Age: " + age);
        printNameAndAge.accept("Alice", 30); // Name: Alice, Age: 30

        //! Supplier: A functional interface that takes no input and produces an output.
        Supplier<String> getHelloWorld = () -> "Supplier Interface";
        System.out.println(getHelloWorld.get());

        //! UnaryOperator: A functional interface that takes a single input and produces an output of the same type.
        UnaryOperator<Integer> square = n -> n * n;
        System.out.println("UnaryOperator Interface: "+square.apply(4));

        //! BinaryOperator: A functional interface that takes two inputs of the same type and produces an output of the same type.
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println("BinaryOperator Interface: "+multiply.apply(3, 4));

        //! Method References: A shorthand notation of a lambda expression to call a method.
        List<String> names = List.of("Mack", "Jack", "Charlie");
        names.forEach(x -> System.out.println(x)); // Lambda expression to print each name
        names.forEach(System.out::println); // Method reference to print each name

        //! Constructor References: A shorthand notation of a lambda expression to call a constructor.
        List<String> list = Arrays.asList("A", "B", "C");
        list.stream().map(String::new).forEach(System.out::println); // Constructor reference
    }
}
