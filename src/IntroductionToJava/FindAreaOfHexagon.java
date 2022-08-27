package IntroductionToJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FindAreaOfHexagon {

    /*(Geometry: area of a hexagon) Write a program that prompts the user to enter the
    side of a hexagon and displays its area.*/

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of side: ");

        double s = sc.nextDouble();

        //calculate area of Hexagon
        double area = (((3 * Math.sqrt(3)) / 2) *Math.pow(s, 2));


        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println("The Area of the hexagon is " + df.format(area));


    }


}

