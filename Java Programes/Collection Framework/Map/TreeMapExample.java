
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1, 5);
        treeMap.put(4, 10);
        treeMap.put(3, 15);
        treeMap.put(2, 20);

        for (Integer key : treeMap.keySet()) {
            Integer value = treeMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}

/*
 > TreeMap Class: It is a Red-Black tree based implementation of the Map interface.
   It is sorted according to the natural ordering of its keys.

 > Key Features of TreeMap:
    1. Does not allow null keys (throws NullPointerException)
    2. Allows null values
    3. Sorted in natural order (ascending order for numbers)
    4. Not synchronized (not thread-safe)
    5. Time Complexity:
        Access: O(log n), Search: O(log n), Insertion: O(log n), Deletion: O(log n)

 > TreeMap internally uses a Red-Black tree to store the elements, which ensures that the keys are always sorted.
*/