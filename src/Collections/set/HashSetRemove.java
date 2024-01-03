package Collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetRemove {


    public static void main(String[] args) {

        HashSet<Integer> hash = new HashSet<>() ;

        hash.add(12);
        hash.add(13);
        hash.add(14);
        hash.add(15);
        hash.add(17);


        //iterate hash
        Iterator i = hash.iterator();

        while (i.hasNext()){

            System.out.println(i.next());

        }
        hash.remove(13);


        //after remocing elemtn form hashset

        System.out.println(hash);


        HashSet<Integer> hash1 = new HashSet<>();

        hash1.add(21);
        hash1.add(22);
        hash1.add(33);
        hash1.add(24);
        hash1.add(25);

        hash.addAll(hash1);

        System.out.println(hash);


        hash.removeAll(hash1);

        System.out.println(hash);

        String str = "elmar";
        String str1 = "Elmar";

        System.out.println(str.equals(str1));

        System.out.println(str.hashCode());

        int n = 100;

        Integer intg  = Integer.valueOf("100");

        System.out.println(i.hashCode());




    }
}
