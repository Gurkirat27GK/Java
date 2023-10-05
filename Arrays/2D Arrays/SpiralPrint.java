import java.util.Scanner;

public class SpiralPrint {

    public static void spiral(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int i, RS = 0, CS = 0;
        int numElements = n * m;
        int count = 0;

        while (count < numElements) {
            for (i = CS; i < m && count < numElements; i++) {
                System.out.print(arr[RS][i] + " ");
                count++;
            }
            RS++;

            for (i = RS; i < n && count < numElements; i++) {
                System.out.print(arr[i][m - 1] + " ");
                count++;
            }
            m--;

            for (i = m - 1; i >= CS && count < numElements; i--) {
                System.out.print(arr[n - 1][i] + " ");
                count++;
            }
            n--;

            for (i = n - 1; i >= RS && count < numElements; i--) {
                System.out.print(arr[i][CS] + " ");
                count++;
            }
            CS++;
        }
    }

    public static void main(String args[]) {
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
        spiral(drr);
    }
}
