/*
 1
 23
 345
 4567
 */

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {
            int j = 1;
            int startingNum = i;
            while (j <= i) {
                System.out.print(startingNum);
                startingNum++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
