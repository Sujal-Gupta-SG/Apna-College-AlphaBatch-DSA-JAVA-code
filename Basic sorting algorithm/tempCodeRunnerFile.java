import java.util.Scanner;

public class bubbleSort {

  public static int bubbleSortAsc(int[] array) {
    int op = 0;
    boolean swapped;
    for (int turn = 0; turn < array.length - 1; turn++) {
      swapped = false;
      for (int j = 0; j < array.length - 1 - turn; j++) {
        if (array[j] > array[j + 1]) {
          // swap
          op++;
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped) break;
    }
    return op;
  }

  public static int bubbleSortDes(int[] array) {
    int op = 0;
    boolean swapped;
    for (int turn = 0; turn < array.length - 1; turn++) {
      swapped = false;
      for (int j = 0; j < array.length - 1 - turn; j++) {
        if (array[j] < array[j + 1]) {
          // swap
          op++;
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped) break;
    }
    return op;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int[] arrcpy = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      arrcpy[i] = arr[i];
    }

    // Copy for descending sort

    int asc = bubbleSortAsc(arr);
    int des = bubbleSortDes(arrcpy);
    System.out.println(Math.min(asc, des));
  }
}
