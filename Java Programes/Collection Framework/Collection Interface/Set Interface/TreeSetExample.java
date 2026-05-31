
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(30);
        treeSet.add(2);
        treeSet.add(10);

        System.out.println("TreeSet Elements: "+treeSet);
    }
}

/*
> TreeSet(Class) is a sorted collection that does not allow duplicates.

> Key Features of TreeSet:
    1. Sorted Collection (elements are stored in natural order)
    2. Does not allow null values (throws NullPointerException)
    3. No index based access (does not maintain insertion order)
    4. TreeSet is not synchronized (not thread-safe).
    
> //! TreeSet internally uses a Red-Black tree to store the elements.
> When an element is added to the TreeSet, it is compared with the existing elements using the compareTo() method 
  (or a custom Comparator) to determine its position in the tree.
> If two elements are considered equal (compareTo() returns 0), the new element will not be added to the TreeSet.

> Time Complexity:
    1. Access: O(log n)
    2. Search: O(log n)
    3. Insertion: O(log n)
    4. Deletion: O(log n)

*/