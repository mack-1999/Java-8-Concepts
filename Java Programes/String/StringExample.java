package String;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "Mack"; //! String literals: Gets stored into string pool
        String s2 = new String("Mack"); //! Gets stored into Heap
        String s3 = s1.intern(); //! assign to string pool value
        String s4 = new String("Mack");
        
        System.out.println(s1 == s2); //? False due to memory location is different
        System.out.println(s1 == s3); // True due to reference is same
        System.out.println(s2 == s4); //? False due to stored differently in heap
        System.out.println(s2.equals(s4)); // True due to it will compare values
        System.out.println(s1.equals(s4)); //? True due to it will compare values
    }
}

//! == Compares reference
//! equals() Compares values