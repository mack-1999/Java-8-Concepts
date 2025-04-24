class ParentClass {
    static void show() {
        System.out.println("Parent show()");
    }
}
    
class ChildClass extends ParentClass {
    static void show() { // This is NOT overriding, it's method hiding
        System.out.println("Child show()");
    }
}
    
public class MethodHiding {
    public static void main(String[] args) {
        ParentClass obj = new ChildClass();
        obj.show(); // Output: Parent show()
    }
}
    
// Even though obj is a Child object, the call to show() invokes the Parent version. That's because static methods are resolved at compile time, not at runtime ? this is called method hiding, not overriding.