package JAVA;

public class 1D_Array {
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

//Input a Array
        System.out.print("Enter no. of elements of array:");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Arrray:");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " ->:");
            arr[i] = s.nextInt();
        }

//Display the Array
        System.out.print("Array: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("]");

// Search an element
//        System.out.print("Enter key to search:");
//        int key = s.nextInt();
//        int found = 1;
//        for (int i = 0; i < n; i++) {
//            if (key == arr[i]) {
//                System.out.print("Key " + key + " found at index :" + i);
//                found = 0;
//            }
//        }
//        if (found == 1) {
//            System.out.print("Key not found!");
//        }



//Find largest and smallest and second largest and second smallest
//        int max = arr[0];
//        int smax = arr[0];
//        int min = arr[3];
//        int smin = arr[3];
//        for (int i = 0; i < n; i++) {
//            if (max <= arr[i]) {
//                max = arr[i];
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//            } else {
//            }
//        }
//        System.out.println("Maximum " + max);
//        System.out.println("Minimum " + min);
//
//        for (int i = 0; i < n; i++) {
//            if (smax <= arr[i] && arr[i] < max) {
//                smax = arr[i];
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            if (smin >= arr[i] && arr[i] > min) {
//                smin = arr[i];
//            }
//        }
//        System.out.println("Second Maximum " + smax);
//        System.out.println("Second Minimum " + smin);

//Sort the array
//        
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                if(arr[i]>arr[j]){
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        System.out.print("Array: [");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + ", ");
//        }
//        System.out.println("]");
// Reverse an array
//        int arr1[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr1[n - i - 1] = arr[i];
//        }
//        System.out.print("Array: [");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr1[i] + ", ");
//        }
//        System.out.println("]");
        

// Reverse an array without new array
//        for (int i = 0; i < n / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[n - i - 1];
//            arr[n - i - 1] = temp;
//        }
//        System.out.print("Array: [");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + ", ");
//        }
//        System.out.println("]");

    }
}

