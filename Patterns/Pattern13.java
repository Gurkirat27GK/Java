/*
 ABCD
 BCDE
 CDEF
 DEFG
 */

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {
            int j = 1;
            int counter = 'A' + i - 1;
            while (j <= n) {
                System.out.print((char) (counter));
                counter++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
