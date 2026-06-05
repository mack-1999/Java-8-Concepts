public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("StringBuilder");

        System.out.println("Output: "+str);
    }
}
/*
> StringBuilder is also a mutable sequence of characters, similar to StringBuffer. 
  StringBuilder is not synchronized, which means it is not thread-safe and should not be used in multi-threaded environments. 
  StringBuilder is generally faster than StringBuffer because it does not have the overhead of synchronization.

  > Methods of StringBuilder:
    1. append(): This method is used to add text to the end of the existing string.
    2. insert(): This method is used to insert text at a specific position in the string.
    3. delete(): This method is used to remove a portion of the string.
    4. reverse(): This method is used to reverse the characters in the string.
    5. length(): This method returns the length of the string.
    6. toString(): This method converts the StringBuilder to a String.

*/