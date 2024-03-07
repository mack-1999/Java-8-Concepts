// Interface for creating shapes
interface Shape {
    void draw();
}

// Abstract factory class for creating shapes
abstract class ShapeFactory {
    public abstract Shape createShape();
}

// Concrete factory classes for specific shapes
class CircleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle(); //! If any method returns a object it is an Factory Method
    }
}

class SquareFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square(); // Assuming Square class is defined below
    }
}

// Concrete class for Square shape
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Concrete class for Square shape
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

// Client code
public class FactoryMethod {
    public static void main(String[] args) {
        ShapeFactory factory = new CircleFactory(); // Choose the factory
        Shape shape = factory.createShape();
        shape.draw(); // Draw a circle

        factory = new SquareFactory(); // Switch to Square factory
        shape = factory.createShape();
        shape.draw(); // Draw a square
    }
}