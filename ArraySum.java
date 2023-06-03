import java.util.*;

public class ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Sum: ");
        int sum = sc.nextInt();
        for (int i = 1; i < size; i++) {
            if (arr[i] + arr[i - 1] == sum) {
                System.out.print(arr[i] + ",");
                System.out.print(arr[i - 1]);
                System.out.println();
            }
        }
    }
}