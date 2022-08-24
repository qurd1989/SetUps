package IntroductionToJava;

import java.util.Scanner;

public class VelocityDividedByTime {

    //

    static double velocity(double v0, double v1, double t) {

         double a = (v1 - v0) / t;

         return a;



    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting Velocity  in meters: " );
        double v0 = sc.nextDouble();

        System.out.println("Enter starting Velocity in meters: " );
        double v1 = sc.nextDouble();


        System.out.println("Enter time span in seconds: " );
        double t = sc.nextDouble();



        System.out.println("Results: " + velocity(v0, v1, t));

    }
}
