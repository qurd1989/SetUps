package IntroductionToJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertFeetIntoMeters {



    //convert feet into meter

    public  static final  double  METER_TO_FEET_WITH_MULTIPLICATION = 0.3048;
    public  static final double METER_TO_FEET_WITH_DIVISION = 3.28;

    public  static double feetToMeter(double feet) {

        double meter;

        if(METER_TO_FEET_WITH_DIVISION >= 0) {

            meter = feet / METER_TO_FEET_WITH_DIVISION;


        }else {

            meter = feet * METER_TO_FEET_WITH_MULTIPLICATION;


        }
        return meter;

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value for feet:  ");

        double feet = sc.nextDouble();


        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println(feet + "  feet is " + df.format(feetToMeter(feet)) + " meters.");


    }
}
