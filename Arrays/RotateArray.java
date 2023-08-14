// 1 Way is to store first x elements in a array and shift all remaining, then copy this array to last.
// 2nd Way is to reverse the array. Then swap n - d & d elements. (Better)

import java.util.Scanner;

public class RotateArray {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swapElements(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            swapElements(arr, start, end);
            start = start + 1;
            end = end - 1;
        }
    }

    public static void rotateArr(int arr[], int x) {
        if (arr.length == 0) {
            return;
        }

        // If one rotation is done
        if (x >= arr.length && arr.length != 0) {
            x = x % arr.length;
        }

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, arr.length - x - 1);
        reverse(arr, arr.length - x, arr.length - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        rotateArr(arr, x);
        printArray(arr);
    }
}
