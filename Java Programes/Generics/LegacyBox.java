class LegacyBox {
    private Object item;

    public void setItem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }

    public static void main(String[] args) {
        LegacyBox legacyBox = new LegacyBox();

        // Storing an Integer
        legacyBox.setItem(123);
        Integer intValue = (Integer) legacyBox.getItem();
        System.out.println("Integer Value: " + intValue);

        // Storing a String
        legacyBox.setItem("Hello, Generics!");
        String strValue = (String) legacyBox.getItem();
        System.out.println("String Value: " + strValue);

        // Storing a Double
        legacyBox.setItem(45.67);
        int doubleValue = (int) legacyBox.getItem(); //! This will cause a ClassCastException
        System.out.println("Double Value: " + doubleValue);
    }
}