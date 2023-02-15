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


        double area = (double) Math.PI * Math.pow(r,2);
        double circ = (double) Math.PI * 2 * r;

        System.out.println(String.format("%.6f", area));
        System.out.println(String.format("%.6f", circ));


    }


}
