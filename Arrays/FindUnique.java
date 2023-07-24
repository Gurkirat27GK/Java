import java.util.Scanner;

public class FindUnique {

    public static int findUnique(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        break;
                    }
                }
            }
            if (j == arr.length) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = findUnique(arr);
        System.out.println(ans);
    }
}
