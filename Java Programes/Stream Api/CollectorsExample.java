
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {

        //! 1. Collecting to List
        List<String> names = Arrays.asList("Mack", "John", "Bob", "Jack");
        var filteredNames = names.stream().filter(name -> name.startsWith("J")).collect(Collectors.toList());
        System.out.println("Filtered Names: " + filteredNames);

        //! 2. Collecting to Set
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
        var uniqueNumbers = numbers.stream().collect(Collectors.toSet());
        System.out.println("Unique Numbers: " + uniqueNumbers);

        //! 3. Joining Strings
        List<String> words = Arrays.asList("Hello", "world", "mack");
        var joinedString = words.stream().collect(Collectors.joining(" "));
        System.out.println("Joined String: " + joinedString);

        //! 4. Averaging Numbers
        var average = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average: " + average);

        //! 5. Counting Elements
        var count = names.stream().collect(Collectors.counting());
        System.out.println("Count of Names: " + count);

    }
}