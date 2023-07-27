import java.util.Scanner;

public class PrintSubstrings {

    public static void substring(String str) {

        // Approach 1
        for (int start = 0; start < str.length(); start++) {

            // We will be printing all substrings starting with char at index start
            for (int end = start; end < str.length(); end++) {
                System.out.println(str.substring(start, end + 1));
            }
        }

        System.out.println();

        // Approach 2
        for (int len = 1; len <= str.length(); len++) {

            // We have to print all strings with length as "len"
            for (int start = 0; start <= str.length() - len; start++) {
                int end = start + len - 1;
                System.out.println(str.substring(start, end + 1));
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        substring(str);
    }
}
