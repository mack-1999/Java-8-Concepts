import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        Iterator<Integer> iterator = numbers.iterator();

        //! Fail-fast behavior: Modifying the collection while iterating will cause ConcurrentModificationException
        while(iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
            //! numbers.add(40); This will cause ConcurrentModificationException
        }

        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        map.put(1, 10);
        map.put(2, 40);

        Iterator<Integer> mapIterator = map.keySet().iterator();

        //! Fail-safe behavior: Modifying the collection while iterating will not cause ConcurrentModificationException
        while(mapIterator.hasNext()) {
            Integer key = mapIterator.next();
            System.out.println("Key: " + key + ", Value: " + map.get(key));
            map.put(3, 30); // This will not cause ConcurrentModificationException
        }
    }
}
