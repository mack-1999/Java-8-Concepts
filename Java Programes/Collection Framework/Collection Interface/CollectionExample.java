import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionExample {
    public static void main(String[] args) {
        List al = new ArrayList(); //! List -> ArrayList is Ordered collection & allows duplicates

        al.add(0, "Hello"); // list stores data based on index
        al.add(10);
        al.add(true);

        for (Object elements : al) {
            System.out.println("Arraylist Elements: "+elements);
        }

        Set hs = new HashSet(); //! Set -> HashSet is Unordered collection & no duplicates

        hs.add("Mack"); // predefined add() collection interface method
        hs.add("Jack"); // Set dose not stores elements based on index
        hs.add("Rutu");

        hs.remove("Jack"); // predefined remove() collection interface method

        for (Object e : hs) {
            System.out.println("Elements of HashSet: "+e);
        }
    }
}
