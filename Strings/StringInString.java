import java.util.*;

public class StringInString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string");
        String first = sc.nextLine();

        System.out.println("Enter second string");
        String second = sc.nextLine();

        boolean contains = checkContains(first, second);
        if (contains) {
            System.out.println("First string contains second");
        } else {
            System.out.println("First string does not contains second");
        }
    }

    public static boolean checkContains(String first, String second) {
        return first.contains(second);
    }
}