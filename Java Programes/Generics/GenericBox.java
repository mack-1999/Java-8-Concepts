public class GenericBox<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.setItem(123);
        System.out.println("Integer Value: " + intBox.getItem());

        GenericBox<String> strBox = new GenericBox<>();
        strBox.setItem("Hello, Generics!");
        System.out.println("String Value: " + strBox.getItem());

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.setItem(45.35);
        System.out.println("Double Value: " + doubleBox.getItem());
    }
}

/*
 Generics: It allows you to create classes, interfaces & methods with a placeholder for the data type.

 Advantages of Using Generics:
    1. Type Safety: Generics provide compile-time type checking, reducing the risk of ClassCastException.
    2. Code Reusability: The same class can be used with different data types.
    3. Cleaner Code: Eliminates the need for explicit type casting.
 */
