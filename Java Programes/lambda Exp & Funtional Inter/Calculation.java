//@FunctionalInterface
interface Calculation {

    //! An Interface that contains only one abstract method is known as functional interface.
    //! By Default, ever method in an interface is abstract.
    public int operator(int a, int b);

    //! Java 8 introduced default and static methods in interfaces, and functional interfaces can have any number of these.
    public static int sub(int a, int b) {
        return a - b;
    }

    //! Default method with implementation
    default void greetAll() {
        System.out.println("Hello to everyone!");
    }
}
