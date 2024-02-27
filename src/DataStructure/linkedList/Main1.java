package linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

    public static  class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public class LinkedList{
        Node head;
        Node tail;
        int size;
        void addLast(int val){
            Node temp = new Node(val);

            if (head == null){
                head = temp;

                tail = temp;
            }
        }
    }

    public void main(String[] args)  {


    }
}