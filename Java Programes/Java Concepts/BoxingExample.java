public class BoxingExample {
    public static void main(String[] args) {
        // Manual Boxing
        int primitiveInt = 5;
        Integer boxedInt = new Integer(primitiveInt); // Manual boxing

        // Autoboxing
        Integer autoBoxedInt = 10; // Automatically boxes int to Integer

        //Unboxing
        int unboxingInt = autoBoxedInt;

        System.out.println("Manually boxed Integer: " + boxedInt);
        System.out.println("Autoboxed Integer: " + autoBoxedInt);
        System.out.println("Unboxing Integer: "+ unboxingInt);

        String strInt = "100";
        String strDouble = "45.67";

        //Wrapper Classes
        int intValue = Integer.parseInt(strInt);
        double doubleValue = Double.parseDouble(strDouble);

        System.out.println("Converted int: " + intValue);
        System.out.println("Converted double: " + doubleValue);
    }
}

//? Boxing is the process of converting a primitive type into its corresponding wrapper class.

//? Unboxing is the reverse process, where you convert an object of a wrapper class back into its corresponding primitive type.