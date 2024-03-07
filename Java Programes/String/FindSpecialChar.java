package String;
//! WAP to count no. occurrences of special characters in given string & remove a perticular character from the string
public class FindSpecialChar {
    public static void main(String[] args) {
        String string = "Mack@nikam *1999!";

        int count = 0;
        String specialCharRemoved = "";

        for(int i = 0; i < string.length(); i++){
            if(!Character.isLetter(string.charAt(i)) && !Character.isDigit(string.charAt(i)) && !Character.isWhitespace(string.charAt(i))){
                count++;
            }else{
                specialCharRemoved += string.charAt(i);
            }
        }
        if(count == 0){
            System.out.println("No Special Characters found");
        }else{
            System.out.println("Special Characters found: "+count);
        }

        System.out.println("specialCharRemoved: "+specialCharRemoved);
    }
}
