public class SingletonExample {
    // Private static instance of the class
    private static SingletonExample instance;

    // Private constructor to prevent instantiation from outside the class
    private SingletonExample() {
        // Initialization code (if needed)
    }

    // Public static method to get the instance of the class
    public static SingletonExample getInstance() {
        if (instance == null) {
            // If the instance is null, create a new one
            instance = new SingletonExample();
        }
        return instance;
    }

    // Other methods (if any)

    public void showMessage() {
        System.out.println("Hello, I am a singleton class!");
    }

    public static void main(String[] args) {
        // Get the instance of the singleton class
        SingletonExample singleton = SingletonExample.getInstance();

        // Use the instance to call methods
        singleton.showMessage();
    }
}