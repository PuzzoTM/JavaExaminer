//Concepts Covered: Implementing Runnable, running multiple threads.
package threads;

// Creating a thread by implementing Runnable
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Runnable interrupted!");
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable()); // Creating a thread with Runnable
        thread.start();

        System.out.println("Main thread is running separately.");
    }
}
