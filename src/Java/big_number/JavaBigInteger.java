package Java.big_number;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        getResults(a, b);
    }

    private static void getResults(BigInteger a,BigInteger b) {

        BigInteger sum = a.add(b);
        System.out.println(sum);

        BigInteger mult = a.multiply(b);
        System.out.println(mult);
    }
}
