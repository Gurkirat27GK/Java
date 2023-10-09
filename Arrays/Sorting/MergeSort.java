import java.util.Scanner;

public class MergeSort {

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int start, int end) {
        // Base Case
        if (arr.length <= 1) {
            return;
        }
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int arr[], int start, int mid, int end) {
        int size = end - start + 1;
        int output[] = new int[size];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                output[k] = arr[i];
                k++;
                i++;
            } else {
                output[k] = arr[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            output[k] = arr[i];
            k++;
            i++;
        }
        while (j <= end) {
            output[k] = arr[j];
            k++;
            j++;
        }

        int m = 0;
        for (int z = start; z <= end; z++) {
            arr[z] = output[m];
            m++;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        mergeSort(arr, start, end);
        printArray(arr);
    }
}
