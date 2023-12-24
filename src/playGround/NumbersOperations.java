package playGround;

import java.util.Scanner;

public class NumbersOperations {

    public static void main(String[] args) {

        Scanner scv = new Scanner(System.in);
        int n = scv.nextInt();

        System.out.println(solve(n));
    }

    public static int solve(int x) {
        long rev =0;
        int neg = x;
        if (x < 0){
            neg = -1*x;
        }
        while (neg >0){

           int  pop = x% 10;

            rev = (rev * 10) +pop;
            neg= neg/ 10;
        }

        if(rev > Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0) {
            return (int) rev * -1;
        }
        return (int)rev;
    }
}
