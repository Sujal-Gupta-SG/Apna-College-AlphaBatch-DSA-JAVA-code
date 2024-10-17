import java.util.Scanner;

public class bubbleSorts {
    
    public static int bubbleSortAsc(int[] array) {
        int op = 0; // Initialize swap count to 0
        boolean swapped;
        for (int turn = 0; turn < array.length - 1; turn++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - turn; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap
                    op++;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, array is sorted
            if (!swapped) break;
        }
        return op; // Return number of swaps
    }

    public static int bubbleSortDes(int[] array) {
        int op = 0; // Initialize swap count to 0
        boolean swapped;
        for (int turn = 0; turn < array.length - 1; turn++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - turn; j++) {
                if (array[j] < array[j + 1]) {
                    // Swap
                    op++;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, array is sorted
            if (!swapped) break;
        }
        return op; // Return number of swaps
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the size of the array
        int[] arr = new int[n]; // Create the array
        int[] arrCopy = new int[n]; // Create a copy for descending sort

        // Read elements into the array and copy to arrCopy
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arrCopy[i] = arr[i]; // Copy the array for descending sort
        }

        // Perform sorting
        int asc = bubbleSortAsc(arr); // Sort in ascending order
        int des = bubbleSortDes(arrCopy); // Sort in descending order
        System.out.println(Math.min(asc, des)); // Output the minimum swaps
    }
}
