package ccsuEdu;

import java.util.Scanner;

public class ShortCircuitEvaluation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* int flour, sugar;

        System.out.println("Add The Ingredients to bake your cookies: ");

        System.out.println("Add Flour pls: ");
        flour = sc.nextInt();


        System.out.println("Add Sugar pls");
         sugar = sc.nextInt();


         if (flour>= 6 && 3 <=sugar) {

             System.out.println("Enjoy your cookies");

         }else
             System.out.println("Sorry no cookies for you! ");


         */

        /*

        //Renting car program

        System.out.println(" Please Enter your information to rent a car ");

        int age;
        double creditCard;


        System.out.println("Enter your age pls: ");
        age = sc.nextInt();

        System.out.println("Enter your credit car limit:");
        creditCard = sc.nextDouble();

        if (age >= 21 && 10000 <= creditCard) {

            System.out.println("You are elegible to rent a car.");
        }else
            System.out.println("have you considered a Bike. ");

         */

        //Boxer must weigh between 136 and 147  pounds

        int boxerWeigh;

        System.out.println("how heavy is boxer:");

        boxerWeigh =sc.nextInt();

        if (boxerWeigh >= 136 && boxerWeigh <= 147) {

            System.out.println("Boxer in range");

        }else
            System.out.println("Out of range");



    }
}