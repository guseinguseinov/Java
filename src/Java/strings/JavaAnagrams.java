package Java.strings;

import java.util.Scanner;

// TODO: NOT FINISHED. FINISH AFTER LEARNING MAP

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }
        return a.toLowerCase().compareTo(b.toLowerCase()) == 0;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
