package String;
public class StringsAreRotation {
    public static void main(String[] args) {
        String one = "ABCD";
        String two = "CDAB";
        // String two = "CDAQ";
        // String two = "ABCD";

        if(isRotation(one, two)){
            System.out.println("String is Rotation");
        }else{
            System.out.println("String is not Rotation");
        }
    }

    public static boolean isRotation(String one, String two){
        return (one.length() == two.length()) && ((one + one).indexOf(two) != -1) && (one != two);
    }
}
