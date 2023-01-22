package demo1;

public class CountVowelsAndConsonants {


    public static void main(String[] args) {



        String str =  "Elmar";


        System.out.println(countVowelsAndConsonants(str));

    }

    public static  int  countVowelsAndConsonants(String str) {




        int vowels =0, consonants = 0;



        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (isVowelsAndConsonants(c)) {


                vowels++;


            } else

                return consonants++;


        }

        return vowels;

    }

    public static  boolean  isVowelsAndConsonants(char c) {


        return c == 'a' || c == 'e' || c == 'i' || c == 'o' ||c == 'u';


    }
}
