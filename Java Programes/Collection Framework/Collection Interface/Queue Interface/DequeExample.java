
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offer(10); // Adds element to the end of the deque
        deque.offer(20);
        deque.offerFirst(5); // Adds element to the front of the deque
        deque.offerLast(30); // Adds element to the end of the deque

        System.out.println("Deque Elements: " + deque);

        System.out.println("Front of the deque: " + deque.peekFirst()); // Returns the front element
        System.out.println("End of the deque: " + deque.peekLast()); // Returns the end element
        System.out.println("Removed front element: " + deque.pollFirst()); // Removes and returns the front element
        System.out.println("Removed end element: " + deque.pollLast()); // Removes and returns the end element
        System.out.println("Deque after polling: " + deque);
    }
}

/*
 > Deque(Interface): 
    Deque (Double Ended Queue) is a collection used to hold multiple elements prior to processing. 
    It allows insertion and removal of elements from both ends.

 > Key Features of Deque:
    1. Allows insertion and removal from both ends
    2. Not synchronized (not thread-safe)
    3. Allows duplicate elements

 > Time Complexity:
    1. Access: O(1) for peekFirst() and peekLast() methods
    2. Search: O(n)
    3. Insertion: O(1) for offerFirst() and offerLast() methods
    4. Deletion: O(1) for pollFirst() and pollLast() methods
 */