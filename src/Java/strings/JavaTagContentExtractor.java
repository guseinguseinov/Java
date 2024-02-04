package Java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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
        String regex = "<(.+?)>([^<]+)</\\1>";


        Pattern pattern = Pattern.compile(regex);
        Matcher mathcer = pattern.matcher(line);

        boolean checked = false;
        while (mathcer.find()) {
            System.out.println(mathcer.group(2));
            checked = true;
        }

        if (checked == false) {
            System.out.println("None");
        }

    }
}
