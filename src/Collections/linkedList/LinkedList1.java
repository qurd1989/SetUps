package Collections.linkedList;

import java.util.LinkedList;

public class LinkedList1 {


    public static void main(String[] args) {


        LinkedList<String> linkedList = new LinkedList<String>();

        System.out.println("Initial element of Linkedlist: " + linkedList);

        linkedList.add("Edu");
        linkedList.add("Eric");
        linkedList.add("Sam");

        System.out.println("After adding elements tot he list: " + linkedList);


        //adding elemet in specific position

        linkedList.add(0,"Dan");

        System.out.println(linkedList);

        LinkedList<String> linkedList1 = new LinkedList<String>();

        linkedList1.add("Susan");
        linkedList1.add("Hanumat");


        linkedList.addAll(1,linkedList1);

        System.out.println("After invoking addAll: ");

        System.out.println(linkedList);

    }
}
