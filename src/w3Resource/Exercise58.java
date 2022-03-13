package w3Resource;

import java.util.Locale;

public class Exercise58 {


    public static void main(String[] args) {

        //Write a Java program to capitalize the first letter of each word in a sentence.

        String words = "practice is part of learning!";

        String split[] = words.split("\\s");

        String newString = " ";

        for (String w : split){

            String firstLetter = w.substring(0,1);
            String restOfLetters = w.substring(1);

            newString += firstLetter.toUpperCase() + restOfLetters + " ";




        }
        System.out.println(newString.trim());
    }



}
