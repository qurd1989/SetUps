package demo1;

import java.util.Scanner;

public class CalculateTax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       final  double TAX_RATE = 0.08;




        double price;
        double tax;


        System.out.println("Enter the item price: ");

        price = sc.nextDouble();

        if (price >= 100.0) {
            tax = price * TAX_RATE;


        }else
            tax =0.0;

        System.out.println("Item cost: " + price + ", Tax: " + tax +" price " +(price+tax));

    }
}
