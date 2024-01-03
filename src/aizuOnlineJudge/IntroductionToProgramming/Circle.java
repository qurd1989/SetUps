package IntroductionToProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Circle {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        circummferenceAndArea(r);

    }

    private static void circummferenceAndArea(double r) {


        double area = Math.PI * Math.pow(r,2);
        double circ = Math.PI * 2 * r;

        System.out.printf("%.6f%n", area);
        System.out.printf("%.6f%n", circ);


    }


}
