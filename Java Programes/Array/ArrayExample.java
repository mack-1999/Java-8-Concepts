public class ArrayExample {
    public static void main(String args[]) {

        // ! Primitive & Object type array in java
        int[] primitive = new int[5];
        Integer[] arrayObject = new Integer[5];

        for (int i = 0; i < primitive.length; i++) {
            primitive[i] = i * 10 + 10;
        }

        for (Integer values : primitive) {
            System.out.println(values);
        }

    }
}
