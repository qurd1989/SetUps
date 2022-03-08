package w3Resource;

import java.util.Scanner;

public class Exercises18 {

    static String add(String a1, String b1) {

        int firstBinary = Integer.parseInt(a1, 2);

        int secondBinary = Integer.parseInt(b1, 2);

        //add two decimal number after converting them in decimal numbers
        int sumOfTwoDecimalNumbers = firstBinary * secondBinary;

        return Integer.toBinaryString(sumOfTwoDecimalNumbers);

    }

    public static void main(String[] args) {


        // multiply two binary

        Scanner sc = new Scanner(System.in);

        System.out.println(" multiply two Binary numbers: ");


        System.out.println("Enter  first Binary number pls: ");
        String num1 = sc.next();

        System.out.println("Enter  Second Binary number pls: ");
        String num2 = sc.next();


        System.out.println("Sum of Two Binary Numbers is: " + add(num1, num1));

    }
}
