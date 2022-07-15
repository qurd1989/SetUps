package w3Resource;

import java.util.Scanner;

public class Exercersie63 {

    public static int outcome(int x, int y) {


        if (x == y)

            return 0;


            if (x % 4 == y % 4)
                return (x < y) ? x : y;


                return (x > y) ? x : y;






    }

    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);

        int x;
        int y;


        System.out.println("Enter two number to compare one another one!");


        System.out.println("Enter first number: ");

        x = sc.nextInt();

        System.out.println("Enter second number: ");


        y = sc.nextInt();


        System.out.println("Outcome: " +outcome(x,y));


    }
}
