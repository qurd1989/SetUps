package Collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapEntries {


    public static void main(String[] args) {

        HashMap<String, Double> hm = new HashMap<>();

        hm.put("John Dor", 345.34);
        hm.put("Elmar Hur", 345.34);
        hm.put("Henry Bib", 345.34);
        hm.put("Setic  David", 345.34);
        hm.put("Jonson Bek", 345.34);

        //get set of the entries

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        //Display the set
        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }
        System.out.println();

        //Deposit 1000 into John  Doe`s account
        double balance = hm.get("John Dor");
        hm.put("John Dor", balance + 1000);

        System.out.println("John Dor`s account: " + hm.get("John Dor"));

    }


}
