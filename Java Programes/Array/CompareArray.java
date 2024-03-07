import java.util.Arrays;
//! WAP to Compare the elements of 2 different arrays
public class CompareArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 5, 1};
        //int[] arr2 = {2, 3, 4, 5, 1, 8};
        //int[] arr2 = {2, 3, 4, 5, 9};

        if(compare(arr1, arr2)){
            System.out.println("Both the array are equal");
        }else{
            System.out.println("Both the array are not equal");
        }
    }

    public static boolean compare(int[] a, int[] b){
        //! Find out length of arrays
        int arr1 = a.length;
        int arr2 = b.length;

        //! Compare the lengths of the two arrays & return false if they are not equal
        if(arr1 != arr2){
            return false;
        }

        //! Sort the arrays
        Arrays.sort(a);
        Arrays.sort(b);

        //! Compare elements of the two arrays & return false if they are not equal
        for(int i = 0; i < arr1; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        //! Will return true if they are equal
        return true;
    }
}
