import java.util.*;

public class Strings {
    public static void main(String[] args) {

        // Concatenation
        String firstname = "tony";
        String lastName = "stark";
        String fullName = firstname + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        // compareTo (== bhi same h but kuch cases me error deta h)
        String name1 = "Tony";
        String name2 = "Pony";
        // 1 s1 > s2 : +ve value
        // 2 s2 == s2 : 0
        // 3 s1 < s2 : -ve value
        // Ex: Hello < Wello (W > H)
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // Substring
        String sentence = "My name is Tony";
        // substring(beg index, end index)
        String name = sentence.substring(11, sentence.length()); // length - 1 tk chlega
        System.out.println(name);

        // ParseInt
        String strr = "123";
        int number = Integer.parseInt(strr);
        System.out.println(number);

        // ToString
        int num = 12345;
        String st = Integer.toString(num);
        System.out.println(st.length());

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                result = result + 'i';
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}