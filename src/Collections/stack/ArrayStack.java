package Collections.stack;

import java.util.Stack;

public class ArrayStack<AnyTpe> extends Stack<AnyTpe> {
    private AnyTpe [] theArray;
    private int topOfStack;
    private static final int DEFAULT_CAPACITY = 10;
    public  ArrayStack(){
        theArray = (AnyTpe[]) new Object[DEFAULT_CAPACITY];
    }
    public  boolean isEmpty(){
        return topOfStack == -1;
    }
    public void makeEmpty(){
        topOfStack = -1;
    }



    public static void main(String[] args) {

    }
}
