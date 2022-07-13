package w3Resource;

import java.util.Scanner;

public class Exercise61 {

    //Write a Java program to reverse a word.

    public static void main(String[] args) {




        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String  str=sc.nextLine();
        System.out.println("Reverse of a String  is : "+reverse(str));
    }
    static String reverse(String s)
    {
        String rev="";
        for(int j=s.length();j>0;--j)
        {
            rev=rev+(s.charAt(j-1));
        }
        return rev;

        

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sentence reverse it: ");


        String line = scanner.nextLine();

        String [] words = line.split(" ");

        for (int i = words.length -1; i>=0;  i--){


            System.out.print(words[i] + " ");
        }


         */
    }
}
