/*37) Write a program TestThreadMany.java that takes a positive integer n
from the command line and creates exactly n threads that print out their own name. */
package JAVA.Lab_7;

public class Q37 {
    static class MyThread extends Thread {
        MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("Thread running: " + getName());
        }
    }

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java TestThreadMany <positive integer>");
            return;
        }

        int n = Integer.parseInt(args[0]);

        if (n <= 0) {
            System.out.println("Enter a positive integer.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            Thread t = new MyThread("Thread-" + i);
            t.start();
        }
    }
}
