package HashMAp;

import java.util.Map;
import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(sHashing(s, n));

    }
    public static int sHashing(String s, int m){
        long sum = 0, mul = 1;
        for (int i = 0; i < s.length(); i++){
            mul = (i % 4 == 0) ? 1 : mul * 256;
            sum += s.charAt(i) * mul;

        }
        return (int)(Math.abs(sum) % m);
    }

}
