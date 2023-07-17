import java.util.Scanner;

public class LargestElement {

    public static int largest(int arr[]) {
        int max = Integer.MIN_VALUE; // Minimum value

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = largest(arr);
        System.out.println(ans);
    }
}
