package IntroductionToProgramming;

import java.util.Scanner;

public class CircleInRectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int height = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int radius = sc.nextInt();


        if (x + radius > width || x -radius < 0 ||  y + radius > height || y - radius < 0) {

            System.out.println("No");


        }else
            System.out.println("Yes");
    }
}
