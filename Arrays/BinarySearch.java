import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int arr[], int ele) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = (s + e) / 2;

            if (arr[mid] > ele) {
                e = mid - 1;
            } else if (arr[mid] < ele) {
                s = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ele = sc.nextInt();
        int ans = binarySearch(arr, ele);
        System.out.println(ans);
    }
}
