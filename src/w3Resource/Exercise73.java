package w3Resource;

import java.util.Scanner;

public class Exercise73 {


    /*
    *  create a new string taking first and last characters from two given strings.
    * If the length of either string is 0 use "#" for missing character
    * */

    private  static String returnFirstAndLastCharachtersFromString( String first, String second) {


        String  result = " ";
        result += (first.length() >=1)? first.charAt(0) : "#";


        result += (second.length() >= 1) ? second.substring(second.length()-1) : "#";





        return result;


    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Value: ");
        String first = sc.nextLine();

        System.out.println("Enter second Value: ");
        String second = sc.nextLine();


        System.out.println("First and Second Value is: " + returnFirstAndLastCharachtersFromString(first, second));


    }
}
