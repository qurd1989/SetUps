package w3Resource;

import java.util.Scanner;

public class Exercise47 {

    //Accept a number and check the number is even or not

    private static int checkOddNumber( int n ) {


        if(n % 2 == 0) {

            System.out.println("0 is printed!");
        }else {
            System.out.println("1 is printed!");
        }

        return n;
    }


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to check if it is Odd or not!");


        int n = scanner.nextInt();

                checkOddNumber(n);
    }
}
