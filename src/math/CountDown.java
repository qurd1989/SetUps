package math;

import java.util.Scanner;

public class CountDown {

    static int countDown(int n) {


        if (n == 0) {
            System.out.println("You are done with counting");
        } else {
            System.out.println("n is " + n);

            countDown(n - 1);

        }
        return n;
    }

    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int x = sc.nextInt();

        System.out.println(countDown(x));
        System.out.println(fibonacci(x));

    }
}
