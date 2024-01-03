package arrays;

import java.util.*;

public class ConvertArrayToArrayList {


    public static void main(String[] args) {

        String[] colors = {"Red", "Yellow", "Blue"};

        List list = Arrays.asList(colors);

        System.out.println(list);


        //Second method


        List<String> l = new ArrayList<String>();

        Collections.addAll(l, colors);

        System.out.println(list);




        //third method

        Collections.addAll(l, colors);
        System.out.println(l);

    }
}
