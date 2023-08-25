// n / 10 to reach to next digit

import java.util.Scanner;

public class NumberOfDigit {

    public static int count(int n) {
        // Base Case
        if (n == 0) {
            return 0;
        }

        int smallAns = count(n / 10);
        return smallAns + 1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = count(n);
        System.out.println(ans);
    }
}
