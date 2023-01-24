package IntroductionToProgramming;

import java.util.Scanner;

public class Watch {

    private static final  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {





        int s = sc.nextInt();

        int hour = s/3600;
        int  minute = (s%3600) /60;
        int  second = (s%3600) %60;

        System.out.printf("%d:%d:%d\n",hour,minute,second);



        sc.close();
    }


}
