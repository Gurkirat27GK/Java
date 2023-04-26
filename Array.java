import java.util.*;

public class Array {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter number to find: ");
        int x = sc.nextInt();

        // output
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("x found at index: " + i);
            }
        }
    }
}