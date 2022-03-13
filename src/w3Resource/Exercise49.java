package w3Resource;

import java.util.Scanner;

public class Exercise49 {

    //Convert a string to an integer in Java

    private static String  ConvertIntTostring(String n) {



        int result =  Integer.parseInt(n);


        System.out.printf("The Integer  value is : %d" , result);


        return n;
    }

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String to covert to int!");


        String str = scanner.nextLine();

        ConvertIntTostring(str);

    }
}
