package IntroductionToJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertPoundsIntoKilogram {


    public  static  final double POUND_TO_KILOGRAM_BY_MULITIPLICATION = 0.454;


    static double poundToKilogram(double pound) {


        double kilogram = pound * POUND_TO_KILOGRAM_BY_MULITIPLICATION;

        return kilogram;

    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value for Pounds:  ");

        double pound = sc.nextDouble();


        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println(pound + "  pounds are " + df.format(poundToKilogram(pound)) + " Kilograms.");

    }




}
