import java.util.*;

public class CountWords {
    public static void main(String args[]) {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        s = sc.nextLine();

        int i, count = 1;
        for (i = 0; i < s.length(); i++) {
            char c, d;
            c = s.charAt(i);
            d = s.charAt(i + 1);

            if (c == ' ' && d != ' ') {
                count++;
                if (d == '\0') {
                    break;
                }
            }
        }
        System.out.println("Total words = " + count);
    }
}