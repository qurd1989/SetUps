package debugger_advanced;

public class debugger_Advanced1 {
    public static void main(String[] args) {
        final int LIMIT = 4_000_000; // Upper limit for Fibonacci numbers
        long sum = 0;
        long a = 1, b = 2;

        while (b <= LIMIT) {
            if (b % 2 == 0) {
                sum += b;
            }
            long temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println("Sum of even-valued terms: " + sum);
    }

}
