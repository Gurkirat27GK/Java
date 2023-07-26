public class ReverseString {

    public static String reverseString(String str) {
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        return reverse;
    }

    public static void main(String args[]) {
        String str = "abcde";
        String ans = reverseString(str);

        System.out.println(ans);
    }
}
