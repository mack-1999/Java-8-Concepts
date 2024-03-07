class Mutliple_Catch{
    public static void main(String[] args) {
       try {
           int arr[] = new int[5];

           arr[5] = 30/0;
           System.out.println(arr[5]);
       } 
       catch (ArithmeticException e) {
           System.out.println("Arithmetic Exception");
       } 
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Array index out of bound");
       }
       catch (Exception e){
           System.out.println(e);
       }
       System.out.println("Program End");
    }
}