package IntroductionToJava;

import java.util.Scanner;

public class PrintATable {


    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);

/*
//call x method
        System.out.println("Enter value for x: ");
        int x= input.nextInt();
        System.out.println(x(x));
*/
        System.out.println("Enter  grade score to find out pay increase: ");
        int score = input.nextInt();

        System.out.println("Enter  current pay rate: ");
        double payRate = input.nextDouble();

        System.out.println(payRate(score,payRate));
    }

    public static boolean  x(int x){

        boolean results = true;

        if (x >= 0 == results) {

            return results;
        }else
            return false;


    }

    public  static boolean payRate(int score, double payRate) {

        if (score > 90 == true) {

            System.out.println("Your salary increased by 3%");
            double newPayRate = payRate + payRate * 0.03;
            System.out.println("New Salary is " + newPayRate);

            return true;

        }else
            System.out.println("You dont deserve it!");


        return false;
    }

}
