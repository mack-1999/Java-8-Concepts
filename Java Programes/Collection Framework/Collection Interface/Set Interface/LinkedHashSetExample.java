
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Apple"); // Duplicate element, will not be added

        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}

/*
> LinkedHashSet is a collection that contains no duplicate elements and maintains the insertion order.
> It is implemented as a hash table and linked list, which allows it to maintain the order of elements while providing 
  constant-time performance for basic operations like add, remove, and contains.

> Key features of LinkedHashSet:
    1. No duplicate elements
    2. Maintains insertion order
    3. Not synchronized (not thread-safe)
    4. Allows null elements (only one null element can be added)
*/