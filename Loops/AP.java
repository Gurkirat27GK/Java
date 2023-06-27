// 3N + 2 (Not a multiple of 4)

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = 1;
        int i = 1;

        while (i <= n) {
            int num = 3 * N + 2;
            if (num % 4 != 0) {
                System.out.println(num);
                i++;
            }
            N++;
        }
    }
}
