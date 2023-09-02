// Approach 1: Brute Force. Match all permutations of first string with second string. Time Complexity will be O(n!).
// Approcah 2: Sort both strings and compare them. Time Complexity will be O(n*log(n)).
// Approach 3: Compare the frequencies of  characters in both strings. If they match, then return true.

import java.util.Scanner;

public class CheckPermutation {

    public static boolean checkPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int frequency[] = new int[256]; // There are 256 characters in ASCII Table

        for (int i = 0; i < 256; i++) {
            frequency[i] = 0;
        }

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            frequency[ch]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            frequency[ch]--;
        }

        for (int i = 0; i < 256; i++) {
            if (frequency[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        boolean b = checkPermutation(str1, str2);
        System.out.println(b);
    }
}
