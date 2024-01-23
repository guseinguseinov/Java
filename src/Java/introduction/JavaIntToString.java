package Java.introduction;

import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        String str = num.toString();

        if (str.isEmpty()) {
            System.out.println("Wrong answer");
        }
        else {
            System.out.println("Good job");
        }
    }
}
