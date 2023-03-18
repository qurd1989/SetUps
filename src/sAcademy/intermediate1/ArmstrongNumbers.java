package intermediate1;

public class ArmstrongNumbers {

    public static void main(String[] args) {

        int n = 35;
        System.out.println(solve(n));
    }

    private static int solve(int n) {

        int sum = 0;
        int dup = n;
        int temp = 0;


        while (n > 0) {

            int ld = n % 10;

            sum += (ld * ld * ld);

            n = n / 10;
        }
        temp =sum;
        if (temp == dup)
            return 1;

        else
            return 0;
    }
}
