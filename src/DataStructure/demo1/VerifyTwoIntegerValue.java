package demo1;

import java.util.Scanner;

public class VerifyTwoIntegerValue {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true) {

            System.out.println("Enter Number:");

            int num = sc.nextInt();

            if (num == 5) {

                break;


            }
            if (num <= 5) {

                System.out.println("outfit Number, try another number");

                break;

            }

            System.out.println("Entered number is correct: " + num);

        }
    }
}
