import java.util.Scanner;

public class FafToCelTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int gap = sc.nextInt();
        int f = start;

        while (f <= end) {
            int c = (5 * (f - 32)) / 9;
            System.out.println(f + "\t" + c); // "\t" is used for tab
            f = f + gap;
        }
    }
}
