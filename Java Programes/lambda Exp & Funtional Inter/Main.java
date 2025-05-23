public class Main {
    public static void main(String[] args) {
        //! Ways to call Functional interface
        //1: Using Implemention class
        AddInterImpl obj = new AddInterImpl();
        obj.greetAll();
        System.out.println("Using Implemention class: "+obj.add(10, 20));

        //2: Using anonymous class
        AddInterface obj2 = new AddInterface() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        System.out.println("Using anonymous class: "+obj2.add(10, 10));

        //3: Using lambda Expression
        // We're using a lambda to create an inline implementation of a functional interface that adds two integers.
        AddInterface obj3 = (a, b) -> a+b;
        System.out.println("Using lambda Expression: "+obj3.add(10, 30));
    }
}