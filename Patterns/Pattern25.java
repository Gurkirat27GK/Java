/*
 *
 *1*
 *121*
 *12321*
 *121*
 *1*
 *
 */

import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("*");

        // First half
        int i = 1;

        while (i <= n) {
            System.out.print("*");
            int j = 1;

            while (j <= i) {
                System.out.print(j);
                j++;
            }

            j = j - 2;
            while (j >= 1) {
                System.out.print(j);
                j--;
            }

            System.out.println("*");
            i++;
        }

        // Second half
        i = 1;

        while (i <= n - 1) {
            System.out.print("*");
            int j = 1;

            while (j <= n - i) {
                System.out.print(j);
                j++;
            }

            j = j - 2;
            while (j >= 1) {
                System.out.print(j);
                j--;
            }

            System.out.println("*");
            i++;
        }
        System.out.println("*");
    }
}
