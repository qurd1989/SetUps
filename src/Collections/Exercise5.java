package Collections;

import static java.lang.System.exit;

 class Exercise5 {


    public static void main(String[] args) {



        StackUsingLinkedList obj =  new StackUsingLinkedList();

        obj.push(11);
        obj.push(12);
        obj.push(13);
        obj.push(14);

        obj.display();

        System.out.printf("\nTop element is %d\n", obj.peek());


        obj.pop();
        obj.pop();


        obj.display();

        System.out.printf("\nTop Element  is %d\n", obj.peek());
    }


    void inserationSort(int[] a, int n) {


    }

   static class StackUsingLinkedList {


        private class Node {

            int data;
            Node link;


        }

        Node top;

        StackUsingLinkedList() {


            this.top = null;


        }

        public void push(int x) {

            Node temp = new Node();


            if (temp == null) {

                System.out.println("\n Stack Overflow");
                return;
            }

            temp.data = x;
            temp.link = top;
            top = temp;

        }

        public boolean isEmpity() {

            return top == null;


        }

        public int peek() {

            if (!isEmpity()) {
                return top.data;

            } else {
                System.out.println("Stack is Empity");
                return -1;


            }
        }


        public void pop() {
            if (top == null){
                System.out.println("\nStack UnderFlow");
                return;
            }

           top = (top).link;


        }
        public  void display() {
            if (top == null) {
                System.out.println("\nStack Underflow");

                exit(1);
            }
            else {
                Node temp = top;

                while (temp != null) {

                    System.out.println(temp.data);

                    temp = temp.link;

                    if (temp != null) {
                        System.out.println(" --> ");
                    }
                }
            }
        }

    }


}

