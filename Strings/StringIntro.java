import java.util.Scanner;

public class StringIntro {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // String st = sc.next();
        String st = sc.nextLine();
        System.out.println(st);

        char arr[] = { 'C', 'o', 'd', 'i', 'n', 'g' };
        String str = "";
        String str1 = "Coding";
        String str2 = " is fun";
        String str3 = "Coding";

        // Length of string
        System.out.println(str.length());

        // Display char at particular index
        System.out.println(str1.charAt(3));

        // H ki nhi
        System.out.println(str1.contains("ing"));

        // Concatenation
        System.out.println(str1 + str2);
        // str1.concat(str2);

        // Brabar h to true nhi to false
        System.out.println(str1.equals(str3));

        // Compares 2 strings
        System.out.println(str1.compareTo(str3));

        // Substring
        System.out.println(str1.substring(5));
        System.out.println(str1.substring(1, 5));
    }
}
