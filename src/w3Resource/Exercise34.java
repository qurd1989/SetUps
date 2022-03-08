package w3Resource;

import java.util.Scanner;

public class Exercise34 {


    // Calculate area of Hexagon

    public static double areaofHexagon(double h) {

        double sumNumber = (6*(h*h))/(4*Math.tan(Math.PI/6));

        return  sumNumber;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to calculate area of Hexagon:");

        double num = sc.nextDouble();

        System.out.println("The area of Hexagon is: " + areaofHexagon(num));




    }
}
