import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("apple", 10);
        myMap.put("banana", 15);
        myMap.put("cherry", 20);
        myMap.put("pineapple", 25);

        myMap.remove("banana");

        // Traversing using for-each loop over the entry set
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        System.out.println("Check for key 'apple': " + myMap.containsKey("apple"));
        System.out.println("Check for value 40: " + myMap.containsValue(40));
    }
}

/*
 > Map Interface: It is an object that maps keys to values, with on duplicate keys allowed.

 > Key Features of Map Interface:
    1. Allows null values and one null key
    2. Unordered
    3. Not synchronized (not thread-safe)
    4. Time Complexity:
        Access: O(1), Search: O(1), Insertion: O(1), Deletion: O(1)

 > Initial capacity of HashMap is 16 with load factor 0.75
 > HashMap internally uses Hash Table to store the elements.

 > Basic Component of HashMap:
    1. Key: Unique identifier for each entry
    2. Value: Data associated with the key
    3. Bucket: Array element where the key-value pair is stored
    4. Hash Function: Converts the key into an index (bucket location) for storage
*/
