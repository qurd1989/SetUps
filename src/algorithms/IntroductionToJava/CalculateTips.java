package IntroductionToJava;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CalculateTips {


     static double calculateGratuity(double subtotal, double gratuityRate) {


        gratuityRate /= 100;

        return subtotal * gratuityRate;


    }

    static  double calculateTotalBill(double subtotal, double gratuity) {

         return subtotal + gratuity;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  subtotal bill:  ");

        double subtotal = sc.nextDouble();


        System.out.println("Enter value for gratuity:  ");
        double gratuityRate = sc.nextDouble();

        double gratuity = calculateGratuity(subtotal, gratuityRate);
        double total= calculateTotalBill(subtotal, gratuity);

        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("Gratuity is " + df.format(gratuity) +  "% And Total bill is " + df.format(total));


    }
}
