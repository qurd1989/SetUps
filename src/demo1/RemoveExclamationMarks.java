package demo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveExclamationMarks {

    public static void main(String[] args) {


        String output  = "HEllo! ! im legion!";


        System.out.println(removeExclamationMarks(output));

        System.out.println(removeExclamationMarks2(output));

    }

    //first method to remove Exclamation mark
    public static String removeExclamationMarks(String s) {


        String output = "";

        for (int i = 0; i < s.length(); i++){


            char c = s.charAt(i);

            if (c != '!') {

                output += c;

            }
        }
        return output;

    }
    // Second method  to remove Exclamation mark

    public  static String removeExclamationMarks2(String s ) {


        Pattern exclamationMarksPattern = Pattern.compile("!");

        Matcher matcher = exclamationMarksPattern.matcher(s);

        return matcher.replaceAll("");


        //Gibran Castillo

    }
}
