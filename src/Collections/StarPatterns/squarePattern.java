package Collections.StarPatterns;

import java.util.Scanner;

public class squarePattern {


    private static  int  starsSquarePattern(int n) {

        long [] elmar = {1,2};

        for (int i = 1; i <=n; i++){

            for (int j = 1; j <= n; j++) {
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

        starsSquarePattern(n);
    }
}
