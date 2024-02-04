package string;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Sortingcharacters {


    public static void main(String[] args) {

        String s = "Elmar";
        System.out.println(solve(s));
    }
    public  static String solve(String s) {
        int letters[] = new int[26];
        for (int x : s.toCharArray()){
            letters[x - 'a']++;
        }
        char[] s2 = new char[s.length()];
        int k = 0;
        for (int i =0; i < 26; i++){
            for (int j =0; j < letters[i]; j++){
               s2[k++]= (char) (i + 'a');
            }
        }
        return new String(s2);
    }

}
