import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char name = sc.next().charAt(0); // To take char as input
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int avg = (m1 + m2 + m3) / 3;

        System.out.println(name);
        System.out.println(avg);
    }
}