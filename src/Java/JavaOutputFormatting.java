package Java;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x = sc.nextInt();

            String numStr;

            if (x < 100) {
                if (x >= 10) {
                    numStr = "0" + Integer.toString(x);
                }else {
                    numStr = "00" + Integer.toString(x);
                }
            }else {
                numStr = Integer.toString(x);
            }

            int loop = 15 - s1.length();

            for (int j = 0; j < loop; j++) {
                s1 = s1 + " " ;
            }
            System.out.println(s1 + numStr);
        }
        System.out.println("================================");

    }
}
