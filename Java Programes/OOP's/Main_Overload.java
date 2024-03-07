public class Main_Overload{
    public void M1(){
        System.out.println("Method 1");
    }
    public void M2(){
        System.out.println("Method 2");
    }

    public static void main(String[] args) {
        Main_Overload obj = new Main_Overload();
        obj.M1();
        obj.M2();
        Main_Overload.main('M');
    }
    
    //invoked when a char is passed  
    public static void main(char args) {
        System.out.println("Overloaded main() method invoked that parses a char argument");   
    }
}