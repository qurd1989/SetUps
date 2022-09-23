package StarPatterns;

import java.util.Scanner;

public class RightSidedTriangle {


    private static  int  starstrianglePattern(int n) {
        for (int i = 1; i <=n; i++){

            for (int j = 1; j <= n- i;  j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        return n;

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row Number");
        int n = sc.nextInt();

        starstrianglePattern(n);
    }


    public static int x(int x, double b){

        return x;
    }
}
