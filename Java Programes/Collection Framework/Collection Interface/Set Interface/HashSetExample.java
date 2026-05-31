import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(20); //! Duplicate element, will not be added due to similar hash code
        hashSet.add(null); //! HashSet allows only one null value

        System.out.println("HashSet Elements: "+hashSet);
    }
}

/*
> Set(Interface): HashSet(Class) is an unordered collection that does not allow duplicates.

> Key Features of Set Interface:
    1. Unordered Collection
    2. Does not allow duplicates
    3. Allows null values (only one null value)
    4. No index based access (does not maintain insertion order)

> HashSet is not synchronized (not thread-safe).
> //! HashSet internally uses a hash table to store the elements.
> When an element is added to the HashSet, it calculates the hash code of the element and determines the bucket location to store the element.
> If two elements have the same hash code, they will be stored in the same bucket, 
  and the HashSet will use the equals() method to determine if the elements are duplicates or not.

> Time Complexity:
    1. Access: O(1)
    2. Search: O(1)
    3. Insertion: O(1)
    4. Deletion: O(1)
*/