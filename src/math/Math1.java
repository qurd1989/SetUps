package math;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Math1 {


    /*
    *
    * Area and perimeter of a rectangle
    *
    *
    * */



    public static List sumOfRectangle(double b, double h){


        double area = b * h;
        System.out.println("Area of Rectangle is: " + area);

        double perimeter = 2 * b + 2 * h;
        System.out.println("Perimeter of Rectangle is: " + perimeter);

        return Arrays.asList(area, perimeter);


    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Enter base of rectangle: ");
        double b = sc.nextDouble();


        System.out.println("Enter height of rectangle: ");
        double h = sc.nextDouble();


       sumOfRectangle(b,h);




    }


}
