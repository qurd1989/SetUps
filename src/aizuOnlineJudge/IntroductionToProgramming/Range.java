package IntroductionToProgramming;

import java.util.Scanner;

public class Range {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        range(a, b, c);


    }
    public static void range(int a, int b, int c){



        if (a < b && c > b) {

            System.out.println("Yes");


        }else
            System.out.println("No");
    }

}
