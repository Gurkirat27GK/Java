import java.util.*;

public class UniqueArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> integers = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 integers: ");

        for (int i = 0; i < 5; i++) {
            int n = input.nextInt();

            if (!integers.contains(n)) {
                integers.add(n);
            }
        }
        Collections.sort(integers);
        System.out.println(integers);
    }
}