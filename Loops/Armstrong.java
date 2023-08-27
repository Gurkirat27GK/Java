import java.util.Scanner;
import java.lang.Math;

public class Armstrong {

    public static boolean isArmstrong(int n) {
        int temp = n;
        int digits = 0;

        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        temp = n;
        double sum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + (Math.pow(rem, digits));
            temp = temp / 10;
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isArmstrong(n)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
