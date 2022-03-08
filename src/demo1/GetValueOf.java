package demo1;

import java.util.Scanner;

public class GetValueOf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {

            int number = Integer.valueOf(sc.nextLine());

            if (number == 0) {
                break;

            }
            System.out.println("your input: " +number);

        }
        System.out.println("Done, Thank you ");
    }
}
