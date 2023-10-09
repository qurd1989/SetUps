package recursion;

import java.util.Map;
import java.util.Scanner;

public class DivideNumberRecursively {

    public static void main(String[] args) {

        Scanner ssc = new Scanner(System.in);

        int n = ssc.nextInt();

        for (int i = 0; i < n; i++) {
            int result = solve(i);
            System.out.println("2^" + i + result);
        }

    }
    public static int solve(int n) {

        if (n == 0) {
            return n;
        }
        int powerOfTwo = (int) Math.pow(2,n);
        System.out.println("2^" + n  + powerOfTwo);
        return powerOfTwo;
    }
}
