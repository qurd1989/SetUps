package stacks;

import Collections.Stack;

public class Example1 {
    public static void main(String[] args) {

        Stack stack = new Stack();
        Stack stack1 = new Stack();
        for (int i = 0; i < 10; i++){
            stack.push(i);
        }
        for (int i = 0; i < 20; i++){
            stack1.push(i);
        }
        System.out.println("My stack: ");
        for (int i = 0; i < 10; i++){
            System.out.println(stack.pop());
        }
    }
}
