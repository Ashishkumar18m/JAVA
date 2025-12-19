/*36) Write a program to demonstrate Thread priority. */

package JAVA.Lab_7;

class PriorityThread extends Thread {

    PriorityThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() +
                               " (Priority: " + Thread.currentThread().getPriority() + ") → " + i);
        }
    }
}
public class Q36 {
     public static void main(String[] args) {

        PriorityThread t1 = new PriorityThread("Low Priority Thread");
        PriorityThread t2 = new PriorityThread("Medium Priority Thread");
        PriorityThread t3 = new PriorityThread("High Priority Thread");

        // Setting priorities
        t1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        t3.setPriority(Thread.MAX_PRIORITY);  // Priority 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
