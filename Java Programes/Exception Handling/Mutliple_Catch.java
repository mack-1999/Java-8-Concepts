class Mutliple_Catch {
    public static void main(String[] args) {
        try {
            int value = 30 / 0; // ArithmeticException
            System.out.println(value);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Program End");
        }
    }
}