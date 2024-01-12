import java.util.Scanner;

public class Allindices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        helper(arr, x, 0);
    }

    public static int helper(int arr[], int x, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == x) {
            System.out.print(index + " ");
        }

        return helper(arr, x, index + 1);
    }
}
