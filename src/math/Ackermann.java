package math;

import java.util.Scanner;

public class Ackermann {

    public static int ackermannFunction(int m, int n) {

        if (m < 0 && n < 0){

            throw new IllegalArgumentException("NOn-negative argument Only!");
        }

        if (m == 0) {

            return n + 1;

        } else if (m > 0 && n == 0) {

                return ackermannFunction(m - 1, 1);


        } else if(m > 0 && n > 0){


            return ackermannFunction(m-1, ackermannFunction(m, n-1));

        }else
            return 0;

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  m and n value: ");

        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(ackermannFunction(m,n));


    }

}
