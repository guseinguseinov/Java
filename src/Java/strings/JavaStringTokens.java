package Java.strings;

import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        countAndPrintTokens(s);
        scan.close();
    }

    public static void countAndPrintTokens(String s) {
        if (s.isEmpty() || s.isBlank()) {
            System.out.println("0");
            return;
        }
        String[] strings = s.trim().split("[ !,?._'@]+");
        System.out.println(strings.length);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
