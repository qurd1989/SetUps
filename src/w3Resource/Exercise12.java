package w3Resource;

import java.util.Scanner;

public class Exercise12 {

     public static  int threeNumbers(int a, int b, int c) {

         int average = (a + b + c) / 3;

         return average;

     }
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the Numbers:  ");


        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        System.out.println(Exercise12.threeNumbers(a,b,c));
    }
}
