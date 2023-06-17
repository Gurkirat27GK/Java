import java.util.Scanner;

public class LargestOfNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = -100000; // Random smallest possible value

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            for (int j = 1; j <= num; j++) {
                if (j > l) {
                    l = j;
                }
            }
        }
        System.out.println(l);
    }
}
