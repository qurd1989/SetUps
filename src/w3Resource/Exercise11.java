package w3Resource;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final double P_NUMBER  = 3.14;

        double radius;

        System.out.println("Enter Radius: ");
        radius = sc.nextDouble();

        double perimeterOFCircle = 2* (P_NUMBER * radius);

        double areaOfCircle = P_NUMBER * Math.pow(radius, 2);

        System.out.println("Perimeter is: " + perimeterOFCircle);

        System.out.println("Area is: " + areaOfCircle);



    }
}
