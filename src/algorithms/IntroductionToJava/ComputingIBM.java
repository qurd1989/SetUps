package IntroductionToJava;

import javax.sound.midi.ShortMessage;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ComputingIBM {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");

        double weightInPound = sc.nextDouble();

        System.out.println("Enter  height in inches: ");

        double heightInInche= sc.nextDouble();


        //converting pounds to kilogram
        double  kilogram = weightInPound * 0.454;

        //converting inches to meter
        double meter = heightInInche / 39.37;

        //it`s the formula  to find  BMI
        double bodyMassIndex = kilogram / Math.pow(meter,2);


        DecimalFormat df = new DecimalFormat("###.####");
        System.out.println("BMI is: " + df.format(bodyMassIndex));




    }
}
