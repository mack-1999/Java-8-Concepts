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
        Integer nullableInt = null; // Wrapper classes can be null, unlike primitives

        // Autoboxing (converting primitive to wrapper)
        Float wrapperFloat = (float) primitiveDouble; // Automatically converts primitive double to Float object

        // Unboxing (converting wrapper to primitive)
        int unboxedInt = wrapperInt; // Automatically converts Integer object to primitive int

        int parsedInt = Integer.parseInt("123"); // Converts string to integer

        // Printing values
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Wrapper Double: " + wrapperDouble);
        System.out.println("Wrapper Character: " + wrapperChar);
        System.out.println("Wrapper Boolean: " + wrapperBoolean);
        System.out.println("Wrapper Float: " + wrapperFloat);
        System.out.println("Parsed Integer: " + parsedInt);

        Integer num1 = new Integer(127);
        Integer num2 = new Integer(127);
        System.out.println(num1 == num2); //Output 1

        Integer num3 = 127;
        Integer num4 = 127;
        System.out.println(num3 == num4); //Output 2

        Integer num5 = 500;
        Integer num6 = 500;
        System.out.println(num5 == num6); //Output 3
    }
}

/*
 Wrapper classes:
    Java provide a way to use primitive data types (int, char, boolean, etc.) as objects.

Advantages of using wrapper classes:
     1. Wrapper classes provide useful methods for converting between types and mainpulating data.
     2. They are used in collections like ArrayList, HashMap, etc. which can only store objects, not primitives.
*/