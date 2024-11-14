@FunctionalInterface
interface AddInterface {

    // ! An Interface that contains only one abstract method is known as functional interface.
    public abstract int add(int a, int b);

    // Java 8 introduced default and static methods in interfaces, and functional interfaces can have any number of these.
    // ! It can have any number of default and static methods.
    public static int sub(int a, int b) {
        return a - b;
    }

    //! Default method with implementation
    default void greetAll() {
        System.out.println("Hello to everyone!");
    }
}
