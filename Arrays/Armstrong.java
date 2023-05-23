package Arrays;

import java.util.*;

public class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are: ");

        for (int num = start; num <= end; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int originalnum = num;
        int numDigits = String.valueOf(num).length();   //It is used to convert non-string values, such as integers, floats, booleans, objects, into strings
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + (int) Math.pow(digit, numDigits);   // Math.pow answer double me return krta h, (int) lgane se thik ho jata h
            num = num / 10;
        }
        return sum == originalnum;
    }
}
