public class TryFinal {
    public static void main(String[] args) {
        try {
            System.out.println("Try Block");
            return;
        } finally {
            System.out.println("Finally Block");
        }
    }
}