import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;

        if (n == 0 || n == 1) {
            System.out.println("Not Prime");
        }

        else if (n == i) {
            System.out.println("Prime");
        }

        else if (n % i == 0) {
            System.out.println("Not Prime");
            i++;
        }

        else {
            System.out.println("Prime");
        }
    }
}
