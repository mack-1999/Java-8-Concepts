import java.util.Arrays;

public class TwoSum {
    public static int[] checkSum(int[] arr, int targetedValue){
        //Oppsite Ends
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int sum = arr[left] + arr[right];

            if (sum == targetedValue) {
                return new int[]{left, right};
            } else if(sum > targetedValue) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,8,10};
        int targetedValue = 7;
        System.out.println("Given Sorted Array: "+Arrays.toString(arr));
        System.out.println(Arrays.toString(TwoSum.checkSum(arr, targetedValue)));
    }
}
