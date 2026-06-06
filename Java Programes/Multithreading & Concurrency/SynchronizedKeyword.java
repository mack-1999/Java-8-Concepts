class SharedResource {
    private boolean flag = false;

    public synchronized void setFlag(boolean value) {
        flag = value;
    }

    public synchronized boolean getFlag() {
        return flag;
    }

}

public class SynchronizedKeyword {
        public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        new Thread(() -> {
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sharedResource.setFlag(true);
            System.out.println("Writer thread set flag to true");
        }).start();

        new Thread(() -> {
            while (!sharedResource.getFlag()) {
                // Busy-wait until flag is set to true
            }
            System.out.println("Reader thread detected flag is true");
        }).start();

    }
}
