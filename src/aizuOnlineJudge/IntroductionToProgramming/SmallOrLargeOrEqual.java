package IntroductionToProgramming;

import java.util.Scanner;

public class SmallOrLargeOrEqual {


    public static void main(String[] args) {

        ////Write a program which print s small/large/equal relation of given two integers a and b

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        numbers(a, b);


    }

    public static void  numbers (int a, int b){

        if(a < b) {
            System.out.println("a < b");

        } else if (a > b) {

            System.out.println("a > b");

        }else
            System.out.println("a == b");

    }


}
