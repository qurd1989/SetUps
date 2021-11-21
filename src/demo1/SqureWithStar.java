package demo1;

import java.util.Scanner;

public class SqureWithStar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the numbers of the stars: ");



        int row = sc.nextInt();
        int col = sc.nextInt();

        for (int i=1; i<=row; i++) {
            for (int j =1; j<=col; j++)
                if (i==1 || i==col || (j==1 || j== col))
                    System.out.print("*");
                else
                    System.out.print(" ");

                System.out.println();
        }
    }
}
