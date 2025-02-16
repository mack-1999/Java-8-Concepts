//! Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
//! Derived class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}
//! Derived class 2
class GermanShepherd extends Dog {
    void guard() {
        System.out.println("German Shepherd guards the house.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        // Creating an object of the most derived class
        GermanShepherd dog = new GermanShepherd();

        //! Calling methods from the base class
        dog.eat();
        //! Calling methods from the immediate parent class
        dog.bark();
        //! Calling methods from the most derived class
        dog.guard();
    }
}

//? Inheritance is the process of acquiring properties and behaviors of a parent class into a child class using the extends keyword.

//? Multilevel Inheritance: A class inherits from another class, which is inherited from another class.