class BasicPrinter implements Machine {
    public void print() {
        System.out.println("Printing...");
    }
    public void scan() {  // Not supported
        throw new UnsupportedOperationException();
    }
    public void fax() {   // Not supported
        throw new UnsupportedOperationException();
    }
}

//Problem: BasicPrinter is forced to implement methods it doesn’t need.