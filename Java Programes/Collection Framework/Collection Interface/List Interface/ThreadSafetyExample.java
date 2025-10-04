import java.util.ArrayList;
import java.util.Vector;

class ThreadSafetyExample extends Thread {
    static ArrayList<Integer> arrayList = new ArrayList<>(); // Not Thread-Safe
    static Vector<Integer> vector = new Vector<>(); // Thread-Safe

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            vector.add(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSafetyExample t1 = new ThreadSafetyExample();
        ThreadSafetyExample t2 = new ThreadSafetyExample();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Total size: " + vector.size());
    }
}

