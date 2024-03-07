import java.util.Scanner;

public class ATM_Machine extends Thread{

    static int User_Pin = 1999;
    static double Balance = 20000.00;
    static String Name = "Makarand Nikam";

    private static void withDrawal(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to be Withdrawal: ");
        double WithDrawal = sc.nextDouble();

        try {
            if(WithDrawal > Balance || Balance == 0){
                System.out.println("Insufficient Balance");
            }
            else{
                System.out.println("Amount Processing...");
                Thread.sleep(5000);
                Balance -= WithDrawal;
                System.out.println("Withdarwal Successful\nRemaining Balance: "+Balance);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("***ATM Machine***");

        System.out.print("Please enter your ATM pin: ");
        int Entered_Pin = sc.nextInt();

        if(Entered_Pin == User_Pin){
            System.out.println("Wlecome "+Name);
            System.out.println("\nPlease Select your option \n 1. Withdrawal \n 2. Check Balance");
            int choice = sc.nextInt();

            if(choice == 1){
                ATM_Machine.withDrawal();
            }else if(choice == 2){
                System.out.println("Available Balance: "+Balance);
            }else{
                System.out.println("Invalid Option");
            }
        }else{
            System.out.println("Invalid Pin");
        }
        sc.close();
    }
}