class Bird {
    void fly() {
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow flies fast");
    }
}

class Ostrich extends Bird {
    @Override
    void fly() {  
        // Ostrich cannot fly!
        throw new UnsupportedOperationException("Ostrich can't fly");
    }
}

//Problem: Ostrich violates Liskov Substitution Principle because it cannot replace Bird without altering the expected behavior.