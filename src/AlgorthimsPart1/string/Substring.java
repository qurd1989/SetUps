package string;

import java.util.Stack;

public class Substring {
    public static void main(String[] args) {
        String s = "Elmar dev sikmo dfdrer erere ssdsd";
        solve(s);
        String s1 = "Elmar";
        System.out.println(solve1(s1));
    }
    static void solve(String s) {
        int firstIndex = s.indexOf('s');
        System.out.println("S is :" +firstIndex);
        int lastIndex = s.lastIndexOf('s');
        System.out.println("S is :" +lastIndex);
        int first_in = s.indexOf('s', 10);
        System.out.println("S is :" +lastIndex);

        int index = s.indexOf("Elmar");
        System.out.println(index);

        System.out.println(s.startsWith("Elmar"));
        System.out.println(s.startsWith("si",12));
        System.out.println(s.endsWith("ssdsd"));

    }
    public static  String solve1(String s ) {
        Stack<Character> stack = new Stack<>();
        char c[] = s.toCharArray();
        for (int i = 0; i<=s.length()-1; i++){
            stack.push(c[i]);
        }

        for (int i = 0; i <= s.length()-1; i++){
            c[i] = stack.peek();
            stack.pop();
        }
        return String.valueOf(c);
    }

}
