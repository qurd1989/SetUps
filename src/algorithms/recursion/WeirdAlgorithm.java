package recursion;
import java.util.Scanner;

public class WeirdAlgorithm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        printWeirdSequence(n);
    }

    public static void printWeirdSequence(long n) {
        System.out.print(n + " ");

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            System.out.print(n + " ");
        }
    }
}