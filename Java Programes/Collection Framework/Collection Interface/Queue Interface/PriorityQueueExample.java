
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue();
        priorityQueue.offer(20);
        priorityQueue.offer(30);
        priorityQueue.offer(5);
        priorityQueue.offer(10);

        System.out.println("Priority Queue Elements: " + priorityQueue);
        priorityQueue.poll(); // Removes the head of the queue (the smallest element)
        System.out.println("Priority Queue after poll: " + priorityQueue);
        System.out.println("Front of the priority queue: " + priorityQueue.peek()); // Returns the head of the queue (the smallest element)
        System.out.println("Is priority queue empty: " + priorityQueue.isEmpty());
        System.out.println("Priority Queue size: " + priorityQueue.size());
        priorityQueue.clear(); // Removes all elements from the priority queue
        System.out.println("Priority Queue after clear: " + priorityQueue);
    }
}

/*
 > PriorityQueue(Interface): 
    PriorityQueue is a collection used to hold multiple elements prior to processing. 
    It follows the natural ordering of elements or a specified comparator.

 > Key Features of PriorityQueue:
    1. Does not allow null values
    2. Not synchronized (not thread-safe)
    3. Allows duplicate elements

 > Time Complexity:
    1. Access: O(1) for peek() method
    2. Search: O(n)
    3. Insertion: O(log n) for offer() method
    4. Deletion: O(log n) for poll() method
 */
