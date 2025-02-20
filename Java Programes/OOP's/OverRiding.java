class Animals {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dogs extends Animals {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OverRiding {
    public static void main(String[] args) {
        Animals myAnimal = new Dogs();  // Upcasting
        myAnimal.sound();  // Calls Dog's version at runtime
    }
}

/* Run-time (Dynamic) Polymorphism → Method Overriding
Same method name and parameters in both superclass & subclass.
Determined at runtime based on object type.
Uses method overriding (achieved via inheritance). */