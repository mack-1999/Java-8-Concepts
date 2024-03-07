import java.util.Arrays;

//! WAP to find out Min & Max elements from an Array.
public class Min_MaxElement {
    public static void main(String[] args){
        int[] arr = {8,3,4,5,1,2};

        Arrays.sort(arr);
        System.out.println("Array Elements: "+Arrays.toString(arr));
        System.out.println("Min Element is: "+arr[0]);
        System.out.println("Max Element is: "+arr[arr.length-1]);
    }
}
