import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 2;

        if (n == 0 || n == 1) {
            System.out.println("Not Prime");
        }

        while (d <= n - 1) {
            if (n % d == 0) {
                System.out.println("Not Prime");
                return;
            }
            d = d + 1;
        }
        System.out.println("Prime");
    }
}
