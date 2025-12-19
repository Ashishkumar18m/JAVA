/*38) Implement three classes: Storage, Counter, and Printer. The Storage class should store an integer. The Counter class should create a thread that starts counting from 0 (0, 1, 2, 3 ...) and stores each value in the Storage class. The Printer class should create a thread that keeps reading the value in the Storage class and printing it. Write a program that creates an instance of the Storage class and sets up a Counter and a Printer object to operate on it. */

package JAVA.Lab_7;


// Storage class to hold an integer
class Storage {
    private int value;

    public synchronized void setValue(int v) {
        value = v;
    }

    public synchronized int getValue() {
        return value;
    }
}

// Counter class: counts 0,1,2,... and stores in Storage
class Counter implements Runnable {
    Storage storage;

    Counter(Storage s) {
        storage = s;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            storage.setValue(i);
            i++;

            try { Thread.sleep(500); } 
            catch (InterruptedException e) {}
        }
    }
}

// Printer class: constantly reads from Storage and prints
class Printer implements Runnable {
    Storage storage;

    Printer(Storage s) {
        storage = s;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Current value: " + storage.getValue());

            try { Thread.sleep(500); }
            catch (InterruptedException e) {}
        }
    }
}
public class Q38 {
     public static void main(String[] args) {

        Storage storage = new Storage(); // shared object

        // Create threads
        Thread counterThread = new Thread(new Counter(storage));
        Thread printerThread = new Thread(new Printer(storage));

        // Start threads
        counterThread.start();
        printerThread.start();
    }
}
