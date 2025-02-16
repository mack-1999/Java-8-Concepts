abstract class Animal {
    public abstract void makeSound(); // Abstract method (No Implemention)

    public void eat() { // Concrete method (Implemented)
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    // ! Abstract method are must to be overridden
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Abstractexample{
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
        dog.eat();
    }
}


//? Abstraction is the concept of hiding implementation details and exposing only essential features to the user. It is achieved using abstract classes and interfaces.