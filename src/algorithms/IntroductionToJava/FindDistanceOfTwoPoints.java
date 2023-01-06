package IntroductionToJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FindDistanceOfTwoPoints {


    /*

    (Geometry: distance of two points) Write a program that prompts the user to
    enter two points (x1, y1) and (x2, y2) and displays their distance*/

     public  static void distanceBetweenTwoPoint(double x1, double y1, double x2, double y2) {


         double  totalDistanceBetweenTwoPoint =  Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));

         DecimalFormat df = new DecimalFormat("###.####");
         System.out.println("Distance wetween two points is: " + df.format(totalDistanceBetweenTwoPoint));



     }



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.println("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.println("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.println("Enter y2: ");
        double y2 = sc.nextDouble();



        distanceBetweenTwoPoint(x1, y1, x2, y2);
    }
}
