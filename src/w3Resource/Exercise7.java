package w3Resource;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int x = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(x + " x " + (i+0) + " = " + (x * i ));
        }
    }
}
