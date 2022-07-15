package w3Resource;

import java.util.Scanner;

public class Exercise64 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");

        int a = sc.nextInt();

        System.out.println("Input the first number: ");
        int b = sc.nextInt();

        int sum;

        if (a > b) {
            int divided = a / b;

            sum = a - (divided * b);

        }else {


            int divided = b / a;

            sum = b - (divided * a);

        }
        System.out.println(sum);




    }
}
