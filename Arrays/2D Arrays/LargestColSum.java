import java.util.Scanner;

public class LargestColSum {

    public static int[][] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int rows = sc.nextInt();

        System.out.println("Enter no. of columns");
        int cols = sc.nextInt();

        int drr[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element at " + i + " row " + j + " column ");
                drr[i][j] = sc.nextInt();
            }
        }
        return drr;
    }

    public static int largestCol(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;
        int largest = Integer.MIN_VALUE;

        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum = sum + arr[i][j];
            }
            if (sum > largest) {
                largest = sum;
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int arr[][] = takeInput();
        int largestColSum = largestCol(arr);
        System.out.println(largestColSum);
    }
}
