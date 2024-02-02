package Java.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            char letter = a.charAt(i);
            if (map1.get(letter) == null) {
                map1.put(letter, 1);
            }else {
                map1.replace(letter, map1.get(letter) + 1);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            char letter = b.charAt(i);
            if (map2.get(letter) == null) {
                map2.put(letter, 1);
            }else {
                map2.replace(letter, map2.get(letter) + 1);
            }
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : map2.entrySet()) {
            char key = characterIntegerEntry.getKey();
            int value = characterIntegerEntry.getValue();
            if(map1.get(key) == null) {
                return false;
            }
            if (map1.get(key) != value) {
                return false;
            }

        }

        return true;
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
