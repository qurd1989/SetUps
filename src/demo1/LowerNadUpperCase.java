package demo1;

public class LowerNadUpperCase {


    public static void main(String[] args) {

        String output = "Elmar DidOkLTWdeee";


        System.out.println(toAlternativeString(output));
        System.out.println(toAlternativeString1(output));

    }


    public static String toAlternativeString(String string) {

        String output = "";

        for (int i = 0; i < string.length(); i++) {

            char c = string.charAt(i);

            if (Character.isLetter(c)) {

                if (Character.isLowerCase(c)) {

                    output += Character.toUpperCase(c);
                }

                if (Character.isUpperCase(c)) {

                    output += Character.toLowerCase(c);


                } else {
                    output += c;

                }

            }

        }


        return output;


    }


    public static String toAlternativeString1(String string) {


        StringBuilder sb = new StringBuilder(string.length());

        for (char c : string.toCharArray()) {

            if (Character.isUpperCase(c)) {

                sb.append(Character.toLowerCase(c));


            } else if (Character.isLowerCase(c)) {

                sb.append(Character.toUpperCase(c));


            } else {
                sb.append(c);

            }

        }

        return sb.toString();

    }
}
