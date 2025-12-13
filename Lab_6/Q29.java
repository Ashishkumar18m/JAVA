/*29) Declare an interface called Function that has a method named evaluate that takes an int 
parameter and returns an int value. Create a class Half that implements Function. 
Make the implementation of the method evaluate () return the value obtained by dividing the int
argument by 2. In a client, create a method that takes an arbitrary array of int values as parameter 
and returns an array that has the same length, but the value of an element in the new array is half 
that of the value in the corresponding element in the array passed as parameter. Let the implementation 
of this method create an instance of Half and use this instance to calculate the values in the array to be returned.*/

package JAVA.Lab_6;

// Interface with evaluate method
interface Function {

    int evaluate(int x);
}

// Half class implementing Function
class Half implements Function {

    @Override
    public int evaluate(int x) {
        return x / 2;
    }
}

public class Q29 {
      // Method that returns a new array with half values
    public static int[] getHalfArray(int[] arr) {

        int[] result = new int[arr.length];
        Function halfObj = new Half(); // Create instance of Half

        for (int i = 0; i < arr.length; i++) {
            result[i] = halfObj.evaluate(arr[i]); // Use evaluate()
        }

        return result;
    }

    public static void main(String args[]) {

        int[] data = {10, 20, 30, 40, 50};

        int[] halfValues = getHalfArray(data);

        // Print result
        System.out.println("Original Array:");
        for (int x : data) {
            System.out.print(x + " ");
        }

        System.out.println("\nHalf Array:");
        for (int x : halfValues) {
            System.out.print(x + " ");
        }
    }
}
