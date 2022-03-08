package w3Resource;

import java.util.Scanner;

public class Exercise35 {

    public static  double areaOfPolygon(double s, double n) {

        double sumNumber = (n*(s*s))/(4*Math.tan(Math.PI/n));

        return  sumNumber;

    }
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);


        System.out.println("Enter number to get ara of Polygn:");


        double n = sc.nextDouble();
        double s = sc.nextDouble();

        System.out.println("The area of Polyfon: " + areaOfPolygon(s,n));
    }
}
