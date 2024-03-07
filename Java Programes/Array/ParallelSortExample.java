import java.util.Arrays;

public class ParallelSortExample {
    public static void main(String[] args) {
        // Creating an array of integers
        int[] numbers = {5, 2, 8, 1, 7, 3, 6, 4};

        // Using parallelSort to sort the array in parallel
        Arrays.parallelSort(numbers);

        // Displaying the sorted array
        System.out.println(Arrays.toString(numbers));
    }
}

//! Java 8 introduced the ability to perform parallel sorting of arrays using the Arrays.parallelSort method. This method uses the Fork/Join framework to divide the array into smaller tasks and sorts them in parallel, potentially providing better performance on large arrays.