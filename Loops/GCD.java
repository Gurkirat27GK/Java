import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int hcf = 0; // GCD = HCF

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
        System.out.println(hcf);
    }
}
