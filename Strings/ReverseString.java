import java.util.*;

public class ReverseString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String input = "Hello, World!";

        // Convert the string to an array of characters
        char[] characters = input.toCharArray();

        // Print each character on a separate line
        for (char c : characters) {
            System.out.println(c);
        }

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String reversedString = reverseString(str);

        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseString(String str) {
        char characters[] = str.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }
        return new String(characters);
    }
}