/*
 1
 23
 456
 78910
 */

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int counter = 1;

        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(counter);
                counter++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
