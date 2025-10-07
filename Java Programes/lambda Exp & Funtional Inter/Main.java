public class Main {
    public static void main(String[] args) {
        //! Ways to call Functional interface

        //1: Using Implemention class
        AddInterImpl obj = new AddInterImpl();
        obj.greetAll();
        System.out.println("Using Implemention class: " + obj.operator(10, 20));

        //2: Using anonymous class
        calculation obj2 = new calculation() {
            @Override
            public int operator(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Using anonymous class: " + obj2.operator(10, 10));

        //3: Using lambda Expression
        // We're using a lambda to create an inline implementation of a functional interface that multiply two integers.
        //! We’re creating an object of a class (generated internally by the JVM) that implements the calculation interface.
        //! obj3 doesn’t hold an int; it holds a functional interface reference whose method returns an int.
        calculation obj3 = (a, b) -> a * b;
        System.out.println("Using lambda Expression: " + obj3.operator(10, 30));
    }
}
