package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortList {

    public static void main(String[] args) {


        List<String>  list = new ArrayList<String>();

        list.add("Mango");
        list.add("Apple");
        list.add("Grapes");
        list.add("banana");
        list.add("date");


        for (String fruits: list) {

            System.out.println(fruits);
        }


        List<Integer> list1 = new LinkedList<>();


        list1.add(21);
        list1.add(13);
        list1.add(14);
        list1.add(155);
        list1.add(76);

        Collections.sort(list1);

        for (Integer integer: list1){

            System.out.println(integer);
        }
    }
}
