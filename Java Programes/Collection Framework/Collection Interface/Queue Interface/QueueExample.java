
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.offer(20);
        queue.add(20);

        System.out.println("Queue Elements: " + queue);
        System.out.println("Front of the queue: " + queue.peek()); // Returns the front element
        System.out.println("Removed element: " + queue.poll()); // Removes (front element) and returns the front element
        System.out.println("Queue after poll: " + queue);
        System.out.println("Is queue empty: " + queue.isEmpty());
        System.out.println("Queue size: " + queue.size());
        queue.clear(); // Removes all elements from the queue
        System.out.println("Queue after clear: " + queue);
    }
}

/*
 > Queue(Interface): Queue is a collection used to hold multiple elements prior to processing. It follows the First-In-First-Out (FIFO) principle.

 > Key Features of Queue:
    1. First-In-First-Out (FIFO) principle
    2. Allows null values
    3. Not synchronized (not thread-safe)
    4. Allows duplicate elements

 > Time Complexity:
    1. Access: O(1) for peek() method
    2. Search: O(n)
    3. Insertion: O(1) for add() and offer() methods
    4. Deletion: O(1) for poll() method
 */