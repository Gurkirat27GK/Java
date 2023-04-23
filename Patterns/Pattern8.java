/*
Floyd's Triangle
1
23
456
78910
 */
package Patterns;

import java.util.*;

public class Pattern8 {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int number = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}