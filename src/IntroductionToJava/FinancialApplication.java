package IntroductionToJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FinancialApplication {

    private static final  double ANNAUL_INTEREST_RATE = 5;



   /* (Financial application: compound value) Suppose you save $100 each month into
    a savings account with an annual interest rate of 5%. Thus, the monthly interest
    rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
100 * (1 + 0.00417) = 100.417*/


    public static double monthlySavings( double amount, double anualInterestRate, int months) {



        double monthInterestRate = anualInterestRate /1200;

        double value = 0;

        for (int i = 1; i <= months; i++) {

            value = (amount + value) * ( 1 + monthInterestRate);



        }

        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("Amount in  savings account after " + months + " months is " + df.format(value));

        return value;
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an amount for savings account: ");
        double amount = sc.nextDouble();

        System.out.println("Enter the annaul interest rate: ");
        double anualInterestRate = sc.nextDouble();

        System.out.println("Enter the number of months: ");
        int months  = (int) sc.nextDouble();




        monthlySavings(amount,anualInterestRate,months);




    }

}
