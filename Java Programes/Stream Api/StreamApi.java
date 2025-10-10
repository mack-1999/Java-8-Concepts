import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {     

        //! Different ways to create Stream

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Filter even numbers and collect them into a list
        List<Integer> evenNumber = numbers.stream().filter(x -> x % 2 ==0).toList();
        System.out.println("Even Numbers: "+evenNumber);

        String[] names = {"John", "Jane", "Jack", "Doe"};
        Stream<String> namesStream = Arrays.stream(names);
        System.out.println("Names:"+namesStream.toList());

        Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
        System.out.println("Number Stream: "+numberStream.toList());

    }
}

/* 
 Java 8 features: 
    Minimal code, funtional programming, Lambda expression, Stream API, Date and Time API, etc.

 Stream API: 
    Used to process collections of objects. 
    It allows us to perform operations like filtering, mapping, and reducing in a functional style. 
    Simplify Data processing.
    Improve code readability and maintainability.
    Enable parallel processing for better performance on large datasets.
*/