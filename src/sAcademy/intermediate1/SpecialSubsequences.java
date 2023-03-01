package intermediate1;

public class SpecialSubsequences {

    public static void main(String[] args) {


        String A = "ABCGAG";

        System.out.println(solve(A));
    }

    public static long solve(String A) {


        long ans = 0;
        long count = 0;


        for (int i = 0; i < A.length(); i++) {

            if (A.charAt(i) == 'A') {

                count++;

            } else if (A.charAt(i) == 'G') {

                ans += count;

            }
        }

        return ans;

    }
}
