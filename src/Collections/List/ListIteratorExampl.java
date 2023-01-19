package Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExampl {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("Edu");
        list.add("Elmir");
        list.add("Sab");
        list.add("Tam");
        list.add("Sam");
        list.add("Vadik");

        ListIterator<String> itr = list.listIterator();

        System.out.println("Traversing elements in forward direction");

        while (itr.hasNext()){

            System.out.println("Index " + itr.nextIndex() + " value " + itr.next());

        }


        System.out.println("Traversing elements in backward direction");

        while (itr.hasPrevious()) {


            System.out.println("Index " + itr.previousIndex()+ " Value " + itr.previous());
        }


    }

}
