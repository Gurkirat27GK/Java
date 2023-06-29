import java.util.Scanner;

public class FibonacciNum {

    public static boolean checkMember(int n) {
        int a = 0;
        int b = 1;
        int c;

        while (a < n) {
            c = a + b;
            a = b;
            b = c;
        }
        if (a == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(checkMember(n));
    }
}
