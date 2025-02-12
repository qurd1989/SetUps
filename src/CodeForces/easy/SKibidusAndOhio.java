package easy;

import java.util.Scanner;

public class SKibidusAndOhio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            boolean flag = false;

            for (int i = 1; i < n; i++) {
                if (s.charAt(i - 1) == s.charAt(i)) {
                    flag = true;

                    break;
                }
            }
            if (flag) {
                System.out.println(1);

            } else {
                System.out.println(n);
            }
        }
    }
}