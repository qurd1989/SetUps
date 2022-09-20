package math;

public class Factorial {

    public static long factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {



        int x = 6;

        System.out.println(factorial(x));

    }
}
