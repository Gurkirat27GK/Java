import java.util.Scanner;

public class EquilibriumIndex {

    public static int equilibrium(int arr[]) {
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
        }

        int leftSum = 0;
        int rightSum = 0;

        for (int index = 0; index < arr.length; index++) {
            rightSum = totalSum - leftSum - arr[index];

            if (leftSum == rightSum) {
                return index;
            }
            leftSum = leftSum + arr[index];
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = equilibrium(arr);
        System.out.println(ans);
    }
}
