package IntroductionToProgramming;

import javax.net.ssl.SNIHostName;
import java.util.ArrayList;
import java.util.Scanner;

public class StructuredProgramming {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t  = sc.nextInt();

        for (int i = 3; i <= t; i++) {
            int temp =i;
            if(i % 3 == 0){
                System.out.print(" " + i);
                continue;
            }
            while (temp > 1){
                if (temp % 10 == 3){
                    System.out.print(" " + i);
                    break;
                }
                temp/=10;
            }

        }
        System.out.println();
    }
}
