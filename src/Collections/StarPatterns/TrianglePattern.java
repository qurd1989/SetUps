package Collections.StarPatterns;

import java.util.Scanner;

public class TrianglePattern {


    private static  int  starstrianglePattern(int n) {
        for (int i = 1; i <=n; i++){

            for (int j = 1; j <= i;  j++) {
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