import java.util.Scanner;

public class ArrangeNum {

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void arrange(int arr[], int n) {
        int left = 0;
        int right = n - 1;
        int counter = 1;

        while (left <= right) {
            if (counter % 2 == 1) {
                arr[left] = counter;
                counter++;
                left++;
            } else {
                arr[right] = counter;
                counter++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        arrange(arr, n);
        printArray(arr);
    }
}
