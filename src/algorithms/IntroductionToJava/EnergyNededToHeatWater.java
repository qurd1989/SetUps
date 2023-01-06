package IntroductionToJava;

import java.util.Scanner;

public class EnergyNededToHeatWater {

    /*
    (Science: calculating energy) Write a program that calculates the energy needed
    to heat water from an initial temperature to a final temperature. Your program
    should prompt the user to enter the amount of water in kilograms and the initial
    and final temperatures of the water. The formula to compute the energy is
            Q = M * (finalTemperature – initialTemperature) * 4184*/


    static double  heatWater(double initialTemperture, double finalTemperature, double kilograms) {


         double energy = kilograms * (finalTemperature - initialTemperture) * 4184;

        return energy;


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount of water in kilogram: ");
        double kilograms = sc.nextDouble();

        System.out.println("Enter initial Temperature: ");
        double initialTemperature = sc.nextDouble();

        System.out.println("Enter final Temperature: ");
        double finalTemperature = sc.nextDouble();




        System.out.println(heatWater(initialTemperature, finalTemperature, kilograms) + " energy need to heat water:");



    }
}
