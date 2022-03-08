package w3Resource;

import java.util.Scanner;

public class Exercise32 {

    public static void main(String[] args) {

        // compare two numbers

        Scanner sc = new Scanner(System.in);

        System.out.println(" Compare given two numbers:  ");

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();


        System.out.println("enter second number: ");
        int num2 = sc.nextInt();


        if (num1 == num2) {
            System.out.println("Num1 is equal to Num2");

        } else if (num1 > num2) {
            System.out.println("Num1 is greater than Num2");

        } else if (num1 < num2) {
            System.out.println("Num1 is smaller  than Num2");



        }else if (num1 != num2) {

            System.out.println("Num1 is not equal to Num2");
        }
    }
}
