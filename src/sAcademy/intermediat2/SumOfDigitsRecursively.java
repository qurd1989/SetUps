package intermediat2;

import java.util.Scanner;

public class SumOfDigitsRecursively {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(solve(a));
    }

    public static int solve(int a) {
        if (a <= 1) {
            return a;

        }
        return (a % 10 + solve(a / 10));
    }
}
