import java.util.Scanner;

class leap_year {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Year you want to check:");
        int Year = s.nextInt(); // For user input.
        /*
         * There are 2 condition for leap year as Below
         * 
         * 1. year should be divisible by 400 and its reminder should be 0.
         * 
         * 2. year should be divisible by 4 and its reminder should be 0 as well as it
         * should Not be divisible by 100.
         */

        if ((Year % 400 == 0) || (Year % 4 == 0 && Year % 100 != 0)) {
            System.out.println(Year + " is a Leap Year.");
        } else {
            System.out.println(Year + " is not a Leap year.");
        }
    }
}