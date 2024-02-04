package string;

import java.awt.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacters {
    public static void main(String[] args) {

        String s = "geeksforgeeks";

        System.out.println(solve(s));
    }
    public static char solve(String s){

        int n= s.length();
        int index = 0;
        char ch = ' ';

        for (int i = 0; i < n; i++){
         if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i))+1) == -1){
             ch = s.charAt(i);
             break;
            }
        }
        return ch;
    }

    public static char solve1(String S) {
        int n = S.length();
        Map<Character, Integer> hs = new LinkedHashMap<>();
        char c[] = S.toCharArray();
        for (int i = 0; i < n; i++) {
            char ch = c[i];
            hs.put(ch, hs.get(ch) + 1);
        }

        for (char c1 : S.toCharArray()) {
            if (hs.get(c1) == 1) {
                return S.charAt(c1);
            }
        }
        return ('$');
    }
}
