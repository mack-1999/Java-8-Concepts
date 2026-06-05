public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("StringBuffer");

        System.out.println("Output: "+str);
    }
}

/*
> StringBuffer is a mutable sequence of characters. 
  It is used to create and manipulate strings that can be modified after they are created. 
  StringBuffer allows you to change the content of the string without creating a new object.
  Thread-safe: StringBuffer is synchronized, which means it is thread-safe and can be used in multi-threaded environments.

  > Methods of StringBuffer:
    1. append(): This method is used to add text to the end of the existing string.
    2. insert(): This method is used to insert text at a specific position in the string.
    3. delete(): This method is used to remove a portion of the string.
    4. reverse(): This method is used to reverse the characters in the string.
    5. length(): This method returns the length of the string.
    6. toString(): This method converts the StringBuffer to a String.
  
*/