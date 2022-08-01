package recursion;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word and chech it, if it`s Palindrome : ");

        String s = sc.nextLine();

        if (isPalindrome(s) == true) {

            System.out.println( s + " is word is Palindrome");

        } if (isPalindrome(s) == false) {

            System.out.println( s + " is word is NOT Palindrome");
        }

        /*System.out.println("Is moon a palindrome? " +isPalindrome("moon"));
        System.out.println("Is noon a palindrome? " + isPalindrome("noon"));
        System.out.println("Is a a palindrome? " + isPalindrome("a"));
         System.out.println("Is aba a palindrome? " + isPalindrome("aba"));
        System.out.println("Is ab a palindrome? " + isPalindrome("ab"));*/

    }
    public  static boolean isPalindrome(String s){


        return isPalindrome(s, 0, s.length() - 1);

    }

    private static boolean isPalindrome(String s, int low, int high) {

        if (high <= low) {

            return true;


        } else if (s.charAt(high) != s.charAt(low)) {

            return false;

        } else {
            return isPalindrome(s, high - 1, low + 1);

        }
    }
    }

