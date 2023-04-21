import java.util.*;

public class Marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n == 1) {
            int marks = sc.nextInt();
            if (marks >= 90) {
                System.out.println("Mehnat rang layi");
            } else if (marks <= 89 && marks >= 60) {
                System.out.println("Thik thak number aa gye");
            } else if (marks <= 59 && marks >= 0) {
                System.out.println("Thoda padh liya kar bhai");
            } else {
                System.out.println("Unexpected Output");
            }
            n = sc.nextInt();
        }

        if (n == 0) {
            System.out.println("Ok");
        }

        else {
            System.out.println("Error");
        }
    }
}