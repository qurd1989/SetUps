package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exercise3 {

    public static void main(String[] args) {


        contains();
        iterator();


    }


    public static void iterator() {


        List<String> list = new ArrayList<String>();

        list.add("Elmar");
        list.add("Hedish");
        list.add("Vedish");
        list.add("Candish");
        list.add("Duduush");
        list.add("handrish");

        ListIterator<String> iterator = list.listIterator();

        iterator.next();
        iterator.remove();

    }public  static void contains(){

        List<String> list = new LinkedList<String>();

        list.add("Elmar");
        list.add("Hedish");
        list.add("Vedish");
        list.add("Candish");
        list.add("Duduush");
        list.add("handrish");

        System.out.println(list.toString());

        System.out.println(list.contains("Elmar"));

        String obj = list.get(4);
        System.out.println(obj);


    }





}
