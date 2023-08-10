// Approach: Start i from 0 and look for 1. Start j from end and search for 0. Swap both.

import java.util.Scanner;

public class Sort01 {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] == 1) {
                // Swapping by xor
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
                j--;
            } else {
                i++;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr);
        printArr(arr);
    }
}
