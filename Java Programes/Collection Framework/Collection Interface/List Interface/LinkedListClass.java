import java.util.LinkedList;
public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.addFirst(5); // addFirst() method is used to insert the element at the beginning of the list
        list.add(10);
        list.add(60);
        list.set(1, 50); //! set() method is used to replace the element at specified index
        list.add(1, 30); // add() method with index is used to insert the element at specified index
        list.addLast(70); // addLast() method is used to insert the element at the end of the list

        System.out.println("List Size: "+list.size());

        for(int elements: list){
            System.out.println("LinkedList Elements: "+elements);
        }
    }   
}

/* 
 > List(Interface): LinkedList(Class) is resizeable ordered collection & allows duplicates.

 > Key Features of List Interface:
    1. Ordered Collection
    2. Allows Duplicates
    3. Index based access
    4. Allows null values

 > LinkedList internally uses Doubly Linked List to store the elements.
 > Each element in a LinkedList is called a node, which contains three fields: data, a reference to the next node, and a reference to the previous node.
 > LinkedList is not synchronized (not thread-safe).
 > Time Complexity:
    1. Access: O(n)
    2. Search: O(n)
    3. Insertion: O(1)
    4. Deletion: O(1)

> Difference between ArrayList and LinkedList:
    1. ArrayList internally uses Dynamic Array to store the elements, while LinkedList uses Doubly Linked List.
    2. In ArrayList, the elements can be accessed directly using the index, while in LinkedList, the elements are accessed sequentially.
    3. Insertion and deletion operations are faster in LinkedList compared to ArrayList, as in ArrayList, the elements need to be shifted.
    4. ArrayList is more memory efficient than LinkedList, as LinkedList requires extra memory for storing the references to the next and previous nodes.
 */