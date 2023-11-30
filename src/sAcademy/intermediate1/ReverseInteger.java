package intermediate1;



public class ReverseInteger {
    public static void main(String[] args) {

        int n = 1221;

        System.out.println(solve(n));
    }

    private static int solve(int n) {

        int rev = 0;

        int dup = n;

        while (n > 0) {
            int ld = n % 10;

            rev = rev * 10 + ld;

            n = n/10;
        }
        if(rev == dup) {
            return 1;
        }else
        return 0;
    }
}
