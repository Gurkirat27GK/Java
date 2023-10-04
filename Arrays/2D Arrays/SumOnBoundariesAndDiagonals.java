import java.util.Scanner;

public class SumOnBoundariesAndDiagonals {

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

    public static int firstDiagonalSum(int arr[][], int dimension) {
        int currentRow = 0;
        int currentCol = 0;

        int diagonalSum = 0;
        while (currentRow < dimension && currentCol < dimension) {
            diagonalSum = diagonalSum + arr[currentRow][currentCol];
            currentRow = currentRow + 1;
            currentCol = currentCol + 1;
        }
        return diagonalSum;
    }

    public static int secondDiagonalSum(int arr[][], int dimension) {
        int currentRow = 0;
        int currentCol = dimension - 1;

        int diagonalSum = 0;
        while (currentRow < dimension && currentCol < dimension) {
            diagonalSum = diagonalSum + arr[currentRow][currentCol];
            currentRow = currentRow + 1;
            currentCol = currentCol - 1;
        }
        return diagonalSum;
    }

    public static int boundarySum(int arr[][], int dimension){
        int sum = 0;

        for (int i = 1; i < (dimension - 1); i++){
            sum = sum + arr[0][i];  // upper side
            sum = sum + arr[dimension - 1][i];  // lower side
            sum = sum + arr[i][0];  // left side
            sum = sum + arr[i][dimension - 1];  // right side
        }
        return sum;
    }

    public static void totalSum(int arr[][]) {
        int n = arr.length;

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int totalSum = firstDiagonalSum(arr, n) + secondDiagonalSum(arr, n) + boundarySum(arr, n);

        if (n % 2 != 0) {
            totalSum = totalSum - arr[n / 2][n / 2]; // bcoz center element first aur second diagonal dono me count hoga
        }
        System.out.println(totalSum);
    }

    public static void main(String args[]) {
        int arr[][] = takeInput();
        totalSum(arr);
    }
}
