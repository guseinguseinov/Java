package Java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


// TODO finish this
public class JavaTagContentExtractor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            checkTag(line);

            testCases--;
        }
    }


    private static void checkTag(String line) {
        String regex = "<([a-zA-Z][a-zA-Z0-9]*)\\b[^>]*>.*?<\\/\\1>";

        Pattern pattern = Pattern.compile(regex);
        boolean isMatched = pattern.matcher(line).find();

        System.out.println(isMatched ? "nese": "None");

    }
}
