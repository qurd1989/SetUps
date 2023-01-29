package IntroductionToProgramming;

import java.util.Scanner;

public class PrintTestCases1 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int x, count=1;

        while(true){

            x = sc.nextInt();

            if (x ==0){
                break;
            }
            else
                System.out.println("Case " + count + ": " + x);
            count++;
        }
    }
}
