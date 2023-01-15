package demo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherPattern {

    public static void main(String[] args) {


        String g = "Elmar 1234";

        System.out.println(howOld(g));



    }


    public static int howOld(final String herOld) {

        //your code here, return correct age as int;

        Pattern p = Pattern.compile("^\\d+");
        Matcher m = p.matcher(herOld);


        if (m.find()) {

            String age = m.group();

            return Integer.parseInt(age);
        }

        return -1;

    }
}
