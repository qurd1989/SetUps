package w3Resource;

import java.util.Scanner;

public class Exercise20 {


    public static void main(String[] args) {


        //Converting decimal to HexaDecimal.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter decimal number: ");

        int number = sc.nextInt();

        //sorting number
        int rem;

        //sorting result
        String str = "";

        //provide hexadecimal number system
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (number > 0) {

            rem = number % 16;

            str = hex[rem] + str;
            number = number / 16;


        }
        System.out.println("Decimal to HexaDecimal: " + str);

    }


}
