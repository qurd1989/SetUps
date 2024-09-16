package easy;

import java.util.Scanner;

public class NearlyLuckyNumber {
        public static boolean isLucky(String number) {
            for (char c : number.toCharArray()) {
                if (c != '4' && c != '7') {
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String n = scanner.nextLine();
            scanner.close();
            int luckyDigitCount = 0;
            for (char c : n.toCharArray()) {
                if (c == '4' || c == '7') {
                    luckyDigitCount++;
                }
            }
            // Convert lucky digit count to string to check if it is a lucky number
            String countStr = Integer.toString(luckyDigitCount);
            // Output "YES" if the count is a lucky number, otherwise "NO"
            if (isLucky(countStr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
