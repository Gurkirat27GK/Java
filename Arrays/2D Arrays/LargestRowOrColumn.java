import java.util.Scanner;

public class LargestRowOrColumn {

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

    public static void largestRowOrColumn(int arr[][]) {
        boolean isRow = true;
        int largestSum = Integer.MIN_VALUE;
        int num = 0;

        int rows = arr.length;
        int cols = arr[0].length;

        if (rows == 0) {
            System.out.println("row" + num + " " + largestSum);
            return;
        }

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum = rowSum + arr[i][j];
            }
            if (rowSum > largestSum) {
                largestSum = rowSum;
                num = i;
            }
        }

        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum = colSum + arr[i][j];
            }
            if (colSum > largestSum) {
                largestSum = colSum;
                num = j;
                isRow = false;
            }
        }

        if (isRow) {
            System.out.println("row" + " " + num + " " + largestSum);
        } else {
            System.out.println("column" + " " + num + " " + largestSum);
        }
    }

    public static void main(String args[]) {
        int arr[][] = takeInput();
        largestRowOrColumn(arr);
    }
}
