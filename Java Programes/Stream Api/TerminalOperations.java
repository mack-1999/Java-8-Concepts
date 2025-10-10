import java.util.Arrays;
import java.util.List;

public class TerminalOperations {
    public static void main(String[] args) {
        // forEach Operation
        List<String> names = Arrays.asList("Aman", "Ankit", "Sumit", "Rohit", "Suresh", "Ramesh");
        names.stream().forEach(System.out::println);

        // Count Operation
        long count = names.stream().filter(x -> x.startsWith("A")).count();
        System.out.println("Count of names starting with A: "+count);

        // Reduce Operation
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum of numbers: "+sum);

        // AnyMatch Operation
        boolean anyMatch = names.stream().anyMatch(x -> x.startsWith("S"));
        System.out.println("Any name starting with S: "+anyMatch);
         
        // AllMatch Operation
        boolean allMatch = names.stream().allMatch(x -> x.length() > 2);
        System.out.println("All names have length greater than 2: "+allMatch);

        // NoneMatch Operation
        boolean noneMatch = names.stream().noneMatch(x -> x.startsWith("Z"));
        System.out.println("No name starts with Z: "+noneMatch);

        // FindFirst Operation
        names.stream().findFirst().ifPresent(name -> System.out.println("First name: "+name));

        // FindAny Operation
        names.stream().findAny().ifPresent(name -> System.out.println("Any name: "+name));

        //Example
        System.out.println("Length greater than 5: "+names.stream().filter(x -> x.length() > 5).toList());

        List<Integer> numbersList = Arrays.asList(8, 6, 9, 2, 1, 4);
        System.out.println("Squares of Number: "+numbersList.stream().map(x -> x * x).sorted().toList());

        System.out.println("Sum of array: "+numbersList.stream().reduce(Integer::sum).get());

        String Sentence = "This is an example of Stream API in Java";
        long wordCount = Arrays.stream(Sentence.split(" ")).count();
        System.out.println("Word Count: "+wordCount);

        long charCount = Sentence.chars().filter(predicate -> predicate == 'a').count();
        System.out.println("Character 'a' Count: "+charCount);
        
    }
}

/*
 1. forEach: Used to perform an action for each element.
 2. Count: Used to count the number of elements.
 3. Reduce: Used to combine elements into a single result.
 4. NyMatch, AllMatch, NoneMatch: Used to check if any, all, or none of the elements match a given predicate.
 4. Other terminal operations: toList, collect, findFirst, findAny, etc.
*/