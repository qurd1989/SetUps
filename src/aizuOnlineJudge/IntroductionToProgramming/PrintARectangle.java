package IntroductionToProgramming;

import java.util.Scanner;

public class PrintARectangle {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        while (true) {
            int w = sc.nextInt();
            int h = sc.nextInt();

            if (h == 0 && w == 0) break;
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {

                    System.out.print("#");
                }

                System.out.println();
            }

        }

    }
}
