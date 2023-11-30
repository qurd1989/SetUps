package oneHundredProblems;

import java.util.Scanner;

public class MultiplesOfThreeOrFive {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        System.out.println(solve1(n));
    }

    public static long solve(long n) {

        long count = 0;
        for (int i = 1; i < n; i++) {

            if (i % 3 == 0) {
                count += i;
                continue;
            }
           if (i % 5 == 0) {
                count += i;

            }
        }

        return count;
    }
    public static  long solve1(long n) {

        return caluculate(n, 3) + caluculate(n, 5) - caluculate(n, 15);
    }
    public  static long caluculate(long limit, long divisor) {
        long multpiles = (limit -1)/divisor;

        return divisor * multpiles *(multpiles + 1)/2;
    }
}
