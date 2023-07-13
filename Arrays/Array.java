public class Array {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 5;
        arr[5] = 17;
        System.out.println(arr[0]);
        System.out.println(arr[5]);

        // arr[-1] = 18;
        // arr[10] = 15;
        // System.out.println(arr[3]);

        char cArray[] = new char[10];
        double dArray[] = new double[10];
        boolean bArray[] = new boolean[5];
        System.out.println(cArray[0]); // null character
        System.out.println(dArray[0]); // 0.0
        System.out.println(bArray[0]); // false
    }
}
