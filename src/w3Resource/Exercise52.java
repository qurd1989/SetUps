package w3Resource;

import java.util.Scanner;

public class Exercise52 {


    //Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.

    private static  boolean   sumUpThreeNumbers(int n, int m, int i){




        return((n + m == i) || (n + i == m) || (i + m == n));
    }

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number : ");

        int n  = scanner.nextInt();

        System.out.println("Enter Second Number : ");

        int m  = scanner.nextInt();

        System.out.println("Enter Third Number : ");

        int i  = scanner.nextInt();


        System.out.println("Sum of three number are : " + sumUpThreeNumbers(n , m, i));
    }
}
