import java.util.*;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        System.out.println(helper(arr, x, 0));
    }

    public static int helper(int arr[], int x, int start) {
        if (start == arr.length) {
            return -1;
        }

        if (arr[start] == x) {
            return start;
        }

        return helper(arr, x, start + 1);
    }
}
