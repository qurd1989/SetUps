package easy;

import java.util.Scanner;

public class SkibidusAndAmogu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String w = sc.nextLine();

            String pluralForm = w.substring(w.length() - 2) + "i";
            System.out.println(pluralForm);
        }
    }
}
