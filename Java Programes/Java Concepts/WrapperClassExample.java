public class WrapperClassExample {
    public static void main(String[] args) {
        // Primitive data types
        int primitiveInt = 42;
        double primitiveDouble = 3.14;
        char primitiveChar = 'A';
        boolean primitiveBoolean = true;

        // Wrapper classes
        Integer wrapperInt = Integer.valueOf(primitiveInt); // Autoboxing
        Double wrapperDouble = Double.valueOf(primitiveDouble);
        Character wrapperChar = Character.valueOf(primitiveChar);
        Boolean wrapperBoolean = Boolean.valueOf(primitiveBoolean);

        // Autoboxing (converting primitive to wrapper)
        Float wrapperFloat = (float) primitiveDouble; // Automatically converts primitive double to Float object

        // Unboxing (converting wrapper to primitive)
        int unboxedInt = wrapperInt; // Automatically converts Integer object to primitive int

        // Printing values
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Wrapper Double: " + wrapperDouble);
        System.out.println("Wrapper Character: " + wrapperChar);
        System.out.println("Wrapper Boolean: " + wrapperBoolean);
        System.out.println("Wrapper Float: " + wrapperFloat);
    }
}

/*
 Wrapper classes:
    In Java provide a way to use primitive data types (int, char, boolean, etc.) as objects.

Advantages of using wrapper classes:
     1. Wrapper classes provide useful methods for converting between types and mainpulating data.
     2. They are used in collections like ArrayList, HashMap, etc. which can only store objects, not primitives.
*/