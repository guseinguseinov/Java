package Java;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int breadth = sc.nextInt();
        int height = sc.nextInt();

        if (height > 0 && breadth > 0) {
            System.out.println(height*breadth);
        }else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
