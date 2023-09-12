import java.util.Scanner;

public class ReplaceChar {
    public static String replaceChar(String str, char c1, char c2) {

        // Base Case
        if (str.length() == 0) {
            return str;
        }

        char c;
        if (str.charAt(0) == c1) {
            c = c2;
        } else {
            c = str.charAt(0);
        }

        String smallAns = replaceChar(str.substring(1), c1, c2);
        return c + smallAns;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        System.out.println(replaceChar(str, c1, c2));
    }
}
