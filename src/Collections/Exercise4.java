package Collections;

import java.awt.*;
import java.util.Stack;

public class Exercise4 {


    public static void main(String[] args) {

        Stack<Integer> stack  =  new Stack<>();

        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);



    }


    static void stack_push(Stack<Integer> stack){



        for (int i = 0; i< 5; i++){

            stack.push(i);
            System.out.println(i);

        }
    }

    static void stack_pop(Stack<Integer> stack ){

        System.out.println("Pop Operation: ");

        for (int i = 0 ; i < 5; i++) {

            Integer y = (Integer) stack.pop();

            System.out.println(y);
        }


    }
    static void stack_peek(Stack<Integer> stack){


        Integer element  = (Integer) stack.peek();

        stack.lastElement();

        System.out.println("Element on Stack  top: " + element);


    }

    static void stack_search(Stack<Integer> stack, int element) {

        Integer  pos = (Integer)  stack.search(element);

        if (pos == -1) {

            System.out.println("Element not found");

        }else {
            System.out.println("Element is found at position: " + pos);
        }


    }




}
