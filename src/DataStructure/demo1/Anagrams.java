package demo1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function


        // get given String lower cases and replace them with replace method
        char[] arrayA = a.toLowerCase().replaceAll("[\\s]", "").toCharArray();
        char[] arrayB = b.toLowerCase().replaceAll("[\\s]", "").toCharArray();



        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        return Arrays.equals(arrayA, arrayB);
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }
}
