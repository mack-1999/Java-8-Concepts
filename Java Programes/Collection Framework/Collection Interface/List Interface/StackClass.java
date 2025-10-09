
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.add(40); // add() method is inherited from Vector class

        System.out.println("Stack: " + stack);
        System.out.println("Popped element: " + stack.pop()); // Removes and returns the top element
        System.out.println("Stack after pop: " + stack);
        System.out.println("Top element: " + stack.peek()); // Returns the top element without removing it
        System.out.println("Is stack empty: " + stack.isEmpty()); // Checks if the stack is empty
        System.out.println("Stack size: " + stack.size());  // Returns the number of elements in the stack
        System.out.println("Stack Capacity: " + stack.capacity()); // Capacity method is inherited from Vector class
    }
}

/*
 > List(Interface): Stack(Class) is a subclass of Vector that implements a standard last-in, first-out stack.
 > Stack internally uses Dynamic Array to store the elements.
 > Stack extends Vector and provides methods to operate on a stack data structure.
 > Initial capacity of Stack is 10.
 > When the number of elements exceeds the capacity, it creates a new array with double the capacity and copies all the elements to it.

 > Key Features of Stack:
    1. Last-In-First-Out (LIFO) principle
    2. Dynamic Sizing
    3. Synchronized (thread-safe)
    4. Allows null values
 */