/*
 1
 21
 321
 4321
 */

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {
            int j = 1;
            int counter = i;
            while (j <= i) {
                System.out.print(counter);
                counter--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
