//Concepts Covered: Synchronization with synchronized, preventing race conditions.
package threads;

class SharedResource {
    private int count = 0;

    // Synchronized method to prevent race condition
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " Count: " + count);
    }
}

class Worker extends Thread {
    private SharedResource resource;

    public Worker(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.increment();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
}

public class ThreadSyncExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Create two worker threads accessing the same resource
        Worker t1 = new Worker(resource);
        Worker t2 = new Worker(resource);

        t1.start();
        t2.start();
    }
}
