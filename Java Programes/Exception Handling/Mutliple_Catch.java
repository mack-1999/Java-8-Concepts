class Mutliple_Catch {
    public static void main(String[] args) {
        System.out.println(example());
    }

    public static int  example(){
        try {
            int value = 30 / 3;
            return value;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Program End");
        }
        return 0;
    }
}

/*

 Execution order:
    int value = 30 / 3; → executes normally
    return value; → return value is prepared, but not yet returned
    finally block executes → prints "Program End"
    Then the method returns the prepared value (10) & the main method prints it.

*/