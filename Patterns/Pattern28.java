/*
 1357
 3579
 5791
 7913
 */

import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {
            int print = (2 * i) - 1;
            int j = n;

            while (j > 0) {
                System.out.print(print);
                print = print + 2;

                if (print > (2 * n) - 1) {
                    print = 1;
                }
                j--;
            }

            System.out.println();
            i++;
        }
    }
}
