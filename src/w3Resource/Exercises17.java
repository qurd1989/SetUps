package w3Resource;

import java.util.Scanner;
import java.lang.String.*;

public class Exercises17 {

    public static String add(String a1, String b1) {

        // converting binary to decimal number
        int firstBinary = Integer.parseInt(a1, 2);


        //converting bianry to decimal number
        int secondBinary = Integer.parseInt(b1, 2);

        //add two converted numbers
        int additionOfTwoNumbers = firstBinary + secondBinary;

        //and return sum of them
        return Integer.toBinaryString(additionOfTwoNumbers);

    }


    public static void main(String[] args) {


        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Add two Binary ");

            System.out.println("Enter fir number: ");
            String num1 = sc.next();


            System.out.println("Enter second number:");
            String num2 = sc.next();


            System.out.println("sum of two Binary numbers: " + add(num1, num2));

        }
    }


}