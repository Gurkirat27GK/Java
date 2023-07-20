import java.util.Scanner;

public class TripletSum {

    public static void tripletSum(int arr[], int x) {
        int n = arr.length;
        int counter = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        tripletSum(arr, x);
    }
}
