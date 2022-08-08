package StarPatterns;

import java.util.Scanner;

public class DecreasingTrianglePattern {


    private static  int  starstrianglePattern(int n) {
        for (int i = 1; i <=n; i++){

            for (int j = i; j <= n;  j++) {
                System.out.print("*" + " ");
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


}
