package demo1;

public class Tree {


        public static void main(String[] args) {
            int n = 5;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 1; i <= 2; i++) {
                for (int j = 1; j <= n - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }

