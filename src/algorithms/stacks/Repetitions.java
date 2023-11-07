package stacks;

import java.util.Scanner;

public class Repetitions {
        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            sc.next();

                String s  =sc.nextLine();
                char arr[] = s.toCharArray();
                char current = ' ';
                int count =1;
                int max  = 1;
                for (int i = 1; i < s.length(); i++) {
                    if (arr[i] != current) {
                        current = arr[i];
                        count = 0;
                    }
                    if (arr[i] == current) {
                        count++;
                    }
                }

                max  = Math.max(max , count);
                System.out.println(max);

        }
}
