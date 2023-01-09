package demo1;

public class VowelRemover {


    public static void main(String[] args) {

        String str = "Elmar";

        System.out.println(shortCut(str));


    }

    public  static String shortCut(String input){

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < input.length(); i++){

            char c = input.charAt(i);

            if (!isWovel(c)){

                sb.append(c);


            }

        }
        return sb.toString();
    }
    public static  boolean isWovel(char c) {

        c = Character.toLowerCase(c);

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

    }
}
