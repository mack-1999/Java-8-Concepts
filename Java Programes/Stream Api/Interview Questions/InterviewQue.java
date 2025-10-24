
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class InterviewQue {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> intNumbers = List.of(7,1,2,3,4,5,6,7,8,9,10,1,2,3,4);

        //todo: Q1. How to find even numbers in a list?
        List<Integer> evenNumbers = numbers.stream().filter(num -> num % 2 ==0 ).toList();
        //System.out.println("Even Numbers: "+evenNumbers);

        //todo: Q2. How to find duplicate elements in a list?
        List<Integer> duplicaIntegers = numbers.stream().filter(i -> intNumbers.indexOf(i) != intNumbers.lastIndexOf(i)).toList();
        //System.out.println("Duplicate Integers: "+duplicaIntegers);

        //todo: Q3. How to find the second highest number in a list?
        Integer secondHighest = intNumbers.stream().sorted((a,b) -> b.compareTo(a)).skip(1).findFirst().orElse(null);
        //System.out.println("Second Highest: "+secondHighest);

        //todo: Q4. Square of all numbers in a list?
        List<Integer> intSquare = numbers.stream().map(num -> num * num).toList();
        //System.out.println("Square of all numbers: "+intSquare);

        //todo: Q5. Merge two arrays, sort them, print only unique numbers
        int[] arr1 = {5, 3, 9, 1, 3};
        int[] arr2 = {8, 3, 5, 2, 9, 7};

        int[] mergedUniqueSorted = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                                            .distinct()   // remove duplicates
                                            .sorted()     // sort the elements
                                            .toArray();   // convert back to array

        //System.out.println("Unique sorted elements: " + Arrays.toString(mergedUniqueSorted));
    }
}