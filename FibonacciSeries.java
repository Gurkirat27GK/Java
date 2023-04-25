import java.util.*;

public class FibonacciSeries {

    public static void fibonacci(int n) {
        int term1 = 0;
        int term2 = 1;
        int nextTerm;

        for (int i = 1; i <= n; i++) {
            System.out.println(term1);
            nextTerm = term1 + term2;
            term1 = term2;
            term2 = nextTerm;
        }
        return;
    }

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        fibonacci(n);
    }
}