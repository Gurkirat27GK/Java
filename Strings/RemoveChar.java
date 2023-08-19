import java.util.Scanner;

public class RemoveChar {

    public static String removeAllOccurancesOfChar(String str, char ch) {
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                ans = ans + str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        String ans = removeAllOccurancesOfChar(str, ch);
        System.out.println(ans);
    }
}
