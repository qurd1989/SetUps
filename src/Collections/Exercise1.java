package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exercise1 {


    public static void main(String[] args) {


        listIterateDemo();
        searchElement();
        nullValueDemo();
        duplicateValue();
        replaceElement();


    }

    private static void nullValueDemo() {


        List<String> list = new ArrayList<>();

        list.add(null);
        list.add(null);
        System.out.println(list.toString());
    }


    public static void duplicateValue() {

        List<String> list = new ArrayList<String>();

        list.add("Elmar");
        list.add("Elmar");

        System.out.println(list.toString());

    }


    public  static void replaceElement(){

        List<String> list = new LinkedList<>();

        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");

        list.set(3, "Element 5");

        list.add(3, "Element 4");

        list.forEach(str -> System.out.println(" Set element 5 --" + str));

        list.remove(1);
        System.out.println("----------------------------");

        list.forEach(str -> System.out.println(" Set element 5 --" + str));
    }


    public static void searchElement() {


        List<String> list= new LinkedList<>();


        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");

        int search = list.lastIndexOf("Element 2");

        System.out.println(" search elemtn  at last Index 0 ---> " + search);


    }

    public static  void listIterateDemo() {

        List<String> list = new LinkedList<>();
        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 4");


        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()){

            String str = iterator.next();


            System.out.println("Forward Direction: " + str);



        }

        while (iterator.hasPrevious()){

            String str1 = iterator.previous();

            System.out.println("Backward direction " + str1);


        }

        for (ListIterator<String> iterator1 = list.listIterator(list.size()); iterator1.hasPrevious();){


            String t = iterator.previous();

            System.out.println(t);
        }




    }

}
