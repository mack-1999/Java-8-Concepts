public class MultithreadingExample {
    public static void main(String[] args) {
        System.out.println("Running thread name: " + Thread.currentThread().getName());

        Thread thread0 = new Thread(() -> {
            System.out.println("Running thread name: " + Thread.currentThread().getName());
        });
        thread0.start();

        Runnable runnable = () -> {
            System.out.println("Running thread name: " + Thread.currentThread().getName());
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

        
    }
}
