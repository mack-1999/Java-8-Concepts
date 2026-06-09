public class MultithreadingExample {
    public static void main(String[] args) {
        System.out.println("Running thread name: " + Thread.currentThread().getName());

        new Thread(() -> {
            System.out.println("Running thread name: " + Thread.currentThread().getName());
        }).start();

        Runnable runnable = () -> {
            System.out.println("Running thread name: " + Thread.currentThread().getName());
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

    }
}

/*
> Thread Class vs Runnable Interface:

- Thread Class: You can create a thread by extending the Thread class and overriding its run() method. 
  This approach allows you to directly create a thread object and start it.

- Runnable Interface: You can also create a thread by implementing the Runnable interface and providing an implementation for the run() method.
  This approach allows you to separate the thread's task from the thread's execution, making it more flexible.
  
*/