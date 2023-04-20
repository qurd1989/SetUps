package recursion;

public class FindFibonacci {

    public static void main(String[] args) {
       int A = 5;

        System.out.println(solve(A));
    }

    private static int solve(int a) {

        if(a <= 1) {
            return a;


        }

        return solve(a -1) + solve(a -2);
    }


}
