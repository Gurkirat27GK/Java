import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Valid triangle condition:
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
