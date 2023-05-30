import java.util.*;

public class MenuArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> integers = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = sc.nextInt();

            if (choice == 1) {
                // Add
                System.out.println("Enter an Integer: ");
                integers.add(sc.nextInt());
                System.out.println("Added");
            }

            else if (choice == 2) {
                // Remove
                System.out.println("Enter the number to remove: ");
                int elementToRemove = sc.nextInt();
                if (integers.contains(elementToRemove)) {
                    integers.remove(Integer.valueOf(elementToRemove));
                    System.out.println("Removed.");
                } else {
                    System.out.println("Element not found");
                }
            }

            else if (choice == 3) {
                // Display
                System.out.println("Your List: " + integers);
            }

            else if (choice == 4) {
                // Exit
                System.out.println("Good bye");
                break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
    }
}