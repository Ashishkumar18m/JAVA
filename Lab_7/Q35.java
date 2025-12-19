/*35) Write a program to create two threads, one thread prints a-z, and the second thread prints 1 to 10.*/
package JAVA.Lab_7;

class AlphabetThread extends Thread {
    public void run() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
public class Q35 {
     public static void main(String[] args) {

        AlphabetThread t1 = new AlphabetThread();
        NumberThread t2 = new NumberThread();

        t1.start();   // Start thread 1
        t2.start();   // Start thread 2
    }
}