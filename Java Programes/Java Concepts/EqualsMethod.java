public class EqualsMethod {
    static String name = "mack";
    static String name2 = new String("mack");

    public static void main(String[] args) {
        System.out.println("Equal Method: " + name.equals(name2)); // Checks content equality
        System.out.println("== Operator: " + (name == name2)); // Checks reference equality
    }
}
