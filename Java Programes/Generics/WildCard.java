public class WildCard {
    public static void main(String args[]) {
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.setItem(100);

        GenericBox<? extends Number> numBox = intBox;
        Number num = numBox.getItem();
        
        System.out.println("Number Value: " + num);
        System.out.println("Integer Value: " + intBox.getItem());

    }
}