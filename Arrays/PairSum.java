import java.util.Scanner;

public class PairSum {

    public static int pairSum(int arr[], int x) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int ans = pairSum(arr, x);
        System.out.println(ans);
    }
}
