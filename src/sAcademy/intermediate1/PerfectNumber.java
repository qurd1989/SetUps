package intermediate1;

public class PerfectNumber {

    public static void main(String[] args) {


        int A = 1;
        System.out.println(solve(A));

    }
    public static int solve(int A) {
        int sum = 1;
        for (int i = 2; i * i <= A; i++) {
            if (A % i == 0) {
                sum += i + A / i;
            }
        }
        if (A == sum) {
            return 1;
        } else {
            return 0;
        }
    }
}
