package IntroductionToProgramming;

import javax.net.ssl.SNIHostName;
import java.util.ArrayList;
import java.util.Scanner;

public class StructuredProgramming {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t  = sc.nextInt();

        for (int i = 0; i < t; i++) {

            for (int j = 0; j < i;  j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
