import java.util.Scanner;

public class SecondLargest {

    public static int secondLargest(int arr[]) {
        int n = arr.length;
        if (n == 0) {
            return Integer.MIN_VALUE;
        }

        int L = arr[0];
        int SL = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            if (L < arr[i]) {
                SL = L;
                L = arr[i];
            } else if (SL < arr[i] && L != arr[i]) {
                SL = arr[i];
            }
        }
        return SL;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = secondLargest(arr);
        System.out.println(ans);
    }
}
