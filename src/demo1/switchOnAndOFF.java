package demo1;

import java.util.Scanner;

public class switchOnAndOFF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String answer;

        System.out.print("Is it raining? (Y or N): ");
        answer = sc.nextLine();

        if (answer.equals("Y")) {
            System.out.println("Wipers on");


        }else
            System.out.println("Wipers off");




        int distanceToPump = 45;


    }




    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        // Your code here!

       return mpg * fuelLeft >= distanceToPump;

    }

}
