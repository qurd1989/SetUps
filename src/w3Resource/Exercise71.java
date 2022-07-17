package w3Resource;

import java.util.Scanner;

public class Exercise71 {



    private static String concantenationOfTwoString(String str, String str1) {


        return str.substring(1) + str1.substring(1);

    }

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter first Value: ");
        String str = scanner.nextLine();


        System.out.println("Enter Second Value: ");
        String str1 = scanner.nextLine();



        System.out.println("Concatenation of the two Values:  " + concantenationOfTwoString(str,str1));


    }
}
