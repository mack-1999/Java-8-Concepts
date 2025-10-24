
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreams {
    public static void main(String[] args) {
        // Normal stream
        long startTime = System.currentTimeMillis();
        List<Integer> numbersList = Stream.iterate(1, n -> n + 1).limit(20000).toList();
        List<Long> normalStream = numbersList.stream().map(ParallelStreams::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by Normal Stream: " + (endTime - startTime) + " ms");

        // Parallel stream
        startTime = System.currentTimeMillis();
        List<Long> parallelStream = numbersList.parallelStream().map(ParallelStreams::factorial).sequential().toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by Parallel Stream: " + (endTime - startTime) + " ms");
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

/*
 Parallel Streams
    1. It allows parallel processing of data using multiple threads, improving performance for large datasets.
    2. Are mostly effective for CPU-intensive operations on large datasets where tasks are //! independent.
    3. They may add overhead for small datasets due to thread management.
 */