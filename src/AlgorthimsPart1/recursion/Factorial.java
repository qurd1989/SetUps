package recursion;

public class Factorial {

    public static void main(String[] args) {

     int a = 4;


        System.out.println(solve(a));
    }

    private static int solve(int a) {

        if (a == 1) {
            return a;
        }
        return solve(a -1) *a;
    }
}
