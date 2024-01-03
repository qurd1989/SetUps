package recursion;

import java.util.Arrays;

public class PrintNumbersNToOne {
    public static void main(String[] args) {

        int n = 10;
        solve(n);

    }

    private static void solve(int n) {

        if (n ==0){
            return;
        }
        solve(n-1);
        System.out.println(n);

    }
}
