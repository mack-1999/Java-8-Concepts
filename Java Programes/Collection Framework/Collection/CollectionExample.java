import java.util.ArrayList;
import java.util.HashSet;

public class CollectionExample {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(); //! List -> ArrayList

        al.add("Hello");
        al.add(10);
        al.add(true);

        for (Object elements : al) {
            System.out.println("Arraylist Elements: "+elements);
        }

        HashSet hs = new HashSet(); //! Set -> HashSet

        hs.add("Mack");
        hs.add("Jack");
        hs.add("John");

        for (Object e : hs) {
            System.out.println("Elements of HashSet: "+e);
        }
    }
}
