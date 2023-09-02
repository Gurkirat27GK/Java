public class CheckSorted {

    public static boolean checkSorted(int input[]) {
        if (input.length <= 1) {
            return true;
        }

        // Processing
        if (input[0] > input[1]) {
            return false;
        }

        // Smaller Problem
        int smallInput[] = new int[input.length - 1];

        for (int i = 1; i < input.length; i++) {
            smallInput[i - 1] = input[i];
        }

        boolean smallAns = checkSorted(smallInput);
        if (smallAns) {
            return true;
        } else {
            return false;
        }
    }

    // Less Space Complexity
    private static boolean checkSortedBettter(int input[], int startIndex) {
        if (startIndex >= input.length - 1) {
            return true;
        }

        if (input[startIndex] > input[startIndex + 1]) {
            return false;
        }

        boolean smallAns = checkSortedBettter(input, startIndex + 1);
        return smallAns;
    }

    // Function Overloading (no need to take startIndex from user)
    public static boolean checkSortedBettter(int input[]) {
        return checkSortedBettter(input, 0);
    }

    public static void main(String args[]) {
        int input[] = { 2, 1, 3, 4, 5 };
        System.out.println(checkSorted(input));
        System.out.println(checkSortedBettter(input));
    }
}
