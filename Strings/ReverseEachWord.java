import java.util.Scanner;

public class ReverseEachWord {

    public static String reverseEachWord(String str) {
        String ans = "";
        int WordStart = 0;
        int i = 0;

        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                // Reverse Current Word
                int WordEnd = i - 1;
                String reversedWord = "";
                for (int j = WordEnd; j >= WordStart; j--) {
                    reversedWord = reversedWord + str.charAt(j);
                }
                // Add in final String(ans)
                ans = ans + reversedWord + " ";
                WordStart = i + 1;
            }
        }

        System.out.println(i + " " + WordStart);

        // For last word kyoki uske liye space to hoga ni
        int WordEnd = i - 1;
        String reversedWord = "";
        for (int j = WordEnd; j >= WordStart; j--) {
            reversedWord = reversedWord + str.charAt(j);
        }
        // Add in final String(ans)
        ans = ans + reversedWord;
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = reverseEachWord(str);

        System.out.println(ans);
    }
}
