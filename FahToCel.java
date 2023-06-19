import java.util.Scanner;

public class FahToCel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();

        int c = (5 * (f - 32)) / 9;
        // Also
        // int c = (int) ((5.0 / 9) * (f - 32));
        System.out.println(c);
    }
}
