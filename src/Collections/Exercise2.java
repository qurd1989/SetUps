package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Exercise2 {

    public static void main(String[] args) {



        staff();
        int n = 5;

        Vector<Integer> v = new Vector<>(n);


        for (int i = 1; i < n; i++) {

            v.add(i);


            System.out.println(v);



            System.out.println(v);


        for (int j = 0; j < v.size(); j++)

            System.out.println(v.get(j) + " ");
    }


        }


        public static  void staff() {


            List<String> list = new LinkedList<String>();

            list.add("Amy");
            list.add("Bob");
            list.add("Carl");

            ListIterator<String> iter = list.listIterator();



            iter.next();
            System.out.println(list);

            iter.add("Juliet");
            System.out.println(list);


        }

}
