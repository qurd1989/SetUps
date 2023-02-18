package intermediate1;

public class CountFactors {

    public static void main(String[] args) {

        int A = 735684590;

        System.out.println(solve(A));
    }

    public static int solve(int A) {


        int count = 0;

        for (int i = 1; i <= A; i++) {

            if (A % i == 0)

                count++;


        }
        return count;
    }
}
