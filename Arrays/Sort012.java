// 1 way is to count no. of 0,1,2 and print
// 2nd Way is to create temp array. If 0 store in front, if 2 store in back. Fill remaining with 1.
// 3rd Way is take NZ = 0 and NT = last. Traverse over array. If found 0 then swap with NZ, if found 2 swap with NT, if 1 move on... (Best Method)

import java.util.Scanner;

public class Sort012 {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int arr[]) {
        int nextZero = 0;
        int nextTwo = arr.length - 1;
        int i = 0;

        while (i <= nextTwo) {
            if (arr[i] == 0) {
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                i++;
                nextZero++;
            } else if (arr[i] == 2) {
                int temp = arr[nextTwo];
                arr[nextTwo] = arr[i];
                arr[i] = temp;
                nextTwo--;
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
        printArray(arr);
    }
}
