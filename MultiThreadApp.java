class MyThread implements Runnable {
    String threadName;

    MyThread(String name) {
        this.threadName = name;
    }

    // Overriding the run method as required by the Runnable interface [1]
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) { // Displays the message 5 times
                System.out.println(threadName + " is displaying message: iteration " + i);
                
                // Interval of 6 seconds (6000 milliseconds)
                Thread.sleep(6000); 
            }
        } catch (InterruptedException e) {
            // Handling the checked exception as discussed in Chapter 1 [4, 5]
            System.out.println(threadName + " was interrupted.");
        }
    }
}

public class MultiThreadApp {
    public static void main(String[] args) {
        // Creating two thread instances [1]
        Thread t1 = new Thread(new MyThread("Thread 1"));
        Thread t2 = new Thread(new MyThread("Thread 2"));

        // Starting the threads
        t1.start();
        t2.start();
        
        System.out.println("Both threads have started...");
    }
}