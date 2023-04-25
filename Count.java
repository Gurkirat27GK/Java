import java.util.*;

public class Count {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int positive = 0;
        int negative = 0;
        int zeros = 0;

        while (n >= 0 || n < 0) {
            if (n > 0) {
                positive = positive + 1;
            } else if (n < 0) {
                negative = negative + 1;
            } else if (n == 0) {
                zeros = zeros + 1;
            }
            System.out.println("Positive: " + positive);
            System.out.println("Negative: " + negative);
            System.out.println("Zeros: " + zeros);

            n = sc.nextInt();
        }
    }
}