package Arrays;

import java.util.*;

public class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number");
        int start = sc.nextInt();

        System.out.println("Enter ending number: ");
        int end = sc.nextInt();

        System.out.print("Armstrong numbers between " + start + " and " + end + " are: ");

        for (int num = start; num <= end; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int originalnum = num;
        int numDigits = String.valueOf(num).length();
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + (int) Math.pow(digit, numDigits);
            num = num / 10;
        }
        return sum == originalnum;
    }
}