import java.util.Arrays;
import java.util.List;

public class IntermediteOperations {
    public static void main(String[] args) {
        
        // Filter Operation: Used to filter elements based on a condition
        List<String> names = Arrays.asList("Aman", "Ankit", "Sumit", "Rohit", "Suresh", "Ramesh");
        List<String> filteredNames = names.stream().filter(x -> x.startsWith("A")).toList();
        System.out.println("Flitered Names: "+filteredNames);

        // Map Operation: Change an element to another form
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        // Sorted Operation: Used to sort elements in natural order or based on a comparator
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2, 7);
        List<Integer> sortedNumbers = numbers.stream().sorted().toList(); //! terminal operation: toList()
        System.out.println("Sorted Numbers: "+sortedNumbers);

        // Distinct Operation: Used to remove duplicate elements
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> distinctNumbers = numbersWithDuplicates.stream().distinct().toList();
        System.out.println("Distinct Numbers: "+distinctNumbers);

        // Peek Operation (mainly used for debugging): Used to perform an action on each element
        names.stream().peek(System.out::println).map(String::toLowerCase).toList();

        // Limit Operation: Used to limit the number of elements
        List<Integer> limitedNumbers = numbers.stream().limit(3).toList();
        System.out.println("Limited Numbers: "+limitedNumbers);

        // Skip Operation: Used to skip a number of elements
        List<Integer> skippedNumbers = numbers.stream().skip(2).toList();
        System.out.println("Skipped Numbers: "+skippedNumbers);

        // FlatMap Operation: Used to flatten a stream of collections into a single stream
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("Orange", "Apple"),
            Arrays.asList("Banana", "Grapes"),
            Arrays.asList("Pineapple", "Mango")
        );
        System.out.println("List of Lists: "+listOfLists);
        List<String> flatMapList = listOfLists.stream().flatMap(x -> x.stream()).toList();
        System.out.println("FlatMapped List: "+flatMapList);

    }
}