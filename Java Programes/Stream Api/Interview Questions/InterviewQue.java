
import java.util.List;

public class InterviewQue {
    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
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

    }
}