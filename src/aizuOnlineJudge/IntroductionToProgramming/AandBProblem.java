package IntroductionToProgramming;

import java.util.Scanner;

public class AandBProblem {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();

        int b = sc.nextInt();


       howManyDivisors(a,b);

    }
    public static  void howManyDivisors(int a, int b) {

        int d = a / b;
        int r = a % b;
        double f = (double)a / b;

        System.out.println(d + " " + r +" "+ String.format("%.5f", f));

    }



    }