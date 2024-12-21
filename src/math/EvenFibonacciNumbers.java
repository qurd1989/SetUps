package math;

public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int sum = 0;
        while (b <= 4000000) {
            if (b % 2 == 0) {
                sum += b;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println(sum);
    }
}
