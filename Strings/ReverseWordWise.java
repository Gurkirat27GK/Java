import java.util.Scanner;

public class ReverseWordWise {

    public static String reverseWordWise(String str) {
        String ans = "";
        int start = str.length() - 1;
        int end = str.length();

        while (start >= 0) {
            if (str.charAt(start) == ' ') {
                ans = ans + str.substring(start + 1, end) + " ";
                end = start;
            }
            start--;
        }

        System.out.println(start + " " + end);

        ans = ans + str.substring(start + 1, end);
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = reverseWordWise(str);

        System.out.println(ans);
    }
}
