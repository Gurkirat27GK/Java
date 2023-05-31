package Arrays;

import java.util.*;

public class OperationsInArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int Arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            Arr[i] = sc.nextInt();
        }

        System.out.println(max(Arr));
        System.out.println(min(Arr));

        int sub = Arr[0];
        for (int i = 1; i < 5; i++) {
            sub = sub - Arr[i];
        }
        System.out.println(sub);

        if (sub < 0) {
            System.out.println("Subtraction result is less than Zero");
        } else {
            System.out.println("Subtraction result is greater than or equal to Zero");
        }
    }

    // Max element
    public static int max(int Arr[]) {
        int max = 0;
        for (int i = 0; i < 5; i++) {
            if (Arr[i] > max) {
                max = Arr[i];
            }
        }
        return max;
    }

    // Min element
    public static int min(int Arr[]) {
        int min = 10;
        for (int i = 0; i < 5; i++) {
            if (Arr[i] < min) {
                min = Arr[i];
            }
        }
        return min;
    }
}