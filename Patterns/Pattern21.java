/*
    1
   121
  12321
 1234321
 */

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }

            // Increasing numbers
            j = 1;
            int p = 1;
            while (j <= i) {
                System.out.print(p);
                p++;
                j++;
            }

            // Decreasing numbers
            p = i - 1;
            j = 1;
            while (j <= i - 1) {
                System.out.print(p);
                p--;
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
