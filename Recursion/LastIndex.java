import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        System.out.println(helper(arr, x, n - 1));
    }

    public static int helper(int arr[], int x, int end) {
        if (end < 0) {
            return -1;
        }

        if (arr[end] == x) {
            return end;
        }

        return helper(arr, x, end - 1);
    }
}
