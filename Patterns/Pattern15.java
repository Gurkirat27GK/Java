/*
 A
 BC
 CDE
 DEFG
 */

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {
            int j = 1;
            int counter = 'A' + i - 1;
            while (j <= i) {
                System.out.print((char) (counter));
                counter++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
