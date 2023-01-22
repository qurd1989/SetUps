package demo1;

public class ReverseWords {

    public static void main(String[] args) {


        String str = "Elnmar is Here!";

        System.out.println(reverseWords(str));
    }



    public  static String reverseWords( String str ) {

        String[] words = str.split(" ");


        StringBuilder sb = new StringBuilder();


        for (int i = words.length -1; i >= 0;  i--) {

            sb.append(words[i]);

            if (i > 0) {

                sb.append(" ");

            }

        }

        return sb.toString();
    }
}
