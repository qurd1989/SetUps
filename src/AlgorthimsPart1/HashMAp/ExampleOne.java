package HashMAp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExampleOne {

    public static void main(String[] args) {

        Map<String, Integer> hs = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in).useDelimiter("^a-zA-Z]+");
        int lineCount = 0;
        while (sc.hasNext() && lineCount < 5) {
            String word = sc.next().toLowerCase();
            hs.put(word, hs.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : hs.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}