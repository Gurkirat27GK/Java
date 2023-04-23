/*
12345
1234
123
12
1
 */
package Patterns;

import java.util.*;

public class Pattern7 {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}