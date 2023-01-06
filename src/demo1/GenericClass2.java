package demo1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericClass2 {

    public static void main(String[] args) {


        GenericClass1<Integer, String> gc1 = new GenericClass1(12, "Hello");


        int val1 = gc1.getItem1();

        String val2 = gc1.getItem2();

        Set<String> set1 = new HashSet<String>();

        set1.add("Elmar");
        set1.add("Edul");
        set1.add("Eldar");



        Set<String> set2 = new HashSet<String>();

        set2.add("Elmar");
        set2.add("Edul");
        set2.add("Zimbar");



        Set<String> result = union(set1, set2);


        Iterator itr = result.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

        public static <E> Set<E> union(Set<E> set1, Set<E> set2) {

        Set<E> result = new HashSet<E>(set1);
        result.addAll(set2);

        return result;








    }
}
