package IntroductionToProgramming;

import java.util.Scanner;

public class CodeChef1 {


    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        for (int i = 0; i < t; i++) {

            int p = sc.nextInt();

            if( p > 10) {
                count++;
            }
            System.out.println(count);
        }
    }
}
