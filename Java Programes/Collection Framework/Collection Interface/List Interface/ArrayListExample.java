import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        // list.add("Mack"); // we can add different types of data
        list.set(1, 50); // set() method is used to replace the element at specified index

        System.out.println("List Size: "+list.size());

        for(int elements: list){
            System.out.println("1. Arraylist Elements: "+elements);
        }

        List al = new ArrayList(); // Object type ArrayList
        al.add(0, "Hello"); //Store data based on index
        al.add(10);
        al.add(true);

        //forEach loop
        for (Object elements: al) {
            System.out.println("2. Arraylist Elements: "+elements);
        }


        List<String> names = Arrays.asList("Mack", "John", "Smith");
        // names.add("Will"); // UnsupportedOperationException
        System.out.println("Names List: "+names);
        System.out.println("Names List Size: "+names.size());
        System.err.println("Class Name:"+names.getClass().getName());
    }
}

/* 
 > List(Interface): ArrayList(Class) is resizeable ordered collection & allows duplicates.

 > Key Features of List Interface:
    1. Ordered Collection
    2. Allows Duplicates
    3. Index based access
    4. Allows null values

 > Initianal capacity of ArrayList is 10.
 > ArrayList internally uses Dynamic Array to store the elements.
 > When the number of elements exceeds the capacity, it creates a new array with 50% more capacity and copies all the elements to it.
 > ArrayList is not synchronized (not thread-safe).
 > Time Complexity:
    1. Access: O(1)
    2. Search: O(n)
    3. Insertion: O(n)
    4. Deletion: O(n)
 */
