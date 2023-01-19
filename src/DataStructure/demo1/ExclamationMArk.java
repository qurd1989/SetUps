package demo1;

public class ExclamationMArk {

    //Replace all vowel to exclamation mark in the sentence

    public static void main(String[] args) {


        String str = "Elmar";


//        System.out.println(replace(str));

        System.out.println(replaceVowels(str));


    }


    public  static  String replace( String str) {


        StringBuilder sb  = new StringBuilder();


        for (int i = 0; i < str.length(); i++ ){

            char c = Character.toLowerCase(str.charAt(i));

            if (isVowels(c)){


                sb.append("!");


            }else {
                sb.append(c);

            }

        }

        return sb.toString();
    }

    public  static boolean isVowels(char c ) {


        return c == 'a' || c == 'i' || c == 'e' || c == 'u' || c == 'o';
    }


    //Array solution


    public static String replaceVowels(String str) {


        StringBuilder sb = new StringBuilder(str);
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};


        for (int i = 0;  i < vowels.length; i++) {

            for (int j = 0; j < sb.length(); j++) {


                if (sb.charAt(j) == vowels[i]) {
                    sb.setCharAt(i, '!');
                    break;

                }
            }

        }
        return new String(sb);
    }

}
