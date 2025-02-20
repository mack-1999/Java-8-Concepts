class MathUtils {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class OverLoading {
    public static void main(String[] args) {
        MathUtils obj = new MathUtils();
        System.out.println(obj.add(5, 10));       // Calls int version
        System.out.println(obj.add(5.5, 2.2));   // Calls double version
    }
}
/* Compile-time (Static) Polymorphism → Method Overloading
Same method name, different parameters (number, type, or order).
Resolved at compile-time. */
