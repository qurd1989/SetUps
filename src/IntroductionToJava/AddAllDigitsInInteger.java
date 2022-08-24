package IntroductionToJava;

import java.util.Scanner;

public class AddAllDigitsInInteger {


    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  number between 0 and 1000: ");
        int  num = sc.nextInt();


        int lessThanTen =  num % 10;
        num /= 10;

        int tensInHundreds  = num % 10;
        num /= 10;

        int hundreds =  num % 10;
        num /= 10;

        int sum  = lessThanTen + tensInHundreds + hundreds;

        System.out.println("Sum of All digits is " + sum);


    }
}
