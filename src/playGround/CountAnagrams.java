package playGround;

import string.Polindrome;

import java.util.Arrays;
import java.util.Scanner;

public class CountAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = sc.next();
        System.out.println(countAnagrams(s,str));

    }
    static boolean IsEqual(String s, String s1){
        char [] c =s.toCharArray();
        char [] c1 =s1.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c);
        if (Arrays.equals(c, c1)){
            return true;
        }else
            return false;

    }

    static int countAnagrams(String text, String word){
        int N = text.length();
        int n = word.length();
        int count = 0;
        for (int i = 0; i <= N-n; i++) {
            String s = text.substring(i, i + n);
            if (IsEqual(word, s)){
                count++;
            }
        }
        return count;
    }
}
