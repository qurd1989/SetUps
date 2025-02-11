package easy;

import java.util.Scanner;

public class SKibidusAndOhio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();  // Consume newline after reading t

        while (t-- > 0) {
            String s = sc.nextLine();
            int minLength = countUniqueCharacterGroups(s);
            System.out.println(minLength);
        }
        sc.close();
    }

    private static int countUniqueCharacterGroups(String s) {
        int minLength = 0;  // Count unique character groups

        for (int i = 0; i < s.length(); i++) {
            // Count only the first occurrence of a new group
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                minLength++;
            }
        }
        return minLength;
    }
}