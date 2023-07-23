import java.util.Scanner;

public class ArrayIntersection {

    public static void intersection(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE; // Marking all elements of arr2 -infinity, so that another same element
                                                 // in arr1 doesn't match with element in arr2
                    break; // Once match is found, no need to check other elements
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int arr2[] = new int[m];

        for (int j = 0; j < m; j++) {
            arr2[j] = sc.nextInt();
        }

        intersection(arr1, arr2);
    }
}
