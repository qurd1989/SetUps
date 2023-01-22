package Collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteration {


    public static void main(String[] args) {


        HashSet<String>  hashSet = new HashSet<>();

        hashSet.add("Elmar");
        hashSet.add("Edu");
        hashSet.add("Senan");
        hashSet.add("Hildar");
        hashSet.add("Miladr");

        System.out.println(hashSet);

        Iterator<String> iterator = hashSet.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }


    }
}
