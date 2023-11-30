package playGround;

import java.awt.*;
import java.util.Scanner;

public class PrefixAndPostfix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        char c = sc.next().charAt(0);
//
//        f(n);
//        System.out.println(n);
        System.out.println(f(n, m, c));

    }

    public static  double f(double x, double y, char c) {

        double ans = 0;
        switch (c){
            case '+':
                ans = x + y;
                break;
            case '-':
                ans = x - y;
                break;
            case '*':
                ans = x * y;
                break;
            case '/':
                ans = x / y;
                break;
            default:
                System.out.println("Entered Wrong input! ");
        }
        System.out.println("The final  result: ");
        System.out.println();
        System.out.print(x +" " +  c + " " + y+ " is " );
        return ans;
    }
}
