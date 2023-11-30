package stacks;

import java.util.Stack;

public class Begginer {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(10);
        System.out.println(s);
        s.peek();
        System.out.println(s);
        s.push(12);
        System.out.println(s);
        s.pop();
        System.out.println(s);
    }
}
