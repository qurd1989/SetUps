package linkedList;


import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;

 class Insert {
    Node head;
     static class Node {
         int data;
         Node next;
     }
     public static void print(Insert list){
         Node temp = list.head;
         while(temp != null){
             System.out.print(temp.data+" ");
             temp = temp.next;
         }
         return;
     }
     public void insertAtBeginning(int val){
         if(head==null){
             //Inserting First Node in the Linked List
             head = new Node();
             head.data = val;
         }else{
             //Creating New Node
             Node newNode = new Node();
             //Updating data of newNode
             newNode.data = val;
             //Updating the next variable of newNode as head
             newNode.next = head;
             //Updating newNode as head
             head = newNode;
         }
         return;
     }
 }

class Main{
    public static void main(String args[]) {
        Insert list = new Insert();
        list.insertAtBeginning(4);
        list.insertAtBeginning(3);
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);

        //Inserting 5 at the beginning of the Linked List
        list.insertAtBeginning(5);

        //Printing the Linked List
        list.print(list);
    }
}