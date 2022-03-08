package w3Resource;

import java.util.Scanner;

public class Exercise21 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Input the decimal number
        System.out.println("Enter a Decimal Number");
        int decimal = in.nextInt();

        System.out.print("Octal: ");
        decToOctal(decimal);              //call the recursive function

    }

    private static void decToOctal(int n) {
        if (n > 0) {
            //recall by passing quotient
            decToOctal(n / 8);

            //output the remainder
            System.out.print(n % 8);
        }
    }

}
