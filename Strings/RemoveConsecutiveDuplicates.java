import java.util.Scanner;

public class RemoveConsecutiveDuplicates {

    public static String removeConsecutiveDuplicates(String str) {
        int n = str.length();

        if (n == 0) {
            return str;
        }

        String ans = "";
        int start = 0;

        while (start < n) {
            char unique = str.charAt(start);
            int nextUniqueIndex = start + 1;

            while (nextUniqueIndex < n && str.charAt(nextUniqueIndex) == unique) {
                nextUniqueIndex = nextUniqueIndex + 1;
            }
            ans = ans + unique;
            start = nextUniqueIndex;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = removeConsecutiveDuplicates(str);
        System.out.println(ans);
    }
}
