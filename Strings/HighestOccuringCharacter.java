import java.util.Scanner;

public class HighestOccuringCharacter {

    public static char highest(String str) {
        int n = str.length();
        int frequency[] = new int[256]; // total characters
        int maxFrequency = 0;

        for (int i = 0; i < n; i++) {
            frequency[str.charAt(i)]++;
            maxFrequency = Math.max(maxFrequency, frequency[str.charAt(i)]);
        }

        char ans = '\0';

        for (int i = 0; i < n; i++) {
            if (frequency[str.charAt(i)] == maxFrequency) {
                ans = str.charAt(i);
                break;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char ans = highest(str);
        System.out.println(ans);
    }
}
