//Concepts Covered: Creating a thread by extending Thread, using start(), and sleep().
package threads;

// Creating a thread by extending Thread
class MyThread extends Thread {
    private int threadNumber;

    public MyThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    // override run command 
    @Override
    public void run() {
        // now you cna write whatever code you want to run in a thread. 
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "From Thread" + threadNumber);

            // Thread.sleep need to be in a try catch in java 
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
}

public class ThreadExample {

    public static void main(String[] args) {

        // Create 5 threads
        for(int i =0; i <= 3; i++){
            MyThread thread = new MyThread(i); // Create a thread object
            thread.start(); // Start the thread -> runs the run mehtod 

        }
    
    }
}
