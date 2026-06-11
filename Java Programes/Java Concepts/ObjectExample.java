class One{
    public void m1(){
        System.out.println("Within class one");
    }
}

class Two{
    public void m2(){
        System.out.println("Within class two");
    }
}

public class ObjectExample {
    public static void main(String[] args) {
        One one = new One();
        Two two = new Two();
        Object obj = new Two();

        one.m1();
        // one.m2();
        one.toString();
        two.m2();
        // two.m1();
        // obj.m1();
        // obj.m2();
        obj.toString();

        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = obj1;

        System.out.println(obj1.equals(obj2)); // false, because Object class's equals() method compares memory addresses
        System.out.println(obj1.equals(obj3)); // true, because obj3 references the same object as obj1

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(str1.equals(str2)); // true, because String class overrides equals() method
    }
}
