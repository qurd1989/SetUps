package demo1;

import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double payment = sc.nextDouble();
        sc.close();

        Locale indaiLocale = new Locale("en", "INDIA");


        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indaiLocale);
        NumberFormat ChineFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat FranceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);



        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment);
        String  china = ChineFormat.format(payment);
        String france = FranceFormat.format(payment);



        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);



    }
}
