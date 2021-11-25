package w3Resource;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);

        System.out.println("Enter First number: ");
        int x = sc.nextInt();

        System.out.println("Enter Second number: ");
        int y  = sc.nextInt();


        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));

        System.out.println(x + " x " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + (x / y));
        System.out.println(x + " % " + y + " = " + (x % y));



    }
}
