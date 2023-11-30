package easy;

import java.util.Scanner;

public class EquilibriumPoint {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            int maxCycleLength = 0;

            for (int n = Math.min(i, j); n <= Math.max(i, j); n++) {
                int cycleLength = calculateCycleLength(n);
                if (cycleLength > maxCycleLength) {
                    maxCycleLength = cycleLength;
                }
            }

            System.out.println(i + " " + j + " " + maxCycleLength);
        }
    }

    private static int calculateCycleLength(int n) {
        int cycleLength = 1;

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            cycleLength++;
        }

        return cycleLength;
    }
}
