package Java.strings;
import java.util.*;
public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sumStringLength(A,B);
        lexicographically(A,B);
        capitalizeJoin(A,B);
    }


    private static void sumStringLength(String str1, String str2) {
        System.out.println(str1.length() + str2.length());
    }

    private static void capitalizeJoin(String str1, String str2) {
        System.out.println(str1.substring(0, 1).toUpperCase() + str1.substring(1) + " " + str2.substring(0, 1).toUpperCase() + str2.substring(1));
    }

    private static void lexicographically(String str1, String str2) {
        if (str1.compareTo(str2) > 0)  {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
