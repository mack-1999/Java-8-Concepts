abstract class Bird {
    void eat() {
        System.out.println("Bird is eating");
    }
}

class FlyingBird extends Bird {
    void fly() {
        System.out.println("This bird can fly");
    }
}

class Sparrow extends FlyingBird {
    @Override
    void fly() {
        System.out.println("Sparrow flies fast");
    }
}

class Ostrich extends Bird {
    // Ostrich doesn’t have fly(), only eat()
}


/*
 Don’t create subclasses that remove or break parent behavior.
 Use correct abstractions so all subclasses remain substitutable.
 */