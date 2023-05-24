package Arrays;

import java.util.*;

public class NeonNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (checkNeon(n)) {
            System.out.println("Given number is a Neon number");
        } else {
            System.out.println("Given number is a not Neon number");
        }

    }

    public static boolean checkNeon(int n) {
        int square = n * n;
        int sum = 0;

        while (square > 0) {
            int r = square % 10;
            sum = sum + r;
            square = square / 10;
        }

        if (sum == n) {
            return true;
        }
        return false;
    }
}