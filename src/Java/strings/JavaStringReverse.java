package Java.strings;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        isPalindrome(A);
    }

    private static void isPalindrome(String str) {

        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(str.length() - 1 - i) != str.charAt(i)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}
