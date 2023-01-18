package Introduction;

public class ClassR19 {


    public static void main(String[] args) {



        String str = "elmar#df@3 !go%#t";

        System.out.println(removePunct(str));

    }

    static String removePunct(String str) {


        StringBuilder sb = new StringBuilder();



        for (int i = 0 ; i < str.length(); i++) {

            char c = str.charAt(i);

            if ((c >= 'a' &&  c >= 'z') || (c >= '0' && c <= '9')) {


                System.out.println(sb.append(c));



            }
            }


        return  sb.toString();

    }
}
