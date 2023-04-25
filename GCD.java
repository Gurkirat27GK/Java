import java.util.*;

public class GCD {
    int hcf;

    public static int HCF(int n1, int n2) {

        int hcf = 0;

        if (n2 > n1) {
            int temp = n2;
            n2 = n1;
            n1 = temp;
        }

        for (int i = 1; i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }

    public static void main(String[] args) {

        int n1, n2;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        int gcd = HCF(n1, n2);
        System.out.println(gcd);
    }
}