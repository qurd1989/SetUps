package IntroductionToProgramming;

import java.util.Scanner;

public class XCubic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        System.out.println(xCubic(n));


    }

    public static int xCubic(int n) {


        return n * n *n;
    }
}
