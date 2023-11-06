import java.util.*;

public class MergeArrays {

    // Approach 1 (in arr3)
    public static ArrayList<Integer> mergeArray(int arr1[], int arr2[], int n, int m) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> l = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (l.isEmpty() || l.get(l.size() - 1) != arr1[i]) {
                    l.add(arr1[i]);
                }
                i++;

            } else {
                if (l.isEmpty() || l.get(l.size() - 1) != arr2[j]) {
                    l.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < n) {
            if (l.isEmpty() || l.get(l.size() - 1) != arr1[i]) {
                l.add(arr1[i]);
            }
            i++;
        }

        while (j < m) {
            if (l.isEmpty() || l.get(l.size() - 1) != arr2[j]) {
                l.add(arr2[j]);
            }
            j++;
        }
        return l;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int arr2[] = new int[m];

        for (int j = 0; j < m; j++) {
            arr2[j] = sc.nextInt();
        }

        ArrayList<Integer> l = mergeArray(arr1, arr2, n, m);
        System.out.println(l);
    }
}
