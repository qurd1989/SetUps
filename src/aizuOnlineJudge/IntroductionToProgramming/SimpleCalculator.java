package IntroductionToProgramming;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true) {


            int a = sc.nextInt();

            String op = sc.next();

            int b = sc.nextInt();

            if (op.equals("?"))
                break;


            simpleCalculator(a, b, op);

        }
    }

    public  static void simpleCalculator(int a, int b, String op) {


        switch (op) {

            case "+":
                 System.out.println(a + b);
                break;

            case "-":
                System.out.println(a - b);

                break;

            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:

        }
    }
}
