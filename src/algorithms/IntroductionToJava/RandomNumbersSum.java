package IntroductionToJava;

import java.util.Scanner;

public class RandomNumbersSum {


    public static void main(String[] args) {


        int  num1 = (int)(Math.random()* 10);
        int  num2 = (int)(Math.random()* 10);


        if (num1 < num2) {

            int temp = num1;
            num1 = num2;
            temp = num2;

        }

        System.out.println("What is " + num1 + " - " + num2 + " ?");

        Scanner sc = new Scanner(System.in);

        int answer  = sc.nextInt();


        if (num1 + num2 == answer) {

            System.out.println("You are correct!");
        }else{
            System.out.println("Your answer is wrong!");
            System.out.println(num1 + " - " + num2 + " should be " + (num1 - num2));
        }

    }
}
