package demo1;

import java.util.Scanner;

public class GettingIntegerValue {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        while (true) {


            System.out.println("Enter Number:");


            int num = Integer.valueOf(sc.nextInt());


            if(num <= 0) {
                System.out.println("Please provide next number");

                continue;
            }
            System.out.println("Right number was entered!");

        }



    }

}