package Collections.StarPatterns;

import java.util.Scanner;

public class SquarePattern1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a number to display the pattern");


        int n = sc.nextInt();



        for (int i = 0; i < n; i++){

            System.out.println(" ");

            for (int j = 0; j < n; j ++) {


                System.out.print("*");
                System.out.print(" ");

            }
            System.out.print(" ");

        }

    }
}
