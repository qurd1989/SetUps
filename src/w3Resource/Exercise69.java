package w3Resource;

import java.util.Optional;
import java.util.Scanner;

public class Exercise69 {


    private  static  String  firstHalfOfText(int firstHalf, String str){

        return str.substring(firstHalf,str.length() /2);
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Text to print first half :");

        String str  = sc.nextLine();

        System.out.println("First half of Text is: " + firstHalfOfText(0,str));

    }
}
