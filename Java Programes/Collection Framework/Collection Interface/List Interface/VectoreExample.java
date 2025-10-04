
import java.util.Vector;

public class VectoreExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector(5, 3); // initial capacity is 5 & increment is 3
        vector.add(10);
        vector.add(20);
        vector.set(1, 50); // set() method is used to replace the element at specified index
        vector.add(1, 30); // add() method with index is used to insert the element at specified index
        vector.add(60);
        vector.add(70);
        vector.add(80); // when we add 6th element, it will create new array with 8 (5+3) capacity

        System.out.println("Vector Size: "+vector.size());
        System.out.println("Vector Capacity: "+vector.capacity());
        for(int elements: vector){
            System.out.println("Vector Elements: "+elements);
        }
        System.out.println("Element at Index 2: "+vector.get(2));
    }
}

/* 
 > List(Interface): Vector(Class) is resizeable ordered collection & allows duplicates.

 > Key Features of List Interface:
    1. Ordered Collection
    2. Allows Duplicates
    3. Index based access
    4. Allows null values

 > Initial capacity of Vector is 10.
 > Vector internally uses Dynamic Array to store the elements.
 > When the number of elements exceeds the capacity, it creates a new array with double the capacity and copies all the elements to it.
 > Vector is synchronized (thread-safe), only one thread can access at a time.
 > Time Complexity:
    1. Access: O(1)
    2. Search: O(n)
    3. Insertion: O(n)
    4. Deletion: O(n)

> Difference between ArrayList and Vector:
    1. ArrayList is not synchronized (not thread-safe), while Vector is synchronized (thread-safe).
    2. In ArrayList, the elements can be accessed directly using the index, while in Vector, the elements are accessed sequentially.
    3. Insertion and deletion operations are faster in ArrayList compared to Vector, as in Vector, the elements need to be shifted.
    4. ArrayList is more memory efficient than Vector, as Vector requires extra memory for synchronization.
 */