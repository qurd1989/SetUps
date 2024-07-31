package w3Resource;

import java.math.BigInteger;
import java.util.Scanner;

public class EfficientPanLinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            BigInteger n = sc.nextBigInteger();
            BigInteger c = n.mod(BigInteger.valueOf(20));
            System.out.println(c);

        }
    }
}
