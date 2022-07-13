package w3Resource;

import java.util.Locale;
import java.util.Scanner;

public class Exercise59 {

    //Write a Java program to convert a given string into lowercase.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter word to convert lowercase: ");

        String string = scanner.nextLine();

        String line = string.toLowerCase();

        System.out.println("Entered word converted to lowercase: " + line);



    }
}
