import java.util.Arrays;
import java.util.List;

public class IntermediteOperations {
    public static void main(String[] args) {
        
        // Filter Operation
        List<String> names = Arrays.asList("Aman", "Ankit", "Sumit", "Rohit", "Suresh", "Ramesh");
        List<String> filteredNames = names.stream().filter(x -> x.startsWith("A")).toList();
        System.out.println("Flitered Names: "+filteredNames);

        // Map Operation
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        // Sorted Operation
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2, 7);
        List<Integer> sortedNumbers = numbers.stream().sorted().toList(); //! terminal operation: toList()
        System.out.println("Sorted Numbers: "+sortedNumbers);

        // Distinct Operation
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> distinctNumbers = numbersWithDuplicates.stream().distinct().toList();
        System.out.println("Distinct Numbers: "+distinctNumbers);

    }
}

/*
 1. Filter: Used to filter elements based on a condition.
 2. Map: Used to transform elements.
 3. Sorted: Used to sort elements in natural order or based on a comparator.
 4. Distinct: Used to remove duplicate elements.
 5. Terminal operations: forEach, toList, collect, reduce, count, etc.
*/