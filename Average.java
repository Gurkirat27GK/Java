import java.util.*;

public class Average {
    public static int Average(int n1, int n2, int n3) {
        int avg;
        avg = (n1 + n2 + n3) / 3;
        return avg;
    }

    public static void main(String[] args) {

        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        System.out.println(Average(n1, n2, n3));
    }
}