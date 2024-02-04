package stacks;

public class Push {

    int max =5;
    int stack_arr[] = new int[max];
    int top = -1;
    public static void main(String[] args) {

        Push stack = new Push();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        for (int each : stack.stack_arr){
            System.out.println(each);
        }

    }

    void push(int data){
        if (top == max -1){
            System.out.println("Stack overflow");
            return;
        }
        top = top +1;
        stack_arr[top] = data;
    }
}
