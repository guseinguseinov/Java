package Java.strings;

import java.util.Scanner;

public class JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        getSubstring(S, start, end);
    }

    private static void getSubstring(String str, int start, int end) {
        System.out.println(str.substring(start, end));
    }
}
