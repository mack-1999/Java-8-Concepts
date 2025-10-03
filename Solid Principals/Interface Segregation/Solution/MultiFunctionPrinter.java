
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface Fax {
    void fax();
}

@SuppressWarnings("unused")
class MultiFunctionPrinter implements Printer, Scanner, Fax {

    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing...");
    }
}

// Each client depends only on the functionality it actually needs.