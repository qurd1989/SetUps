package w3Resource;

import java.util.Scanner;

public class Exercise72 {


    private static String firstThreeCharacters(String str) {


       int firstThreeCaracters = str.length();


        if (firstThreeCaracters > 3) {

            str.substring(0,3);

        }else if (firstThreeCaracters <3) {

            System.out.println("####");
        }

        return  str;
    }

    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter Value: ");
        String str = scanner.nextLine();


        System.out.println("Value of substring is: " + firstThreeCharacters(str));

    }
}
