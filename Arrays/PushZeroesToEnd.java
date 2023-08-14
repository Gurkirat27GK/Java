// Approach: Start i from 0 and look for 0. Start j from end. If found any zero, swap i with j and decrease j. If not found keep increasing i.

import java.util.Scanner;

public class PushZeroesToEnd {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void push(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
// Approach: Start i from 0 and look for 0. Start j from end. If found any zero, swap i with j and decrease j. If not found keep increasing i.
// One more Way (for maintaining sequence of other numbers)
/*
 int  k = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[k] = nums[i] ^ nums[k];
                nums[i] = nums[i] ^ nums[k];
                k++;
            }
        }
 */

import java.util.Scanner;

public class PushZeroesToEnd {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void push(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] == 0) {
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

        push(arr);
        printArr(arr);
    }
}

        while (i < j) {
            if (arr[i] == 0) {
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

        push(arr);
        printArr(arr);
    }
}
