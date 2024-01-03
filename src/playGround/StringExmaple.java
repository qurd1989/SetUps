package playGround;

import java.util.Arrays;

public class StringExmaple {
    public static void main(String[] args) {

        String s = "Elmar";
        int start = 0;
        int end = s.length()-1;

        System.out.println(solve2(s,start,end));

//        System.out.println(solve(s));
    }static String solve(String s ) {
        int end= s.length()-1;
        int start = 0;
        char []c = s.toCharArray();
        while (start <= end){
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
        String m=  String.valueOf(c);
        return m;
    }
    static String solve2(String s, int start, int end){

        char c[] = s.toCharArray();
        if (start <= end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            return solve2(String.copyValueOf(c), start + 1, end - 1);

        }
        return String.valueOf(c);
    }
}
