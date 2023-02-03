package IntroductionToProgramming;

import java.util.Scanner;

public class HowManyDivisors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number for a: ");
        int a = sc.nextInt();
        System.out.println("Enter a number for b:");
        int b = sc.nextInt();
        System.out.println("Enter a number for c:");
        int c = sc.nextInt();

       int count = howManyDivisors(a,b,c);

        System.out.println(count);

    }
    public static  int howManyDivisors(int a, int b, int c ) {

        int count = 0 ;

        for (int i = a; i<= b; i++) {

            if (c % i == 0) {
                count++;



            }
        }
            return (count);
     }
}
