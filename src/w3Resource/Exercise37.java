package w3Resource;

import java.util.*;

public class Exercise37 {


    public static void main(String[] args) {

        String  string = "Elmar";

        char[]  reverseString = string.toCharArray();

        
        List<Character> characters = new ArrayList<>();

        for (char c: reverseString) {
            characters.add(c);
        }
        Collections.reverse(characters);
        ListIterator listIterator = characters.listIterator();

        while (listIterator.hasNext()) {
            System.out.print(listIterator.next());


        }
    }
}
