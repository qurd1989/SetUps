package w3Resource;

import java.util.Scanner;

public class Exercise60 {


    public static void main(String[] args) {

       //Write a Java program to find the penultimate (next to last) word of a sentence.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Sentence to find word next to last word: ");

        String string  = scanner.nextLine();

        String[] words = string.split("[ ]+");

        System.out.println("Penultimate is: " + words[words.length -2]);


    }
}
