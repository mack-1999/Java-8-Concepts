public class ParentReference {
    public String parentMethod() {
        return "Hello from Parent!";
    }
}

class Child extends ParentReference {
    public String childMethod() {
        return "Hello from Child!";
    }

    public static void main(String[] args) {
        ParentReference obj = new Child();

        //At compile-time, the Java compiler only looks at the reference type (here: Parent). Since childMethod() is not defined in Parent, the compiler throws an error — even though the object at runtime is a Child.

        //obj.childMethod();
        ((Child) obj).childMethod();  // Allowed (if obj is actually a Child at runtime)
        obj.parentMethod();
    }
}