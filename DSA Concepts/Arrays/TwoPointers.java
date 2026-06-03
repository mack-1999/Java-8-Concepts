public class TwoPointers {
    public static String checkPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(str.charAt(left) != str.charAt(right)){
                return "String is not palindrome";
            }
            left++;
            right--;
        }
        return "String is palindrome";
    }
    public static void main(String[] args) {
        String str = "maam";
        System.out.println(TwoPointers.checkPalindrome(str));
    }
}
/*
> Two pointers: 
    The Two Pointers pattern is used when you need to process an array or 
    string from both ends or maintain two positions that move at different speeds.

> Types:
    1. Oppsite Ends: pointers start at oppsite ends.
        Used for: Palindrome, Two sum(Sorted Array) & Container with most water.
    
    2. Same Direction: Both pointers move from left to right.

    3. Fast & Slow Pointer: One pointer moves faster than the other.
        Used for: Detect cycle in linked list, Find middle element & Happy Number.

    4. Sliding Window: Window represented by two pointers.
        Used for: Longest substring without repeating chars, Maximum sum subarray & Minimum window substring.
*/