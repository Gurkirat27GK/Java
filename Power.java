import java.util.*;

public class Power {
    public static int power(int x, int n) {
        int power = 1;
        for (int i = 1; i <= n; i++) {
            power = power * x;
        }
        return power;
    }

    public static void main(String[] args) {

        int x;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        x = sc.nextInt();
        System.out.print("Enter exponent: ");
        n = sc.nextInt();

        int pow = power(x, n);
        System.out.println(x + " to the power " + n + " is: " + pow);
    }
}