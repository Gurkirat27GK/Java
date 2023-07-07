/*
   *
  ***
 *****
  ***
   *
 */

import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstHalf = (n + 1) / 2;
        int secondHalf = n / 2;

        // First Half
        int i = 1;

        while (i <= firstHalf) {
            int spaces = 1;
            while (spaces <= firstHalf - i) {
                System.out.print(" ");
                spaces++;
            }

            int j = 1;
            while (j <= (2 * i) - 1) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }

        // Second Half
        i = secondHalf;

        while (i >= 1) {
            int spaces = 1;
            while (spaces <= secondHalf - i + 1) {
                System.out.print(" ");
                spaces++;
            }

            int j = 1;
            while (j <= (2 * i) - 1) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i--;
        }
    }
}
