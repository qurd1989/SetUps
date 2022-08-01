package recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


     /*   long sumOfAllNumbers = sumOfAllNumbers(5);


        System.out.println(sumOfAllNumbers);


    }

    public static long sumOfAllNumbers(long number) {

        if (number == 0) {

            return 1;

        } else
            return number + sumOfAllNumbers(number - 1);*/



        //#########################################
        //second method on recursion



        System.out.println("Enter Number: ");

        int n = sc.nextInt();

        System.out.println("Factorial number of " + n + " is " + sumAllOfNumbers(n));


    }

    public  static int sumAllOfNumbers(int n) {
        if (n == 0) {
            return 1;


        }else {
            return n + sumAllOfNumbers(n-1);

        }
    }

}
