package math;

public class Recurse {

    public static char first(String s) {

        return s.charAt(0);

    }

    public static String rest(String s) {

        return s.substring(1, 2);

    }

    /*
     * */

    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    public static String reverseString(String s) {

        if (s.isEmpty()) {

            return s;

        } else

            return reverseString(s.substring(1)) + s.charAt(0);


    }

    public static void main(String[] args) {


        String s = "Elmar";
        System.out.println(first(s));
        System.out.println(rest(s));
        System.out.println(middle(s));
        System.out.println(reverseString(s));

    }
}
