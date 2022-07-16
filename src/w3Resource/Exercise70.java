package w3Resource;

import java.util.Scanner;

public class Exercise70 {


    private static String addingStringsTogather(String shortString, String longString) {


        return shortString + longString + shortString;

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Short  Text:");
        String shortString = sc.nextLine();

        System.out.println("Enter Long Text:");
        String longString = sc.nextLine();



        System.out.println(addingStringsTogather(shortString,longString));
    }
}
