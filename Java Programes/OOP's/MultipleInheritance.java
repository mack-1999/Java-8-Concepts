//! Interface 1
interface Swimming {
    void swim();
}

//! Interface 2
interface Flying {
    void fly();
}

//! Concrete class implementing both interfaces
class Bird implements Swimming, Flying {
    @Override
    public void swim() {
        System.out.println("Bird swims in water.");
    }

    @Override
    public void fly() {
        System.out.println("Bird flies in the sky.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Bird bird = new Bird();
        
        //! Calling methods from the Swimming interface
        bird.swim();
        
        //! Calling methods from the Flying interface
        bird.fly();
    }
}