package w3Resource;

import java.util.Scanner;

public class Exercise54 {


    // Accepts three integers from the user and return true if two or more of them have the same rightmost digit

    private static   boolean rightMostNumber(int n, int m, int i, boolean nmi) {

        return ((n % 10 == m % 10) || (i % 10 == m % 10) || (n % 10 == i % 10));

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First number : ");

        int n = scanner.nextInt();

        System.out.println("Enter Second number : ");

        int m = scanner.nextInt();


        System.out.println("Enter Third number : ");

        int i = scanner.nextInt();





        System.out.println(" Sum of Three Number: " + rightMostNumber(n, m , i, true));

        System.out.println("\n");

    }
}
