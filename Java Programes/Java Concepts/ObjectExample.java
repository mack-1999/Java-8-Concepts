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
    }
}
