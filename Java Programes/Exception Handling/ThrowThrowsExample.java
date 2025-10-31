class ThrowThrowsExample {
    static void checkAge(int age) throws Exception {
        if (age < 18)
            throw new Exception("Not eligible to vote"); // using throw
        else
            System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
