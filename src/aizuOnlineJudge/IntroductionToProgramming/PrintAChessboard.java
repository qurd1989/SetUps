package IntroductionToProgramming;

import java.util.Scanner;

public class PrintAChessboard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            int w = sc.nextInt();
            int h = sc.nextInt();

            StringBuilder sb = new StringBuilder();
            if (h == 0 && w ==0) {
                break;
            }

            for (int i = 0; i < w; i++) {
             boolean which = i % 2==0;

             for (int j = 0; j < h; j++) {

                 if (which) {
                     sb.append("#");
                 }
                 else
                     sb.append(".");
                 which = !which;

             }
               sb.append("\n");
            }
            System.out.println(sb);
        }
    }
}
