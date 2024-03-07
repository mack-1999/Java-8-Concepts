public class ReverseAnArray {
    public static void main(String[] args) {
        // Original array
        int[] array = { 9, 4, 0, 5, 8 };

        // Reversing the array using the provided logic
        for (int i = 0; i < array.length / 2; i++) {
            //Swap the array for ex. 9 and 8
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        // Displaying the reversed array
        System.out.println("Reversed Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

    }
}
