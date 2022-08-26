package IntroductionToJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FindingRunawayLength {

   /* (Physics: finding runway length) Given an airplane’s acceleration a and take-off
    speed v, you can compute the minimum runway length needed for an airplane to
    take off using the following formula:*/




    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value for speed in meter/second: ");
        double v = sc.nextDouble();


        System.out.println("Enter a value for Airplane`s acceleration: ");

        double a = sc.nextDouble();



        double length = (v * v) / (2 * a);

        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("The minium runaway lenght for this plane is: " + df.format(length));




    }
}
