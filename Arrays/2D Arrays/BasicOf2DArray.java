import java.util.Scanner;

public class BasicOf2DArray {
    public static void main(String args[]) {
        int arr[][] = new int[3][4];
        System.out.println(arr[1][2]);

        System.out.println(arr.length); // No. of rows
        System.out.println(arr[0].length); // No. of columns

        arr[2][1] = 12;
        System.out.println(arr[2][1]);

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

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(drr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
