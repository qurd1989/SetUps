package recursion;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;

        System.out.println(sum(t));
    }
    public static  int sum( int n){

        if (n == 0) {
            return 1;
        }
        return n *sum( n-1);
    }
}
