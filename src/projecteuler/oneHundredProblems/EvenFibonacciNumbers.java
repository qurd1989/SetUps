package oneHundredProblems;

public class EvenFibonacciNumbers {

    public static void main(String[] args) {

        int limit = 7;
        int reult = solve2(limit);
        System.out.println(reult);


    }
    public static int solve(int n ){

        if (n == 0) {
            return 1;
        }
        return n * solve(n-1);
    }
    public  static int solve1(int n) {
        int sum =1;

        while (n > 0) {
            sum *=n;
            n--;
        }
        return sum;
    }
    public static int solve2(int n) {
        if (n < 0) {
                throw new RuntimeException("Should be Positive Numbers");
        }
        if (n == 1) {
            return n;
        }

        return n * solve(n-1);
    }
}
