class StaticBlock {
    static {
        System.out.println("Static block 1");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }

    static {
        System.out.println("Static block 2");
    }
}

/*
  Usecase of Static keyword - Shared data accessible by all instances of the class, not specific to individual objects. Useful for storing constants, configuration values, or counters used throughout the program.
 */

