package IntroductionToJava;

import javax.security.sasl.SaslClient;
import java.text.DecimalFormat;
import java.util.Scanner;

public class HowColdIsOutside {


  /*  *2.17 (Science: wind-chill temperature) How cold is it outside? The temperature alone is
    not enough to provide the answer. Other factors including wind speed, relative humidity,
    and sunshine play important roles in determining coldness outside.*/

    static void calculateTemperature(double ta, double v) {


      if ((v >=2) && (ta >= -58) && (ta <=41) == true){

            double twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);


            DecimalFormat df = new DecimalFormat("###.###");
            System.out.println("The wind chill index is " + df.format(twc));

        }else
          System.out.println("Please re-enter valid values for each required fields!");


    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Enter an value for wind speed in miles per hour: ");
        double v = sc.nextDouble();


        System.out.println("Enter the temperature in Fahrenheit: ");


        double ta = sc.nextDouble();


        calculateTemperature(ta, v);



    }
}
