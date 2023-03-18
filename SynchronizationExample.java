package multithreading;

public class SynchronizationExample {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
    }
    
    public void performSynchronizedBlock() {
        synchronized(this) {
            count++;
        }
    }
    
    public static void main(String[] args) {
        SynchronizationExample example = new SynchronizationExample();
        
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });
        
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.performSynchronizedBlock();
            }
        });
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Count: " + example.count);
    }
}

