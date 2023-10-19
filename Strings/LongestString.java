import java.util.Scanner;

public class LongestString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int total = 0;

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int brr[] = new int[n];
        for (int i = 0; i < n; i++) {
            brr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] >= x) {
                total = total + brr[i];
            }
        }
        System.out.println(total);
    }
}
