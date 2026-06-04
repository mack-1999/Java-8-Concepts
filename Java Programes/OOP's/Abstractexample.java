abstract class Animal {

    int age = 10; //! Field (Variable)

    public Animal() { //! Constructor
        System.out.println("Animal constructor called.");
    }

    public abstract void makeSound(); //! Abstract method (No Implemention)

    public void eat() { //! Concrete method (Implemented)
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    // Abstract method are must to be overridden
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


/* 
> Abstraction: It is the concept of hiding implementation details and exposing only essential features to the user. 
    It is achieved using abstract classes and interfaces.

> Abstract Class: 
    1. An abstract class is a class that cannot be instantiated and 
    may contain abstract methods (methods without implementation) as well as concrete methods (methods with implementation).
    2. It can have constructors, fields(variables), and methods.
*/