
import java.util.List;

public class InterviewQue {
    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        // Q1. How to find even numbers in a list?
        List<Integer> evenNumbers = numbers.stream().filter(num -> num % 2 ==0 ).toList();
        System.out.println("Even Numbers: "+evenNumbers);

        // Q2. How to find duplicate elements in a list?
        List<Integer> intNumbers = List.of(7,1,2,3,4,5,6,7,8,9,10,1,2,3,4);
        List<Integer> duplicaIntegers = numbers.stream().filter(i -> intNumbers.indexOf(i) != intNumbers.lastIndexOf(i)).toList();
        System.out.println("Duplicate Integers: "+duplicaIntegers);

    }
}