package easy;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if (isTranslation(s, t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
    public static boolean isTranslation(String s, String t) {
        int n = s.length();
        if (n != t.length()) {
            return false;
        }
        for (int i = 0; i < n/2; i++) {
            if (s.charAt(i) != t.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
