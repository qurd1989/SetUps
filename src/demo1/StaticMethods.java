package demo1;

import java.util.Scanner;

public class StaticMethods {

    public static int max(int a, int b, int x) {

        if (a > b && a > x) {
            return a;

        } else if (b > a && b > x) {

            return b;

        } else
            return x;

    }

    // Write a static method odd() that takes three boolean arguments and returns
    //true if an odd number of the argument values are true, and false otherwise.
    public static boolean odd(boolean a, boolean b, boolean x) {

        if (a ^ b ^ x) {

            System.out.println("");
            return true;

        } else
            return false;
    }

//    Write a static method eq() that takes two int arrays as arguments and returns true
//    if the arrays have the same length and all corresponding pairs of of elements are equal, and false otherwis

    public  static boolean eq(int[] a, int[] b) {

        if (a.length == b.length) {
            return true;

        }else
            return false;

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();

        boolean x1 = sc.nextBoolean();
        boolean x2 = sc.nextBoolean();
        boolean x3 = sc.nextBoolean();


        //enter length of arrays
        int[] givenArray = new int[a];
        int [] givenArray1 = new int[b];


        for (int i = 0; i < givenArray.length; i++) {

        }

//        System.out.println(max(a, b, x));
//        System.out.println(odd(x1,x2,x3));


    }
}
