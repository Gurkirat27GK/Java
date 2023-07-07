/*
 1=1
 1+2=3
 1+2+3=6
 1+2+3+4=10
 */

import java.util.Scanner;

public class Pattern27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum = sum + i;
            int j = 1;

            while (j <= i) {
                System.out.print(j);
                if (j == i) {
                    System.out.print("=");
                } else {
                    System.out.print("+");
                }
                j++;
            }

            System.out.println(sum);
            i++;
        }
    }
}
