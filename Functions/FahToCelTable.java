import java.util.Scanner;

public class FahToCelTable {

    public static void FahToCel(int S, int E, int W) {
        int f = S;

        while (f <= E) {
            int c = (5 * (f - 32)) / 9;
            System.out.println(f + "\t" + c);
            f = f + W;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();

        FahToCel(S, E, W);
    }
}
