package Java.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class JavaPatternSyntaxChecker {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            checkSyntax(pattern);

            testCases--;
        }
    }

    public static void checkSyntax(String pattern) {
        boolean isValid = true;
        try{
            Pattern.compile(pattern);
        }catch (PatternSyntaxException exception) {
            isValid = false;
        }
        System.out.println(isValid ? "Valid" : "Invalid");
    }
}
