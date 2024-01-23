package Java.strings;

import java.util.Scanner;

public class JavaSubstringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        System.out.println(s.length());
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        if (s.length() == k) {
            return s + "\n" + s;
        }

        String[] substrings = getSubstrings(s, k);

        if (substrings[0].compareTo(substrings[1]) > 0) {
            smallest = substrings[1];
            largest = substrings[0];
        }else {
            smallest = substrings[0];
            largest = substrings[1];
        }

        for (int i = 0; i < substrings.length; i++) {
            if (smallest.compareTo(substrings[i]) > 0) {
                smallest = substrings[i];
            }
            if (largest.compareTo(substrings[i]) < 0) {
                largest = substrings[i];
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    private static int countSubstrings(String s, int k) {
        int count = 0;
        int breakPoint = s.length() - k;
        for (int i = 0; i < s.length(); i++) {
            if (i > breakPoint) {
                break;
            }
            count++;
        }
        return count;
    }

    private static String[] getSubstrings(String s, int k) {
        int arrayLength = countSubstrings(s, k);
        String[] substrings = new String[arrayLength];
        int count = 0;
        int breakPoint = s.length() - k;
        for (int i = 0; i < s.length(); i++) {
            if (i > breakPoint) {
                break;
            }
            substrings[count] = s.substring(i, i + k);
            count++;
        }

        return substrings;
    }
}

