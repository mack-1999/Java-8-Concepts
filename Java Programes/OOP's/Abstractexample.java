abstract class Animal {
    public abstract void makeSound(); // Abstract method
    public void eat() {
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
        Cat obj = new Cat();
        obj.makeSound();
    }
}
